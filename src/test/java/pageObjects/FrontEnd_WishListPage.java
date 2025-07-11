package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BasePage;

public class FrontEnd_WishListPage extends BasePage {
   public FrontEnd_WishListPage(WebDriver driver)
   {
       super(driver);
   }
   @FindBy(xpath = "//h2[normalize-space()='My Wish List']")
    public WebElement validateWishListPage;
}
