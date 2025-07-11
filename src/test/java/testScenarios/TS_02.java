package testScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.*;
import testBase.BaseClass;

public class TS_02 extends BaseClass {

    @Test(groups = {"sanity", "master"})
    public void TC_04() {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        testStarting();

        try {
            if (elementIsClickable(fhPage.currency) == true) {
                logger.info("Currency option is clickable");
                Assert.assertTrue(true);
            }else {
                logger.info("Currency option is not clickable");
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.currency);
            if (elementIsDisplayed(fhPage.currency_Euro) == true && elementIsClickable(fhPage.currency_Euro) == true) {
                logger.info("€Euro is visible and clickable");
                Assert.assertTrue(true);
            }else {
                logger.info("€Euro is not visible and clickable");
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.currency_Euro);
            if (elementIsDisplayed(fhPage.euro_Sign) == true) {
                logger.info("€ is selected and displaying on UI");
                Assert.assertTrue(true);
            }else{
                logger.info("€ is not selected and displaying on UI");
                failed();
                Assert.assertTrue(false);
            }
            passed();
        } catch (Exception e) {
            failed();
            Assert.fail();
        }
    }

    @Test(groups = "sanity")
    public void TC_05() {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        testStarting();

        try {
            click(fhPage.currency);
            if (elementIsDisplayed(fhPage.currency_USDollar) == true && elementIsClickable(fhPage.currency_USDollar) == true) {
                logger.info("$Dollar is visible and clickable");
                Assert.assertTrue(true);
            }else{
                logger.info("$Dollar is not visible and clickable");
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.currency_USDollar);
            if (elementIsDisplayed(fhPage.dollar_Sign) == true) {
                logger.info("$ is selected and displaying on UI");
                Assert.assertTrue(true);
            }else {
                logger.info("$ is not selected and displaying on UI");
                failed();
                Assert.assertTrue(false);
            }
            passed();
        } catch (Exception e) {
            failed();
            Assert.fail();
        }
    }

    @Test(groups = "master")
    public void TC_06() {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        testStarting();

        try {
            click(fhPage.currency);
            if (elementIsDisplayed(fhPage.currency_PoundSterling) == true && elementIsClickable(fhPage.currency_PoundSterling) == true) {
                logger.info("£Pound Sterling is visible and clickable");
                Assert.assertTrue(true);
            }else{
                logger.info("£Pound Sterling is not visible and clickable");
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.currency_PoundSterling);
            if (elementIsDisplayed(fhPage.pound_Sign) == true) {
                logger.info("£ is selected and displaying on UI");
                Assert.assertTrue(true);
            }else{
                logger.info("£ is not selected and displaying on UI");
                failed();
                Assert.assertTrue(false);
            }
            passed();
        } catch (Exception e) {
            failed();
            Assert.fail();
        }
    }

    @Test(groups = "master")
    public void TC_07() {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        FrontEnd_RegistrationPage frPage = new FrontEnd_RegistrationPage(driver);
        testStarting();

        try {
            if (elementIsClickable(fhPage.myAccount) == true) {
                logger.info("My Account option is clickable");
                Assert.assertTrue(true);
            }else{
                logger.info("My Account option is not clickable");
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.myAccount);
            if (elementIsDisplayed(fhPage.myAccount_Register) == true && elementIsClickable(fhPage.myAccount_Register) == true) {
                logger.info("Register option is visible and clickable");
                Assert.assertTrue(true);
            }else {
                logger.info("Register option is not visible and clickable");
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.myAccount_Register);
            if (elementIsDisplayed(frPage.registerAccountTitle) == true) {
                logger.info("User navigated to Registration page");
                Assert.assertTrue(true);
            }else {
                logger.info("User is not navigated to Registration page");
                failed();
                Assert.assertTrue(false);
            }
            passed();
        } catch (Exception e) {
            failed();
            Assert.fail();
        }
    }

