package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BasePage;

public class FrontEnd_ItemDetailsPage extends BasePage {
    public FrontEnd_ItemDetailsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/h1")
    public WebElement itemDetails;
}
