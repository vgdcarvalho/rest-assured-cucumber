package utilities;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.net.URI;
import java.util.Map;

public class RestAssuranceExtension {

    public static RequestSpecification Request;

    public RestAssuranceExtension(){
        // Arrange
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBaseUri("http://localhost:3000");
        builder.setContentType(ContentType.JSON);
        var requestSpec = builder.build();
        Request = RestAssured.given().spec(requestSpec);
    }

    // Act Ops
    public static void GetOpsPathParameter(String url, Map<String, String> pathParams){
        Request.pathParam(pathParams);
        Request.get(new URI(url));
    }
}
