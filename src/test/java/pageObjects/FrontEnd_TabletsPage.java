package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BasePage;

public class FrontEnd_TabletsPage extends BasePage {
    public FrontEnd_TabletsPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(xpath = "//h2[normalize-space()='Tablets']")
    public WebElement validateTabletsPage;
}
