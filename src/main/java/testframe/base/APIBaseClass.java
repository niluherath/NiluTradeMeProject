package testframe.base;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import testframe.utils.ConfigLoader;
import testframe.utils.DateUtil;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class APIBaseClass {

    public WebDriver driver;
    public ExtentSparkReporter spark;
    public ExtentReports extent;
    public ExtentTest logger;
    private static DateUtil dateUtil;

    @BeforeSuite
    public void startReport() {
        extent = new ExtentReports();
        dateUtil = new DateUtil();
        String dateName = dateUtil.getDateInyyyyMMddhhmmssFormat();
        spark = new ExtentSparkReporter(System.getProperty("user.dir") + "/target/ExtentReport."+dateName+".html");
        extent.attachReporter(spark);
        extent.setSystemInfo("Host Name", "Nilu Trade me project");
        extent.setSystemInfo("Environment", "");
        extent.setSystemInfo("User Name", "Nilu Herath");
        spark.config().setDocumentTitle("Nilu Trade me Project");
        spark.config().setReportName("Name of the Report Comes here ");
        spark.config().setTheme(Theme.STANDARD);
    }

    @BeforeMethod
    public void setup() {
       // driver.navigate().to(ConfigLoader.getInstance().getBaseURL());
    }

    @AfterMethod
    public void getResult(ITestResult result) {
        if(result.getStatus() == ITestResult.FAILURE){
            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
        }
        else if(result.getStatus() == ITestResult.SKIP){
            logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
        }
        else if(result.getStatus() == ITestResult.SUCCESS)
        {
            logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
        }
    }

    public void given(String given){

        logger.info("<b>Given</b>"+given);
    }

    public void when(String when){
        logger.info("<b>When</b>"+when);
    }

    public void and(String and){
        logger.info("<b>And</b>"+and);
    }

    public void then(String then){
        logger.info("<b>Then</b>"+then);
    }

    @AfterSuite
    public void endReport() {
        extent.flush();
    }

}
