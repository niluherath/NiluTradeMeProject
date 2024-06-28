package Base;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Services {

    public static Response getMotorCatalogue(){
        RestAssured.baseURI = "https://api.trademe.co.nz";
        RequestSpecification request = RestAssured.given().relaxedHTTPSValidation();
        Response response = request.get("v1/Categories/UsedCars");
        return response;
    }


}
