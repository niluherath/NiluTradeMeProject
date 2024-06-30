package trademetests.API_test;

import testframe.utils.ServicesUtils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUsedCarsCategories {

    @Test
    public void testUsedCarsCategories(){
        Response response = ServicesUtils.getMotorCatalogue();
        Assert.assertEquals(response.statusCode(), 200);

    }
}
