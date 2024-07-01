package trademetests.API_test;

import io.restassured.path.json.JsonPath;
import testframe.base.APIBaseClass;
import testframe.utils.ServicesUtils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestUsedCarsCategories extends APIBaseClass {

    private static final String FERRARI = "Ferrari";
    private static final String BMW = "BMW";
    private static final String HONDA = "Honda";
    private static final String MAZDA = "Mazda";

    @org.testng.annotations.Test(description="This test validates that no of Ferrari cars returned is not equal to 0")
    public void testFerrariNoOfCars(){
        logger = extent.createTest("To verify no of Ferrari cars returned by searchOptions endpoint");
        given(" SearchOptions endpoint is called");
        Response response = ServicesUtils.getNoOfCarMakes(FERRARI);
        Assert.assertEquals(response.statusCode(), RESPONSE_CODE_200);
        JsonPath jsonPathEvaluator = response.jsonPath();
        when(" Endpoint returns no of cars");
        List<String>  carMakes = jsonPathEvaluator.getList("");
        then(" we validate the no of cars >0");
        Assert.assertTrue(carMakes.size()>0);
        logger.info("No of "+FERRARI+" cars: "+ carMakes.size());
    }

    @org.testng.annotations.Test(description="This test validates that no of BMW cars returned is not equal to 0")
    public void testBMWNoOfCars(){
        logger = extent.createTest("To verify no of BMW returned by searchOptions endpoint");
        given(" SearchOptions endpoint is called");
        Response response = ServicesUtils.getNoOfCarMakes(BMW);
        Assert.assertEquals(response.statusCode(), RESPONSE_CODE_200);
        JsonPath jsonPathEvaluator = response.jsonPath();
        when(" Endpoint returns no of cars");
        List<String>  carMakes = jsonPathEvaluator.getList("");
        then(" we validate the no of cars >0");
        Assert.assertTrue(carMakes.size()>0);
        logger.info("No of "+BMW+" cars: "+ carMakes.size());
    }

    @org.testng.annotations.Test(description="This test validates that no of Honda cars returned is not equal to 0")
    public void testHondaNoOfCars(){
        logger = extent.createTest("To verify no of Honda returned by searchOptions endpoint");
        given(" SearchOptions endpoint is called");
        Response response = ServicesUtils.getNoOfCarMakes(HONDA);
        Assert.assertEquals(response.statusCode(), RESPONSE_CODE_200);
        JsonPath jsonPathEvaluator = response.jsonPath();
        when(" Endpoint returns no of cars");
        List<String>  carMakes = jsonPathEvaluator.getList("");
        then(" we validate the no of cars >0");
        Assert.assertTrue(carMakes.size()>0);
        logger.info("No of "+HONDA+" cars: "+ carMakes.size());
    }

    @org.testng.annotations.Test(description="This test validates that no of Mazda cars returned is not equal to 0")
    public void testMazdaNoOfCars(){
        logger = extent.createTest("To verify no of Mazda returned by searchOptions endpoint");
        given(" SearchOptions endpoint is called");
        Response response = ServicesUtils.getNoOfCarMakes(MAZDA);
        Assert.assertEquals(response.statusCode(), RESPONSE_CODE_200);
        JsonPath jsonPathEvaluator = response.jsonPath();
        when(" Endpoint returns no of cars");
        List<String>  carMakes = jsonPathEvaluator.getList("");
        then(" we validate the no of cars >0");
        Assert.assertTrue(carMakes.size()>0);
        logger.info("No of "+MAZDA+" cars: "+ carMakes.size());
    }
}
