package UI_test.Login;

import testframe.base.BaseClass;
import PageObjects.LandingPage;
import PageObjects.LoginPage;

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
