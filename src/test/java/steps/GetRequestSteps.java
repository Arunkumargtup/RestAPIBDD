package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetRequestSteps {

	Response response;

	@Given("user has the necessary details to make a get call")
	public void user_has_the_necessary_details_to_make_a_get_call() {
		System.out.println("One");
		RestAssured.baseURI = "https://reqres.in/";
	}

	@When("user makes a get call to find the single user {int} details")
	public void user_makes_a_get_call_to_find_the_single_user_details(Integer intUserId) {
		response = given().when().get("api/users/" + intUserId);
	}

	@Then("user should get the {int} response along with user details")
	public void user_should_get_the_response_along_with_user_details(Integer intStatusCode) {
		System.out.println("Three");
		response.then().statusCode(intStatusCode);
	}

	@When("user makes a get call to find the List of users in page {int}")
	public void user_makes_a_get_call_to_find_the_list_of_users_in_page(Integer intPageNo) {
		response = given().when().get("api/users?page=" + intPageNo);
	}
}
