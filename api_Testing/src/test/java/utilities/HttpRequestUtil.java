package utilities;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class HttpRequestUtil {

    // Method to send a GET request
    public static Response sendGetRequest(String endpoint, RequestSpecification spec) {
        return given()
                .spec(spec)
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

    // Method to send a POST request
    public static Response sendPostRequest(String endpoint, String requestBody, RequestSpecification spec) {
        return given()
                .spec(spec)
                .body(requestBody)
                .when()
                .post(endpoint)
                .then()
                .extract()
                .response();
    }

    // Method to send a PUT request
    public static Response sendPutRequest(String endpoint, String requestBody, RequestSpecification spec) {
        return given()
                .spec(spec)
                .body(requestBody)
                .when()
                .put(endpoint)
                .then()
                .extract()
                .response();
    }

    // Method to send a DELETE request
    public static Response sendDeleteRequest(String endpoint, RequestSpecification spec) {
        return given()
                .spec(spec)
                .when()
                .delete(endpoint)
                .then()
                .extract()
                .response();
    }

}
