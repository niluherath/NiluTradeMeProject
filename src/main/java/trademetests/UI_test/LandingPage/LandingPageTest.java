package trademetests.UI_test.LandingPage;


import testframe.base.UIBaseClass;
import testframe.pageobjects.LandingPage;
import org.openqa.selenium.By;
import org.testng.Assert;


public class LandingPageTest extends UIBaseClass {

    @org.testng.annotations.Test(description="This test validates the Trade me landing page title")
    public void testLandingPage()
    {
        logger = extent.createTest("To verify Trade me Title");
        given(" Landing page pops up");
        LandingPage landingPage = new LandingPage(driver);
        Assert.assertEquals(landingPage.getTitle(), "Buy & Sell on NZ's #1 Auction & Classifieds Site | Trade Me");
        logger.info("Gets the right Trade me landing page title");

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
