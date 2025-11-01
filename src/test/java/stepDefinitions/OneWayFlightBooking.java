package stepDefinitions;


import org.openqa.selenium.WebDriver;

import cucumber8.Base.BaseClass;
import cucumber8.Base.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObjects;

public class OneWayFlightBooking extends BaseClass {
	
	
	String s ="India";
	String s1 ="BLR";
	String s2 = "HYD";
	int adult=3;
	int child = 3;
	String currency ="AED";
	 WebDriver driver = Hooks.base.driver;
	 HomePageObjects homePage = new HomePageObjects(driver);
//	@Given("user logins into QAClickJet webpage")
//	public void loginIntoQAClickJet()
//	{
//		launchUrl();
//	}
//	
//	@When("user is on home page")
//	public void verifyWhetherUserisinHomepage()
//	{
//		System.out.println("User is in home page");
//	}
		
	@Then("Enter Country name")
    public void select_country()
    {
		homePage.selectCountry(s);
    }

	@And("Select one way")
	public void Select_One_Way()
	{
		homePage.selectOneWayButton();
	}
	@Then("Select Depature city")
	public void Select_Depature_City()
	{
		homePage.selectDepCity(s1);
	}
//	    And Select "Arrival" City
	
	@And("Select Arrival City")
	public void Slect_Arrival_City()
	{
		homePage.selectArrCity(s2);
	}
	
//	    Then Select Depature date
//	@Then("Select Depature date")
//	public void Select_Departure_date()
//	{
//		homePage.selectDepdate();
//	}
//	    Then click on Passengers tab
//	@Then("click on Passengers tab")
//	public void click_on_Passengers_tab()
//	{
//		homePage.clickOnPassengers();
//	}
//	    And select Adults
	@And("select Adults")
	public void select_Adults()
	{
		homePage.add_Adult_Passengers(adult-1);
	}
//	    And select Childs and click on done
	@And("select Childs and click on done")
	public void select_Childs()
	{
		homePage.add_Child_Passengeters(child);
	}
//	    Then Select "Currency"
	@Then("Select Currency")
	public void select_currency()
	{
		homePage.selectCurrency(currency);
	}
//	    Then click on Search
//	@Then("click on Search")
//	public void click_on_Search()
//	{
//		
//	}

}
