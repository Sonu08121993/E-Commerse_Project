package testScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.FrontEnd_ForgotPasswordPage;
import pageObjects.FrontEnd_HomePage;
import pageObjects.FrontEnd_LoginPage;
import testBase.BaseClass;

public class TS_07 extends BaseClass {
    @Test(groups = "master")
    public void TC_61() throws InterruptedException {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        FrontEnd_LoginPage flPage = new FrontEnd_LoginPage(driver);
        FrontEnd_ForgotPasswordPage fpPage = new FrontEnd_ForgotPasswordPage(driver);
        testStarting();
        try {
            click(fhPage.myAccount);
            click(fhPage.myAccount_Login);
            if (elementIsClickable(flPage.forgotPassword) == true) {
                logger.info("Forgot Password option is clickable");
                Assert.assertTrue(true);
            } else {
                logger.info("Forgot Password option is not clickable");
                failed();
                Assert.assertTrue(false);
            }
            click(flPage.forgotPassword);
            click(fpPage.forgot_Continue);
            if (getText(fpPage.warning).equals("Warning: The E-Mail Address was not found in our records, please try again!")) {
                logger.info("User got proper warning text");
                Assert.assertTrue(true);
            } else {
                logger.info("User did not get proper warning text");
                failed();
                Assert.assertTrue(false);
            }

        } catch (Exception e) {
            failed();
            Assert.fail();
        }
    }
}
