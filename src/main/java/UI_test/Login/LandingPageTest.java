package UI_test.Login;


import Base.BaseClass;
import PageObjects.LandingPage;
import org.openqa.selenium.By;
import org.testng.Assert;


public class LandingPageTest extends BaseClass {


    @org.testng.annotations.Test
    public void testLandingPage()
    {
        logger = extent.createTest("To verify Trade me Title");
        given(" Landing page pops up");
        LandingPage landingPage = new LandingPage(driver);
    }

    @org.testng.annotations.Test
    public void testToFail()
    {
        logger = extent.createTest("To verify failing test");
        given(" We are purposely failing this test");
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickLogin();
        boolean img = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
        Assert.assertTrue(img);
    }
}
