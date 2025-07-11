package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BasePage;

public class FrontEnd_DesktopsPage extends BasePage {
    public FrontEnd_DesktopsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//h2[normalize-space()='PC']")
    public WebElement pc;

    @FindBy(xpath = "//h2[normalize-space()='Mac']")
    public WebElement mac;

}
