package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CoverFoxCarBikeHealthInsurence {

	@Given("I am Home Page")
	public void i_am_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I am Home Page");
	}

	@When("I click on Car Insurence button")
	public void i_click_on_car_insurence_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I click on Car Insurence button");
	}

	@When("I provide valid RTO number and click on view quotes button")
	public void i_provide_valid_rto_number_and_click_on_view_quotes_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I provide valid RTO number and click on view quotes button");
	}

	@When("I provide valid details and click on view quotes button")
	public void i_provide_valid_details_and_click_on_view_quotes_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I provide valid details and click on view quotes button");
	}

	@Then("I should get plan details")
	public void i_should_get_plan_details() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I should get plan details");
	}

	@When("I click on Bike Insurence button")
	public void i_click_on_bike_insurence_button() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I click on Bike Insurence button");
	}
	
	@Given("I login to application")
	public void i_login_to_application() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I login to application");
	}
}
