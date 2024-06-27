package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

//decides where report will land
public class ExtentManager {

    public static ExtentHtmlReporter htmlReporter;
    public static ExtentReports extent;
    public static ExtentTest test;

    public static void setExtent() {
         htmlReporter = new ExtentHtmlReporter(
                System.getProperty("user.dir") + "/target/"
                        + "TestExecutionReport"
                        + ".html");
        htmlReporter.loadXMLConfig(System.getProperty("user.dir")
                + "/extent-config.xml");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }




    //This method is to capture the screenshot and return the path of the screenshot.


    public static void endReport() {
        extent.flush();
    }
}
