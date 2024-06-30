package Base;

import testframe.utils.ConfigLoader;
import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;
//import reports.ExtentManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.ITestResult;

public abstract class TradeMeBaseClass {

    protected WebDriver driver;
  //  ExtentManager extentManager;
    ITestResult result;

    public static ExtentTest test;

    @BeforeSuite
    public void beforeSuite() {
     //   extentManager.setExtent();
     //   System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");

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


    //2
  //  @BeforeTest
  //  public void launchBrowser()
 //   {
 //       System.out.println("Get driver");
  //      driver = new ChromeDriver();

  //  }
    //3
  //  @BeforeClass
 //   public void launchUrl(){
 //      System.out.println("Launch url");
  //      driver = new ChromeDriver();
  //      driver.manage().window().maximize();
  //      driver.navigate().to("https://www.trademe.co.nz/a/");

  //  }

    //4
    @BeforeMethod
    public void startDriver(){

        System.out.println("Start driver");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(ConfigLoader.getInstance().getBaseURL());

    }



    @AfterMethod
    public void stopDriver(){
        System.out.println("Stop driver");
        driver.quit();

    }

   // @AfterTest
 //   public void deleteAllCookies(){

  //      System.out.println("Delete all cookies");
  //      driver.manage().deleteAllCookies();
  //  }


   /// @AfterClass
   // public void closeBrowser(){

  //      System.out.println("Close browser");
 //       driver.close();
  //  }

    @AfterSuite
    public void afterSuite() {
     //   extentManager.endReport();

    }

}
