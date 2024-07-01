package trademetests.UI_test.Login;

import org.openqa.selenium.By;
import org.testng.Assert;
import testframe.base.UIBaseClass;
import testframe.pageobjects.HomePage;
import testframe.pageobjects.LandingPage;
import testframe.pageobjects.LoginPage;

public class LoginPageTest extends UIBaseClass {

    @org.testng.annotations.Test(description="This test validates successful login")
    public void testLogin()  {
        logger = extent.createTest("To verify Trade me login");
        given(" Landing page pops up");
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickLogin();
        and(" Login page page pops up");
        LoginPage loginPage = new LoginPage(driver);
        Assert.assertEquals(driver.findElement(By.xpath("//button[@value='login']")).getText(),"Log in");
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickLogin();
        driver.switchTo().parentFrame();
        logger.info("Successfully logs in");
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(homePage.getTitle(), "Log in | Trade Me");

    }
}
