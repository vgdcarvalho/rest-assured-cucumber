package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;

public class GetPostSteps {
    @Given("I perform GET operation for {string}")
    public void iPerformGETOperationFor(String url) {
    }

    @And("I perform GET for the post number {string}")
    public void iPerformGETForThePostNumber(String postNumber) {
        BDDStyleMethod.SimpleGETPost(postNumber);
    }

    @Then("I should see the author name as {string}")
    public void iShouldSeeTheAuthorNameAs(String arg0) {
    }

    @Then("I should see the author names")
    public void iShouldSeeTheAuthorNames() {
        BDDStyleMethod.PerformContainsCollection();
    }

    @Then("I should verify the GET path parameter")
    public void iShouldVerifyTheGETParameter() {
        BDDStyleMethod.PerformPathParameter();
    }

    @Then("I should verify the GET query parameter")
    public void iShouldVerifyTheGETQueryParameter() {
        BDDStyleMethod.PerformQueryParameter();
    }
}
