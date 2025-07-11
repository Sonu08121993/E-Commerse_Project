package testBase;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;
    public Logger logger;
    public Properties p;
    public FileInputStream file;
    public String screenFilePath;

    @BeforeMethod(groups = {"sanity", "regression", "master", "datadriven"})
    @Parameters({"os", "browser"})
    public void setUp(String os, String browser) throws IOException {

        if (os.contains("Mac")) {
            file = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/data.properties");
        } else {
            file = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\data.properties");
        }

        p = new Properties();
        p.load(file);

        logger = LogManager.getLogger(this.getClass());

        if (p.getProperty("execution_env").equalsIgnoreCase("remote")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            //os
            if (os.equalsIgnoreCase("Windows 11")) {
                capabilities.setPlatform(Platform.WIN11);
            } else if (os.equalsIgnoreCase("linux")) {
                capabilities.setPlatform(Platform.LINUX);
            } else if (os.equalsIgnoreCase("mac")) {
                capabilities.setPlatform(Platform.MAC);
            } else {
                System.out.println("No matching os");
                return;
            }
            //browser

            switch (browser.toLowerCase()) {
                case "chrome":
                    capabilities.setBrowserName("chrome");
                    break;
                case "firefox":
                    capabilities.setBrowserName("firefox");
                    break;
                case "edge":
                    capabilities.setBrowserName("MicrsoftEdge");
                    break;
                case "safari":
                    capabilities.setBrowserName("safari");
                    break;
                default:
                    System.out.println("Invalid browser name");
                    return;
            }

            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
        } else if (p.getProperty("execution_env").equalsIgnoreCase("local")) {
            switch (browser.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    System.out.println("Invalid browser name");
                    return;
            }
        }

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(p.getProperty("FrontEndURL"));
        driver.manage().window().maximize();
    }


    @AfterMethod(groups = {"sanity", "regression", "master", "datadriven"})
    public void tearDown() {
        driver.quit();
    }

    public void scrollBottom() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        TimeUnit.MILLISECONDS.sleep(1000);
    }

    public void click(WebElement e) throws InterruptedException {
        e.click();
        TimeUnit.MILLISECONDS.sleep(1000);
    }

    public void sendKeys(WebElement e, String s) throws InterruptedException {
        e.sendKeys(s);
        TimeUnit.MILLISECONDS.sleep(1000);
    }

    public String getText(WebElement e) {
        return e.getText();
    }

    public boolean elementIsClickable(WebElement e) {
        return e.isEnabled();
    }

    public boolean elementIsDisplayed(WebElement e) {
        return e.isDisplayed();
    }

    public boolean elementIsSelected(WebElement e) {
        return e.isSelected();
    }

    public void failed() {
        logger.error(new Exception().getStackTrace()[1].getMethodName() + " Failed");
    }

    public void passed() {
        logger.info(new Exception().getStackTrace()[1].getMethodName() + " passed");
    }

    public void failedException() {
        logger.error(new Exception().getStackTrace()[1].getMethodName() + " Failed due to an exception");
    }

    public void testStarting() {
        logger.info(new Exception().getStackTrace()[1].getMethodName() + " starting");
    }

    public void mouseHover(WebElement e) {
        Actions ac = new Actions(driver);
        ac.moveToElement(e).build().perform();
    }

    @Parameters({"os"})
    public String captureScreen(String tName, String os) throws IOException {
        String timeStamnp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.SS").format(new Date());
        TakesScreenshot tekeScreenShot = (TakesScreenshot) driver;
        File sourceFile = tekeScreenShot.getScreenshotAs(OutputType.FILE);

        if (os.contains("Mac")) {
            screenFilePath = System.getProperty("user.dir") + "/screenshots" + tName + " " + timeStamnp + ".png";
        } else {
            screenFilePath = System.getProperty("user.dir") + "\\screenshots" + tName + " " + timeStamnp + ".png";
        }
        File targetFile = new File(screenFilePath);
        sourceFile.renameTo(targetFile);
        return screenFilePath;

    }

}
