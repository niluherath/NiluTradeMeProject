package UI_test.Login;


import Base.BaseClass;
import PageObjects.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LandingPageTest extends BaseClass {


    @org.testng.annotations.Test
    public void testLandingPage(){
        logger = extent.createTest("To verify Trade me Title");
        given("Landing page pops up");
        LandingPage landingPage = new LandingPage(driver);
    }

    // Forcefully failed this test as to verify listener.
    @Test
    public void TestToFail()
    {
        System.out.println("This method to test fail");
        Assert.assertTrue(false);
    }
}
