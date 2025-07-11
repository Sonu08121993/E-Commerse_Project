package testScenarios;

import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.FrontEnd_HomePage;
import testBase.BaseClass;

public class TS_01 extends BaseClass {
    @Test(groups = {"regression", "master"})
    public void TC_01() throws InterruptedException {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        testStarting();
        try {
            if (getText(fhPage.currency).equals("Currency")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.currency);

            if (getText(fhPage.currency_PoundSterling).equals("£Pound Sterling")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }
            if (getText(fhPage.currency_Euro).equals("€Euro")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.currency_USDollar).equals("$US Dollar")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.currency);

            if (getText(fhPage.phone).equals("123456789")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.myAccount).equals("My Account")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }
            click(fhPage.myAccount);

            if (getText(fhPage.myAccount_Register).equals("Register")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.myAccount_Login).equals("Login")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            click(fhPage.myAccount);

            if (getText(fhPage.wishList).equals("Wish List (0)")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.checkout).equals("Checkout")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.desktops).equals("Desktops")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.laptopsAndNotebooks).equals("Laptops & Notebooks")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.components).equals("Components")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.tablets).equals("Tablets")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.software).equals("Software")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.phonesAndPDAs).equals("Phones & PDAs")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.cameras).equals("Cameras")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.mp3Players).equals("MP3 Players")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }
            passed();
        } catch (Exception e) {
            failedException();
            Assert.fail();
        }
    }

    @Test(groups = "master")
    public void TC_02() {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        testStarting();
        try {

            if (getText(fhPage.featured).equals("Featured")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }
            passed();
        } catch (Exception e) {
            failedException();
            Assert.fail();
        }
    }

    @Test(groups = "master")
    public void TC_03() throws InterruptedException {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        testStarting();
        try {
            scrollBottom();
            if (getText(fhPage.information).equals("Information")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }
            if (getText(fhPage.termsAndConditions).equals("Terms & Conditions")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.aboutUs).equals("About Us")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.privacyPolicy).equals("Privacy Policy")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.customerService).equals("Customer Service")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.contactUs).equals("Contact Us")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.returns).equals("Returns")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.siteMap).equals("Site Map")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.extras).equals("Extras")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.brands).equals("Brands")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.giftCertificates).equals("Gift Certificates")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.affiliate).equals("Affiliate")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.specials).equals("Specials")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.myAccount_Footer).equals("My Account")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.orderHistory).equals("Order History")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.wishList_Footer).equals("Wish List")) {
                Assert.assertTrue(true);
            } else {
                failed();
                Assert.assertTrue(false);
            }

            if (getText(fhPage.newsletter).equals("Newsletter")) {
                Assert.assertTrue(true);
            } else {
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
