package testframe.base;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import testframe.utils.ConfigLoader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

import org.testng.annotations.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import testframe.utils.DateUtil;

public abstract class UIBaseClass {

    protected WebDriver driver;
    protected ExtentSparkReporter spark;
    protected ExtentReports extent;
    protected ExtentTest logger;

    private static String PROPERTY_USER_DIR = "user.dir";

    @BeforeSuite
    public void startReport() {
        extent = new ExtentReports();
        String timeStamp = DateUtil.getDateInyyyyMMddhhmmssFormat();

        spark = new ExtentSparkReporter(System.getProperty(PROPERTY_USER_DIR) + "/target/ExtentReport."+timeStamp+".html");
        extent.attachReporter(spark);
        extent.setSystemInfo("Host Name", "Nilu Trade me project");
        extent.setSystemInfo("Environment", "");
        extent.setSystemInfo("User Name", "Nilu Herath");
        spark.config().setDocumentTitle("Nilu Trade me Project");
        spark.config().setReportName("Name of the Report Comes here ");
        spark.config().setTheme(Theme.STANDARD);
    }

    public static String getScreenShot(WebDriver driver, String screenshotName) throws IOException {
        String timeStamp = DateUtil.getDateInyyyyMMddhhmmssFormat();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String destination = System.getProperty(PROPERTY_USER_DIR) + "/Screenshots/" + screenshotName + timeStamp + ".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);
        return destination;
    }

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(ConfigLoader.getInstance().getBaseURL());
    }

    @AfterMethod
    public void getResult(ITestResult result) throws Exception{
        if(result.getStatus() == ITestResult.FAILURE){
            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
            String screenshotPath = getScreenShot(driver, result.getName());
            logger.fail("Test Case Failed Snapshot is below " + logger.addScreenCaptureFromPath(screenshotPath));
        }
        else if(result.getStatus() == ITestResult.SKIP){
            logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
        }
        else if(result.getStatus() == ITestResult.SUCCESS)
        {
            logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
        }
        driver.quit();
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
