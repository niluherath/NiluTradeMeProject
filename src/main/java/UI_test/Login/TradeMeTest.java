package UI_test.Login;

import org.testng.annotations.*;
import reports.ExtentManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.ITestResult;

public class TradeMeTest {

    WebDriver driver;
    ExtentManager extentManager;
    ITestResult result;

    @BeforeSuite
    public void beforeSuite() {
        extentManager.setExtent();
    }

    //1
    @BeforeSuite
    public void setChromeProperty(){

        System.out.println("set chrome property");
        System.setProperty("webdriver.chrome.driver", "C:\\chromeDriver\\chromedriver.exe");

    }

    //2
  //  @BeforeTest
  //  public void launchBrowser()
 //   {
 //       System.out.println("Get driver");
  //      driver = new ChromeDriver();

  //  }
    //3
    @BeforeClass
    public void launchUrl(){
        System.out.println("Launch url");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.trademe.co.nz/a/");

    }

    //4
    @BeforeMethod
    public void enterURL(){
        System.out.println("Log in");
    }



    @AfterMethod
    public void logOut(){
        System.out.println("Log out");

    }

   // @AfterTest
 //   public void deleteAllCookies(){

  //      System.out.println("Delete all cookies");
  //      driver.manage().deleteAllCookies();
  //  }


    @AfterClass
    public void closeBrowser(){

        System.out.println("Close browser");
        driver.close();
    }

    @AfterSuite
    public void afterSuite() {
        extentManager.endReport();

    }


}
