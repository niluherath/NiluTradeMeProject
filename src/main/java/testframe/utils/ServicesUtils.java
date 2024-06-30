package testframe.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ServicesUtils {

    public static Response getMotorCatalogue(){
        RestAssured.baseURI = "https://api.trademe.co.nz";
        RequestSpecification request = RestAssured.given().relaxedHTTPSValidation();
        Response response = request.get("v1/Categories/UsedCars");
        return response;
    }


}
