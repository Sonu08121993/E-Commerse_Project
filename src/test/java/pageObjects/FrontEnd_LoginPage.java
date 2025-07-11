package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BasePage;

public class FrontEnd_LoginPage extends BasePage {
    public FrontEnd_LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement frontEndEmailAddress;

    @FindBy(xpath = "//input[@id='input-password']")
    public WebElement frontEndPassword;

    @FindBy(xpath = "//input[@value='Login']")
    public WebElement frontEndLogin;

    @FindBy(xpath ="(//a[normalize-space()='Forgotten Password'])[1]")
    public WebElement forgotPassword;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement successMessage;

    @FindBy(xpath = "//ul[@class='breadcrumb']//a[normalize-space()='Login']")
    public WebElement validateLoginPage;

}
