package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

//decides where report will land


/**
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

    public void given(String given){
        test.info("<b>Given</b>"+given);
    }

    public void when(String when){
        test.info("<b>When</b>"+when);
    }

    public void and(String and){
        test.info("<b>And</b>"+and);
    }

    public void then(String then){
        test.info("<b>Then</b>"+then);
    }






    //This method is to capture the screenshot and return the path of the screenshot.


    public static void endReport() {
        extent.flush();
    }
}


 **/
