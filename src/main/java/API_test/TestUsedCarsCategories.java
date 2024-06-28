package API_test;

import Base.Services;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUsedCarsCategories {

    @Test
    public void testUsedCarsCategories(){
        Response response = Services.getMotorCatalogue();
        Assert.assertEquals(response.statusCode(), 200);

    }
}
