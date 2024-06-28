package UI_test.Login;


import PageObjects.LandingPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LandingPageTest extends TradeMeBaseClass {


    @Test
    public void testLandingPage(){
        System.out.println("testing Landing Page");
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
