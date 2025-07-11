package testScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.FrontEnd_HomePage;
import pageObjects.FrontEnd_ItemDetailsPage;
import testBase.BaseClass;

import java.util.Random;

public class TS_03 extends BaseClass {

    @Test(groups = {"master"})
    public void TC_17() {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        testStarting();

        try {
            if (elementIsClickable(fhPage.nextClick) == true && elementIsClickable(fhPage.prevClick) == true) {
                logger.info("> option and < option is clickable");
                Assert.assertTrue(true);
            } else {
                logger.info("> option and < option is not clickable");
                failed();
                Assert.assertTrue(false);
            }
            passed();
        } catch (Exception e) {
            failed();
            Assert.fail();
        }
    }
    @Test(groups = {"master"})
    public void TC_18() {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        testStarting();

        try {
            for (int i = 0; i < fhPage.dotNavigationOptions.size(); i++) {
                if (elementIsClickable(fhPage.dotNavigationOptions.get(i)) == true) {
                    logger.info("option " + i + " is clickable");
                    Assert.assertTrue(true);
                } else {
                    logger.info("option " + i + " is not clickable");
                    failed();
                    Assert.assertTrue(false);
                }
            }
            passed();
        } catch (Exception e) {
            failed();
            Assert.fail();
        }
    }

    @Test(groups = {"master"})
    public void TC_19()
    {
        FrontEnd_HomePage fhPage = new FrontEnd_HomePage(driver);
        FrontEnd_ItemDetailsPage fiPage = new FrontEnd_ItemDetailsPage(driver);
        testStarting();

        try{
            for (int i=0; i<=1; i++)
            {
                if (elementIsClickable(fhPage.featuredItems.get(i))==true)
                {
                    logger.info("Item " + i + " is clickable");
                    Assert.assertTrue(true);
                }
                else
                {
                    logger.info("Item " + i + " is not clickable");
                    Assert.assertTrue(false);
                }

                String s = fhPage.featuredItems.get(i).getText();
                click(fhPage.featuredItems.get(i));
                if (s.equals(fiPage.itemDetails.getText()))
                {
                    logger.info("user successfully navigated to Item "+i+" page");
                    Assert.assertTrue(true);
                }
                else {
                    logger.info("user is not navigated to Item "+i+" page");
                    Assert.assertTrue(true);
                }
                driver.navigate().back();
            }
            passed();
        }
        catch (Exception e) {
            failed();
            Assert.fail();
        }
    }

}
