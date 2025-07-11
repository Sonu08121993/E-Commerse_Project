package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BasePage;

import java.util.List;

public class FrontEnd_HomePage extends BasePage {

    public FrontEnd_HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[normalize-space()='Qafox.com']")
    public WebElement dashBoardTitle;

    //Header
    @FindBy(xpath = "(//span[normalize-space()='Currency'])[1]")
    public WebElement currency;

    @FindBy(xpath = "//strong[contains(text(),'€')]")
    public WebElement euro_Sign;

    @FindBy(xpath = "//strong[contains(text(),'$')]")
    public WebElement dollar_Sign;

    @FindBy(xpath = "//strong[contains(text(),'£')]")
    public WebElement pound_Sign;

    @FindBy(xpath = "//button[contains(text(),'€Euro')]")
    public WebElement currency_Euro;

    @FindBy(xpath = "//button[normalize-space()='£Pound Sterling']")
    public WebElement currency_PoundSterling;

    @FindBy(xpath = "//button[normalize-space()='$US Dollar']")
    public WebElement currency_USDollar;

    @FindBy(xpath = "//span[normalize-space()='123456789']")
    public WebElement phone;

    @FindBy(xpath = "//span[normalize-space()='My Account']")
    public WebElement myAccount;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    public WebElement myAccount_Register;

    @FindBy(xpath = "//a[normalize-space()='Login']")
    public WebElement myAccount_Login;

    @FindBy(xpath = "//span[normalize-space()='Wish List (0)']")
    public WebElement wishList;

    @FindBy(xpath = "//span[normalize-space()='Shopping Cart']")
    public WebElement shoppingCart;

    @FindBy(xpath = "//span[normalize-space()='Checkout']")
    public WebElement checkout;

    @FindBy(xpath = "//a[normalize-space()='Desktops']")
    public WebElement desktops;

     @FindBy(xpath = "//li[@class='dropdown open']//li")
     public List<WebElement> desktopOptions;

    @FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
    public WebElement laptopsAndNotebooks;

    @FindBy(xpath = "//a[normalize-space()='Components']")
    public WebElement components;

    @FindBy(xpath = "//a[normalize-space()='Tablets']")
    public WebElement tablets;

    @FindBy(xpath = "//a[normalize-space()='Software']")
    public WebElement software;

    @FindBy(xpath = "//a[normalize-space()='Phones & PDAs']")
    public WebElement phonesAndPDAs;

    @FindBy(xpath = "//a[normalize-space()='Cameras']")
    public WebElement cameras;

    @FindBy(xpath = "//a[normalize-space()='MP3 Players']")
    public WebElement mp3Players;

    @FindBy(xpath = "//span[@id='cart-total']")
    public WebElement itemsCartTotal;

    @FindBy(xpath = "//p[@class='text-center']")
    public WebElement cartText;

    @FindBy(xpath = "//i[@class='fa fa-search']")
    public WebElement serachIcon;

    // Body
    @FindBy(xpath = "//h3[normalize-space()='Featured']")
    public WebElement featured;

    @FindBy(xpath = "(//div[@class='swiper-button-next'])[2]")
    public WebElement nextClick;

    @FindBy(xpath = "(//div[@class='swiper-button-prev'])[2]")
    public WebElement prevClick;

    @FindBy(xpath = "(//span[@class='swiper-pagination-bullet'])")
    public List<WebElement> dotNavigationOptions;

    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div/div/div[2]/h4/a")
    public List<WebElement> featuredItems;



    // Footer
    @FindBy(xpath = "//h5[normalize-space()='Information']")
    public WebElement information;

    @FindBy(xpath = "//a[normalize-space()='Terms & Conditions']")
    public WebElement termsAndConditions;

    @FindBy(xpath = "//a[normalize-space()='About Us']")
    public WebElement aboutUs;

    @FindBy(xpath = "//a[normalize-space()='Privacy Policy']")
    public WebElement privacyPolicy;

    @FindBy(xpath = "//h5[normalize-space()='Customer Service']")
    public WebElement customerService;

    @FindBy(xpath = "//a[normalize-space()='Contact Us']")
    public WebElement contactUs;

    @FindBy(xpath = "//a[normalize-space()='Returns']")
    public WebElement returns;

    @FindBy(xpath = "//a[normalize-space()='Site Map']")
    public WebElement siteMap;

    @FindBy(xpath = "//h5[normalize-space()='Extras']")
    public WebElement extras;

    @FindBy(xpath = "//a[normalize-space()='Brands']")
    public WebElement brands;

    @FindBy(xpath = "//a[normalize-space()='Gift Certificates']")
    public WebElement giftCertificates;

    @FindBy(xpath = "//a[normalize-space()='Affiliate']")
    public WebElement affiliate;

    @FindBy(xpath = "//a[normalize-space()='Specials']")
    public WebElement specials;

    @FindBy(xpath = "//h5[normalize-space()='My Account']")
    public WebElement myAccount_Footer;

    @FindBy(xpath = "//a[normalize-space()='Order History']")
    public WebElement orderHistory;

    @FindBy(xpath = "//a[normalize-space()='Wish List']")
    public WebElement wishList_Footer;

    @FindBy(xpath = "//a[normalize-space()='Newsletter']")
    public WebElement newsletter;
}


