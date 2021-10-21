package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static sun.nio.cs.Surrogate.is;

public class GetPostSteps {
    @Given("I perform GET operation for {string}")
    public void iPerformGETOperationFor(String url) {
        given().contentType(ContentType.JSON);
    }

    @And("I perform GET for the post number {string}")
    public void iPerformGETForThePostNumber(String postNumber) {
        when().get(String.format("http://lovalhost:3000/posts/%s", postNumber)).
                then().body("author", is("Karthik KK"))
    }

    @Then("I should see the author name as {string}")
    public void iShouldSeeTheAuthorNameAs(String arg0) {
    }
}