    @Test(groups = "master")
    public void TC_08() {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        FrontEnd_LoginPage flPage = new FrontEnd_LoginPage(driver);
        testStarting();

        try {
            click(fhPage.myAccount);
            if (elementIsDisplayed(fhPage.myAccount_Login) == true && elementIsClickable(fhPage.myAccount_Login) == true) {
                logger.info("Login option is visible and clickable");
                Assert.assertTrue(true);
            }else {
                logger.info("Login option is not visible and clickable");
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.myAccount_Login);
            if (elementIsDisplayed(flPage.validateLoginPage) == true) {
                logger.info("User navigated to login page");
                Assert.assertTrue(true);
            }else {
                logger.info("User is not navigated to login page");
                failed();
                Assert.assertTrue(false);
            }
            passed();
        } catch (Exception e) {
            failed();
            Assert.fail();
        }
    }

    @Test(groups = "master")
    public void TC_09() {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        FrontEnd_LoginPage flPage = new FrontEnd_LoginPage(driver);
        FrontEnd_WishListPage fwPage = new FrontEnd_WishListPage(driver);
        testStarting();

        try {
            click(fhPage.myAccount);
            click(fhPage.myAccount_Login);
            sendKeys(flPage.frontEndEmailAddress, p.getProperty("frontEndEmailAddress"));
            sendKeys(flPage.frontEndPassword, p.getProperty("frontEndPassword"));
            click(flPage.frontEndLogin);

            if (elementIsClickable(fhPage.wishList) == true) {
                logger.info("Wishlist option is clickable");
                Assert.assertTrue(true);
            }else {
                logger.info("Wishlist option is not clickable");
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.wishList);
            if (elementIsDisplayed(fwPage.validateWishListPage) == true) {
                logger.info("User navigated to Wishlist page");
                Assert.assertTrue(true);
            }else {
                logger.info("User is not navigated to Wishlist page");
                failed();
                Assert.assertTrue(false);
            }
            passed();
        } catch (Exception e) {
            failed();
            Assert.fail();
        }
    }

    @Test(groups = "master")
    public void TC_10() {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        FrontEnd_LoginPage flPage = new FrontEnd_LoginPage(driver);
        FrontEnd_ShoppingCartPage fsPage = new FrontEnd_ShoppingCartPage(driver);
        testStarting();

        try {
            click(fhPage.myAccount);
            click(fhPage.myAccount_Login);
            sendKeys(flPage.frontEndEmailAddress, p.getProperty("frontEndEmailAddress"));
            sendKeys(flPage.frontEndPassword, p.getProperty("frontEndPassword"));
            click(flPage.frontEndLogin);

            if (elementIsClickable(fhPage.shoppingCart) == true) {
                logger.info("Shopping Cart option is clickable");
                Assert.assertTrue(true);
            }else {
                logger.info("Shopping Cart option is not clickable");
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.shoppingCart);
            if (elementIsDisplayed(fsPage.validateShoppingCartPage) == true) {
                logger.info("User navigated to Shopping Cart page on clicking shopping cart option");
                Assert.assertTrue(true);
            }else {
                logger.info("User is not navigated to Shopping Cart page on clicking shopping cart option");
                failed();
                Assert.assertTrue(false);
            }
            passed();
        } catch (Exception e) {
            failed();
            Assert.fail();
        }
    }

    @Test(groups = "master")
    public void TC_11() {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        FrontEnd_LoginPage flPage = new FrontEnd_LoginPage(driver);
        FrontEnd_ShoppingCartPage fsPage = new FrontEnd_ShoppingCartPage(driver);
        testStarting();

        try {
            click(fhPage.myAccount);
            click(fhPage.myAccount_Login);
            sendKeys(flPage.frontEndEmailAddress, p.getProperty("frontEndEmailAddress"));
            sendKeys(flPage.frontEndPassword, p.getProperty("frontEndPassword"));
            click(flPage.frontEndLogin);

            if (elementIsClickable(fhPage.checkout) == true) {
                logger.info("Checkout option is clickable");
                Assert.assertTrue(true);
            }else {
                logger.info("Checkout option is not clickable");
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.checkout);
            if (elementIsDisplayed(fsPage.validateShoppingCartPage) == true) {
                logger.info("User navigated to Shopping Cart page on clicking checkout option");
                Assert.assertTrue(true);
            }else {
                logger.info("User is not navigated to Shopping Cart page on clicking checkout option");
                failed();
                Assert.assertTrue(false);
            }
            passed();
        } catch (Exception e) {
            failed();
            Assert.fail();
        }
    }

