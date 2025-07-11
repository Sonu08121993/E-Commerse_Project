package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BasePage;

public class FrontEnd_ForgotPasswordPage extends BasePage {

    public FrontEnd_ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement emailAddress;

   @FindBy(xpath = "//input[@value='Continue']")
    public WebElement forgot_Continue;

   @FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
    public WebElement warning;
}
