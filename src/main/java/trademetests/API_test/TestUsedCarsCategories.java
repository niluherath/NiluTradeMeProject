package trademetests.API_test;

import io.restassured.path.json.JsonPath;
import testframe.utils.ServicesUtils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestUsedCarsCategories {

    @org.testng.annotations.Test
    public void testFerrariNoOfCars(){
        Response response = ServicesUtils.getNoOfCarMakes("Ferrari");
        Assert.assertEquals(response.statusCode(), 200);
        JsonPath jsonPathEvaluator = response.jsonPath();
        List<String>  carMakes = jsonPathEvaluator.getList("");
        System.out.println("Ferrari no of Cars: "+ carMakes.size());
       // return String.valueOf(carMakes.size());

    }

    @org.testng.annotations.Test
    public void testBMWNoOfCars(){
        Response response = ServicesUtils.getNoOfCarMakes("BMW");
        Assert.assertEquals(response.statusCode(), 200);
        JsonPath jsonPathEvaluator = response.jsonPath();
        List<String>  carMakes = jsonPathEvaluator.getList("");
        System.out.println("BMW no of Cars: "+ carMakes.size());
       // return String.valueOf(carMakes.size());

    }

    @org.testng.annotations.Test
    public void testHondaNoOfCars(){
        Response response = ServicesUtils.getNoOfCarMakes("Honda");
        Assert.assertEquals(response.statusCode(), 200);
        JsonPath jsonPathEvaluator = response.jsonPath();
        List<String>  carMakes = jsonPathEvaluator.getList("");
        System.out.println("Honda no  of Cars: "+ carMakes.size());
      //  return String.valueOf(carMakes.size());

    }

    @org.testng.annotations.Test
    public void testMazdaNoOfCars(){
        Response response = ServicesUtils.getNoOfCarMakes("Mazda");
        Assert.assertEquals(response.statusCode(), 200);
        JsonPath jsonPathEvaluator = response.jsonPath();
        List<String>  carMakes = jsonPathEvaluator.getList("");
        System.out.println("Mazda no of Cars: "+ carMakes.size());
      //  return String.valueOf(carMakes.size());

    }
}