    @Test(groups = "master")
    public void TC_12() {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        testStarting();

        try {
            if (elementIsClickable(fhPage.dashBoardTitle) == true) {
                logger.info("Page title option is clickable");
                Assert.assertTrue(true);
            }else {
                logger.info("Page title option is not clickable");
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.dashBoardTitle);
            if (elementIsDisplayed(fhPage.featured) == true) {
                logger.info("User navigated to dashboard page");
                Assert.assertTrue(true);
            }else {
                logger.info("User is not navigated to dashboard page");
                failed();
                Assert.assertTrue(false);
            }
            passed();
        } catch (Exception e) {
            failed();
            Assert.fail();
        }
    }

    @Test(groups = "master")
    public void TC_13() {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        testStarting();

        try {
            if (elementIsClickable(fhPage.itemsCartTotal) == true) {
                logger.info("Items option is clickable");
                Assert.assertTrue(true);
            }else {
                logger.info("Items option is not clickable");
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.itemsCartTotal);
            if (getText(fhPage.cartText).equals("Your shopping cart is empty!") ) {
                logger.info("The text matched");
                Assert.assertTrue(true);
            }else {
                logger.info("The text not matched");
                failed();
                Assert.assertTrue(false);
            }
            passed();
        } catch (Exception e) {
            failed();
            Assert.fail();
        }
    }

    @Test(groups = "master")
    public void TC_14() {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        FrontEnd_SearchPage fsePage = new FrontEnd_SearchPage(driver);
        testStarting();

        try {
            if (elementIsClickable(fhPage.serachIcon) == true) {
                logger.info("Search icon is clickable");
                Assert.assertTrue(true);
            }else {
                logger.info("Search icon is not clickable");
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.serachIcon);
            if (elementIsDisplayed(fsePage.validateSearchPage) == true) {
                logger.info("User navigated to search page");
                Assert.assertTrue(true);
            }else {
                logger.info("User is not navigated to search page");
                failed();
                Assert.assertTrue(false);
            }

            passed();
        } catch (Exception e) {
            failed();
            Assert.fail();
        }
    }

    @Test(groups = "master")
    public void TC_15() {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        FrontEnd_DesktopsPage fdPage = new FrontEnd_DesktopsPage(driver);
        testStarting();

        try {
            click(fhPage.desktops);
            int j = 1;
            for (int i = 0; i < fhPage.desktopOptions.size(); i++) {
                if (elementIsDisplayed(fhPage.desktopOptions.get(i)) == true && elementIsClickable(fhPage.desktopOptions.get(i)) == true) {
                    logger.info(j + " option is visible and clickable");
                    Assert.assertTrue(true);
                }else {
                    logger.info(j + " option is not visible and clickable");
                    failed();
                    Assert.assertTrue(false);
                }
                j++;
            }
            click(fhPage.desktopOptions.get(0));
            if (elementIsDisplayed(fdPage.pc) == true) {
                logger.info("User navigated to pc page");
                Assert.assertTrue(true);
            }else {
                logger.info("User is not navigated to pc page");
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.desktops);
            click(fhPage.desktopOptions.get(1));
            if (elementIsDisplayed(fdPage.mac) == true) {
                logger.info("User navigated to mac page");
                Assert.assertTrue(true);
            }else {
                logger.info("User is not navigated to mac page");
                failed();
                Assert.assertTrue(false);
            }
            passed();
        } catch (Exception e) {
            failed();
            Assert.fail();
        }
    }

    @Test(groups = "master")
    public void TC_16() {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        FrontEnd_TabletsPage ftPage = new FrontEnd_TabletsPage(driver);
        testStarting();

        try {
            if (elementIsClickable(fhPage.tablets) == true) {
                logger.info("Tablets option is clickable");
                Assert.assertTrue(true);
            }else {
                logger.info("Tablets option is not clickable");
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.tablets);
            if (elementIsDisplayed(ftPage.validateTabletsPage) == true) {
                logger.info("User navigated to Tablets page");
                Assert.assertTrue(true);
            }else {
                logger.info("User is not navigated to Tablets page");
                failed();
                Assert.assertTrue(false);
            }
            passed();
        } catch (Exception e) {
            failed();
            Assert.fail();
        }
    }


}
