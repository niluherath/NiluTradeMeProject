package UI_test.Login;

import Base.BaseClass;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import Utils.ConfigLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPageTest extends BaseClass {

    @org.testng.annotations.Test
    public void testLogin()  {
        logger = extent.createTest("To verify Trade me login");
        given(" Landing page pops up");
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickLogin();
        and(" Login page page pops up");
        LoginPage loginPage = new LoginPage(driver);
        System.out.println("....."+driver.getTitle());
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickLogin();
    }

}
