package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BasePage;

public class FrontEnd_SearchPage extends BasePage {
    public FrontEnd_SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[normalize-space()='Search']")
    public WebElement validateSearchPage;
}
