package Login;

import Listeners.CustomisedListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class LandingPageTest extends TradeMeTest {


    @Test
    public void testLandingPage(){
        System.out.println("testing Landing Page");
    }

    // Forcefully failed this test as to verify listener.
    @Test
    public void TestToFail()
    {
        System.out.println("This method to test fail");
        Assert.assertTrue(false);
    }
}
