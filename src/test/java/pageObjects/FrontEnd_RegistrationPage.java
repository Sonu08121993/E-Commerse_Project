package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BasePage;

public class FrontEnd_RegistrationPage extends BasePage {
    public FrontEnd_RegistrationPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(xpath = "//h1[normalize-space()='Register Account']")
    public WebElement registerAccountTitle;
}
