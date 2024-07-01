package trademetests.UI_test.Motors;

import org.testng.Assert;
import org.testng.annotations.Test;
import testframe.base.UIBaseClass;
import testframe.pageobjects.CarsForSalePage;
import testframe.pageobjects.CarsListingPage;
import testframe.pageobjects.LandingPage;


public class MotorsPageTest extends UIBaseClass {

    private static final String FERRARI = "Ferrari";
    private static final String BMW = "BMW";
    private static final String HONDA = "Honda";
    private static final String MAZDA = "Mazda";

    @Test
    public void testNoOfFerrariMakes()
    {
        logger = extent.createTest("To verify no of Ferrari makes");
        given(" Land on landing page and click on Motors tab");
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickMotorsTab();
        CarsForSalePage carsForSalePage = new CarsForSalePage(driver);
        when(" Selects Ferrari make");
        carsForSalePage.selectCar(FERRARI);
        carsForSalePage.clickViewListings();
        then(" Search results shows the number listed fot that make");
        CarsListingPage carsListingPage = new CarsListingPage(driver);
        String results = carsListingPage.getSearchResults();
        Assert.assertTrue(getIntValue(results)>0);
        logger.info("No of Ferrari cars on the list: "+carsListingPage.getSearchResults());
    }
    @Test(description="This test validates that no of BMW cars returned is not equal to 0")
    public void testNoOfBMWMakes()
    {
        logger = extent.createTest("To verify no of BMW makes");
        given(" Land on landing page and click on Motors tab");
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickMotorsTab();
        CarsForSalePage carsForSalePage = new CarsForSalePage(driver);
        when(" Selects BMW make");
        carsForSalePage.selectCar(BMW);
        carsForSalePage.clickViewListings();
        then(" Search results shows the number listed fot that make");
        CarsListingPage carsListingPage = new CarsListingPage(driver);
        String results = carsListingPage.getSearchResults();
        Assert.assertTrue(getIntValue(results)>0);
        logger.info("No of BMW cars on the list: "+carsListingPage.getSearchResults());
    }

    @Test(description="This test validates that no of Mazda cars returned is not equal to 0")
    public void testNoOfMazdaMakes()
    {
        logger = extent.createTest("To verify no of Mazda makes");
        given(" Land on landing page and click on Motors tab");
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickMotorsTab();
        CarsForSalePage carsForSalePage = new CarsForSalePage(driver);
        when(" Selects Mazda make");
        carsForSalePage.selectCar(MAZDA);
        carsForSalePage.clickViewListings();
        then(" Search results shows the number listed fot that make");
        CarsListingPage carsListingPage = new CarsListingPage(driver);
        String results = carsListingPage.getSearchResults();
        Assert.assertTrue(getIntValue(results)>0);
        logger.info("No of Mazda cars on the list: "+carsListingPage.getSearchResults());
    }

    @Test(description="This test validates that no of Honda cars returned is not equal to 0")
    public void testNoOfHondaMakes()
    {
        logger = extent.createTest("To verify no of Honda makes");
        given(" Land on landing page and click on Motors tab");
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickMotorsTab();
        CarsForSalePage carsForSalePage = new CarsForSalePage(driver);
        when(" Selects Honda make");
        carsForSalePage.selectCar(HONDA);
        carsForSalePage.clickViewListings();
        then(" Search results shows the number listed fot that make");
        CarsListingPage carsListingPage = new CarsListingPage(driver);
        String results = carsListingPage.getSearchResults();
        Assert.assertTrue(getIntValue(results)>0);
        logger.info("No of Honda cars on the list: "+carsListingPage.getSearchResults());
    }


    private int getIntValue(String resultSring) {
        resultSring = resultSring.replace("Showing","")
                .replace("results","")
                .replace(",","")
                .replace(" ","");
        return Integer.parseInt(resultSring);
    }
}
