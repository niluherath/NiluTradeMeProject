package testframe.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ServicesUtils {

    public static Response getNoOfCarMakes(String carMake){
        RestAssured.baseURI = "https://api.trademe.co.nz";
        RequestSpecification request = RestAssured.given().relaxedHTTPSValidation();
        request.header("accept","*/*" );
        request.header("accept-encoding:","gzip, deflate, br" );
        request.header("accept-language","en-US,en;q=0.9" );
        request.header("access-control-request-headers"," authorization,newrelic,x-trademe-uniqueclientid" );
       // Response response = request.get("v1/searchoptions.json?dependent_value=Ferrari&key=used_car_model");
        Response response = request.get("v1/searchoptions.json?dependent_value="+carMake+"&key=used_car_model");

        return response;


    }


}
