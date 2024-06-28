package UI_test.Login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;
import reports.ExtentManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.ITestResult;

public class TradeMeBaseClass {

    protected WebDriver driver;
    ExtentManager extentManager;
    ITestResult result;

    @BeforeSuite
    public void beforeSuite() {
        extentManager.setExtent();

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
        driver.navigate().to("https://www.trademe.co.nz/a/");
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
        extentManager.endReport();

    }

}
