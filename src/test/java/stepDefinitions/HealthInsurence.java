package stepDefinitions;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.coverFox.DriverConfig.DriverFactory;
import com.coverFox.pages.CoverFoxAddressDetailsPage;
import com.coverFox.pages.CoverFoxHealthPlanPage;
import com.coverFox.pages.CoverFoxHomePage;
import com.coverFox.pages.CoverFoxMemberDetailsPage;
import com.coverFox.pages.CoverFoxResultPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HealthInsurence {
	
	CoverFoxHomePage coverFoxHomePage=new CoverFoxHomePage(DriverFactory.getDriver());
	CoverFoxHealthPlanPage coverFoxHealthPlanPage=new CoverFoxHealthPlanPage(DriverFactory.getDriver());
	CoverFoxMemberDetailsPage coverFoxMemberDetailsPage=new CoverFoxMemberDetailsPage(DriverFactory.getDriver());
	CoverFoxAddressDetailsPage coverFoxAddressDetailsPage=new CoverFoxAddressDetailsPage(DriverFactory.getDriver());
	CoverFoxResultPage coverFoxResultPage=new CoverFoxResultPage(DriverFactory.getDriver());
	SoftAssert softAssert =new SoftAssert();
	
	@Given("I am on Home Page")
	public void i_am_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I am on Home Page");
	}

	@When("I click on get Started button")
	public void i_click_on_get_started_button() throws InterruptedException {
		Thread.sleep(4000);
	    System.out.println("I click on get Started button");
	    coverFoxHomePage.clickOnGetStartedButton();
	}

	@When("I click on next button")
	public void i_click_on_next_button() throws InterruptedException {
		Thread.sleep(4000);
	    System.out.println("I click on next button");
	    coverFoxHealthPlanPage.clickOnNextButton();
	}

	@When("I provide age as {string} and click on next button")
	public void i_provide_age_as_and_click_on_next_button(String age) throws InterruptedException {
		Thread.sleep(4000);
	    System.out.println("I provide age as"+age+"click on next button");
	    coverFoxMemberDetailsPage.handleAgeDropDown(age);
	    coverFoxMemberDetailsPage.clickOnNextButton();
	    
	}

	@When("I provide pincode as {string} and mobNumber as {string} and click on continue button")
	public void i_provide_pincode_as_and_mob_number_as_and_click_on_continue_button(String pincode, String mobNumber) throws InterruptedException {
		Thread.sleep(4000);
	    System.out.println("I provide pincode as "+pincode+" mobNumber as "+mobNumber+" click on continue button");
	    coverFoxAddressDetailsPage.enterPinCode(pincode);
	    coverFoxAddressDetailsPage.enterMobNum(mobNumber);
	    coverFoxAddressDetailsPage.clickOnContinueButton();
	   //  Assert.fail();
	}

	@Then("matching Health Insurence Plans should be displayed as {string}")
	public void matching_health_insurence_plans_should_be_displayed_as(String expResult) throws InterruptedException {
		Thread.sleep(6000);
	    System.out.println("matching Health Insurence Plans should be displayed as "+expResult);
	    String actualResults = coverFoxResultPage.getMatchingResultNumber();
	    
	   // Reporter.log("Actual result is "+ result, true);
	    Assert.assertEquals(actualResults, expResult);
	}
	
	
}
