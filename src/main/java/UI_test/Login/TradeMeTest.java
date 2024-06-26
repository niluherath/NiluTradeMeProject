package UI_test.Login;

import org.testng.annotations.*;

public class TradeMeTest {

    //1
    @BeforeSuite
    public void setChromeProperty(){
        System.out.println("set chrome property");
    }

    //2
    @BeforeTest
    public void launchBrowser(){
        System.out.println("Get driver");
    }
    //3
    @BeforeClass
    public void launchUrl(){
        System.out.println("Launch url");

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

    @AfterTest
    public void deleteAllCookies(){
        System.out.println("Delete all cookies");
    }


    @AfterClass
    public void closeBrowser(){

        System.out.println("Close browser");
    }

    @AfterSuite
    public void createTestReport(){
        System.out.println("Create test report");
    }








}
