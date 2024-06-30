package trademetests.API_test;

import testframe.base.ServicesBaseClass;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUsedCarsCategories {

    @Test
    public void testUsedCarsCategories(){
        Response response = ServicesBaseClass.getMotorCatalogue();
        Assert.assertEquals(response.statusCode(), 200);

    }
}
