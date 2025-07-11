package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BasePage;

public class FrontEnd_MyAccountPage extends BasePage {
    public FrontEnd_MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    public WebElement myAccountHeader;

    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Logout']")
    public WebElement frontEndLogout;


    public boolean isMyAccountPageExists()
    {
        try {
            return (myAccountHeader.isDisplayed());
        }
        catch (Exception e)
        {
            return false;
        }
    }
}


