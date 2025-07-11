package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BasePage;

public class FrontEnd_ShoppingCartPage extends BasePage {
    public FrontEnd_ShoppingCartPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(xpath = "//h1[normalize-space()='Shopping Cart']")
    public WebElement validateShoppingCartPage;
}
