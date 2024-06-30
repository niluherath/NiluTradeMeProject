package testframe.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ServicesUtils {

    public static Response getNoOfFerrariMakes(){
        RestAssured.baseURI = "https://trademe.co.nz";
        RequestSpecification request = RestAssured.given().relaxedHTTPSValidation();
        request.header("accept","*/*" );
        request.header("accept-encoding:","gzip, deflate, br" );
        request.header("accept-language","en-US,en;q=0.9" );
        request.header("access-control-request-headers"," authorization,newrelic,x-trademe-uniqueclientid" );
        Response response = request.get("/a/motors/cars/ferrari/search?auto_category_jump=false");
        return response;


    }


}
