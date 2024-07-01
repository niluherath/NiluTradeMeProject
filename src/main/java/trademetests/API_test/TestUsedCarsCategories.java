package trademetests.API_test;

import io.restassured.path.json.JsonPath;
import testframe.base.APIBaseClass;
import testframe.utils.ServicesUtils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestUsedCarsCategories extends APIBaseClass {

    @org.testng.annotations.Test
    public void testFerrariNoOfCars(){
        logger = extent.createTest("To verify no of Ferrari cars returned by searchOptions endpoint");
        when(" SearchOptions endpoint is called");
        Response response = ServicesUtils.getNoOfCarMakes("Ferrari");
        Assert.assertEquals(response.statusCode(), 200);
        JsonPath jsonPathEvaluator = response.jsonPath();
        then(" Endpoint returns no of cars");
        List<String>  carMakes = jsonPathEvaluator.getList("");
        Assert.assertTrue(carMakes.size()>0);
    }

    @org.testng.annotations.Test
    public void testBMWNoOfCars(){
        logger = extent.createTest("To verify no of BMW returned by searchOptions endpoint");
        when(" SearchOptions endpoint is called");
        Response response = ServicesUtils.getNoOfCarMakes("BMW");
        Assert.assertEquals(response.statusCode(), 200);
        JsonPath jsonPathEvaluator = response.jsonPath();
        then(" Endpoint returns no of cars");
        List<String>  carMakes = jsonPathEvaluator.getList("");
        Assert.assertTrue(carMakes.size()>0);
    }

    @org.testng.annotations.Test
    public void testHondaNoOfCars(){
        logger = extent.createTest("To verify no of Honda returned by searchOptions endpoint");
        when(" SearchOptions endpoint is called");
        Response response = ServicesUtils.getNoOfCarMakes("Honda");
        Assert.assertEquals(response.statusCode(), 200);
        JsonPath jsonPathEvaluator = response.jsonPath();
        then(" Endpoint returns no of cars");
        List<String>  carMakes = jsonPathEvaluator.getList("");
        Assert.assertTrue(carMakes.size()>0);
    }

    @org.testng.annotations.Test
    public void testMazdaNoOfCars(){
        logger = extent.createTest("To verify no of Mazda returned by searchOptions endpoint");
        when(" SearchOptions endpoint is called");
        Response response = ServicesUtils.getNoOfCarMakes("Mazda");
        Assert.assertEquals(response.statusCode(), 200);
        JsonPath jsonPathEvaluator = response.jsonPath();
        then(" Endpoint returns no of cars");
        List<String>  carMakes = jsonPathEvaluator.getList("");
        Assert.assertTrue(carMakes.size()>0);
    }
}
