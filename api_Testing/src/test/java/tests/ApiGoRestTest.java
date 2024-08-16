package tests;

import base.BaseAPI;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.HttpRequestUtil;

public class ApiGoRestTest extends BaseAPI {

    @Test
    public void testGetRequest() {
        String endpoint = "v2/users";

        // Ensure Accept header is correct
        REQUEST_SPEC.accept("application/json");
        Response response = HttpRequestUtil.sendGetRequest(endpoint, REQUEST_SPEC);

        // Print the actual status code and response body for debugging
        System.out.println("Actual Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.asString());

        Assert.assertEquals(response.getStatusCode(), 200);  // This line might be causing the error
    }


}
