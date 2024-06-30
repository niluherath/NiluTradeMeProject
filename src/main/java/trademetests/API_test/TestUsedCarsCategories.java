package trademetests.API_test;

import testframe.utils.ServicesUtils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUsedCarsCategories {

    @Test
    public void testUsedCarsCategories(){
        // https://www.trademe.co.nz/a/motors/cars/ferrari/search?auto_category_jump=false
        Response response = ServicesUtils.getNoOfFerrariMakes();
        Assert.assertEquals(response.statusCode(), 200);
    }
}
