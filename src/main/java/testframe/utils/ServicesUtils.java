package testframe.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ServicesUtils {
    private static final String ACCEPT = "accept";
    private static final String ACCEPT_ENCODING = "accept-encoding";
    private static final String ACCEPT_LANGUAGE = "accept-language";
    private static final String ACCESS_CONTROL_REQUEST_HEADERS = "access-control-request-headers";
    private static final String ACCEPT_HEADERS = "*/*";
    private static final String ACCEPT_ENCODING_HEADERS = "gzip, deflate, br";
    private static final String ACCEPT_LANGUAGE_HEADERS = "en-US,en;q=0.9";
    private static final String ACCESS_CONTROL_REQUEST_HEADERS_VALUES = "authorization,newrelic,x-trademe-uniqueclientid";


    public static Response getNoOfCarMakes(String carMake){
        RestAssured.baseURI = ConfigLoader.getInstance().getAPIBaseUrl();
        RequestSpecification request = RestAssured.given().relaxedHTTPSValidation();
        request.header(ACCEPT,ACCEPT_HEADERS);
        request.header(ACCEPT_ENCODING,ACCEPT_ENCODING_HEADERS);
        request.header(ACCEPT_LANGUAGE,ACCEPT_LANGUAGE_HEADERS);
        request.header(ACCESS_CONTROL_REQUEST_HEADERS,ACCESS_CONTROL_REQUEST_HEADERS_VALUES);
        Response response = request.get("v1/searchoptions.json?dependent_value="+carMake+"&key=used_car_model");
        return response;
    }


}
