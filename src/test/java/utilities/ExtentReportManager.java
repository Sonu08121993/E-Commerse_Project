package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.ImageHtmlEmail;
import org.apache.commons.mail.resolver.DataSourceUrlResolver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import testBase.BaseClass;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ExtentReportManager implements ITestListener {

    public ExtentSparkReporter sparkReporter; //For UI of the report
    public ExtentReports extent; //For populating common info of the report
    public ExtentTest test; //For creating test case entries in the report and update status of the test methods

    String reportName;

    public String os;
    public String pathOfExtentReport;

    public void onStart(ITestContext testContext) {

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        reportName = "Test-Report - " + timeStamp + ".html";
        os = testContext.getCurrentXmlTest().getParameter("os");
        String browser = testContext.getCurrentXmlTest().getParameter("browser");
        if (os.equals("Windows 11")) {
            sparkReporter = new ExtentSparkReporter(".\\reports\\" + reportName);
        } else {
            sparkReporter = new ExtentSparkReporter("./reports/" + reportName);
        }

        sparkReporter.config().setDocumentTitle("OpenCart Automation Report");
        sparkReporter.config().setReportName("OpenCart Functional Testing");
        sparkReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter);
        extent.setSystemInfo("Application", "OpenCart");
        extent.setSystemInfo("Module", "FrontEnd Application");
        extent.setSystemInfo("User Name", System.getProperty("user.name"));
        extent.setSystemInfo("Environment", "Stage");

        extent.setSystemInfo("Operating System", os);
        extent.setSystemInfo("Browser Name", browser);

        List<String> includeGroups = testContext.getCurrentXmlTest().getIncludedGroups();
        if (!includeGroups.isEmpty()) {
            extent.setSystemInfo("Groups", includeGroups.toString());
        }

    }

    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getTestClass().getName() + " - " + result.getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.PASS, "Test case got passed : " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        test = extent.createTest(result.getTestClass().getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.FAIL, "Test case got failed : " + result.getName());
        test.log(Status.INFO, "Test case got failed due to : " + result.getThrowable().getMessage());

        try {
            String imgPath = new BaseClass().captureScreen(result.getName(), os);
            test.addScreenCaptureFromPath(imgPath);
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }

    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getTestClass().getName());
        test.assignCategory(result.getMethod().getGroups());
        test.log(Status.SKIP, "Test case got skipped : " + result.getName());
        test.log(Status.INFO, "Test case got skipped due to : " + result.getThrowable().getMessage());
    }

    public void onFinish(ITestContext testContext) {
        extent.flush();
        os = testContext.getCurrentXmlTest().getParameter("os");

        if (os.equals("Windows 11")) {
            pathOfExtentReport = System.getProperty("user.dir") + "\\reports\\" + reportName;
        } else {
            pathOfExtentReport = System.getProperty("user.dir") + "/reports/" + reportName;
        }
        File extentReport = new File(pathOfExtentReport);

        try {
            Desktop.getDesktop().browse(extentReport.toURI());
        } catch (IOException e2) {
            e2.printStackTrace();
        }

        try {
            URL url = new URL("file:///" + System.getProperty("user.dir") + "\\reports\\" + reportName);
            ImageHtmlEmail email = new ImageHtmlEmail();
            email.setDataSourceResolver(new DataSourceUrlResolver(url));
            email.setHostName("smtp.gmail.com");
            email.setSmtpPort(587);
            email.setTLS(true);
            email.setAuthenticator(new DefaultAuthenticator("test010.dz@gmail.com","Test0102@"));
            email.setSSLOnConnect(true);
            email.setFrom("test010.dz@gmail.com","Sonu Arya");
            email.setSubject("Test Report");
            email.setMsg("Please find the attachment...");
            email.addTo("sonuarya0893@gmail.com");
            email.attach(url,"extent report","Please check report..");
            email.send();
        } catch (IOException | EmailException e3) {
            e3.printStackTrace();

        }
    }
}
