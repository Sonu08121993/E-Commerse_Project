package testScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.FrontEnd_HomePage;
import pageObjects.FrontEnd_LoginPage;
import pageObjects.FrontEnd_MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TS_06 extends BaseClass {

    @Test(groups = {"datadriven","master"}, dataProvider = "LoginData", dataProviderClass = DataProviders.class) //TC_56, TC_57, TC_58, TC_59, TC_60
    public void TC_55_60(String email, String pwd, String exp) throws InterruptedException {
        logger.info("TC_55 t0 TC_60 starting");

        try {
            FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
            FrontEnd_LoginPage flPage = new FrontEnd_LoginPage(driver);
            FrontEnd_MyAccountPage fmPage = new FrontEnd_MyAccountPage(driver);
            click(fhPage.myAccount);
            click(fhPage.myAccount_Login);

            sendKeys(flPage.frontEndEmailAddress, email);
            sendKeys(flPage.frontEndPassword, pwd);
            click(flPage.frontEndLogin);

            boolean targetPage = fmPage.isMyAccountPageExists();


            if (exp.equalsIgnoreCase("valid")) {
                if (targetPage == true) {
                    click(fmPage.frontEndLogout);
                    Assert.assertTrue(true);
                } else {
                    Assert.assertTrue(false);
                }
            }
            if (exp.equalsIgnoreCase("invalid")) {
                if (targetPage == true) {
                    click(fmPage.frontEndLogout);
                    Assert.assertTrue(false);
                } else {
                    Assert.assertTrue(true);
                }
            }
        } catch (Exception e) {
            Assert.fail();
        }
        logger.info("TC_55 t0 TC_60 finished");

    }


}
