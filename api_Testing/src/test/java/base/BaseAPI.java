package base;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class BaseAPI {
    protected RequestSpecification REQUEST_SPEC;

    public BaseAPI() {
        // Set the base URI
        RestAssured.baseURI ="https://gorest.co.in/public";

        // Initialize the RequestSpecification and add the Authorization header
        REQUEST_SPEC = RestAssured.given().contentType("application/json").accept("application/json").auth().oauth2(getBearerToken());
    }

    // Method to retrieve the authorization Bearer token
    private String getBearerToken() {

        return "c8f2bb13cb27bfd10308d0daf87707ede276d6e833f54c820b3daaef06f4d2de";
    }



}
