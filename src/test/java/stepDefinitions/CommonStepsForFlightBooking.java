package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber8.Base.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObjects;

public class CommonStepsForFlightBooking {
	WebDriver driver = Hooks.base.driver;
	HomePageObjects homePage = new HomePageObjects(driver);
	
	//Given user logins into QAClickJet webpage
	@Given("user logins into QAClickJet webpage")
	public void user_logins_into_QAClickJet_webpage()
	{
		
	}
    //When user is on home page
	@When("user is on home page")
	public void user_is_on_home_page()
	{
		
	}
	@Then("click on Passengers tab")
	public void click_on_Passengers_tab()
	{
		homePage.clickOnPassengers();
	}
	@Then("Select Depature date")
	public void Select_Departure_date()
	{
		homePage.selectDepdate();
	}
	@Then("click on Search")
	public void click_on_Search()
	{
		
	}

}
