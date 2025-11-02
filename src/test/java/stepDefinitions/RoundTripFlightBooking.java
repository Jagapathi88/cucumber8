package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber8.Base.BaseClass;
import cucumber8.Base.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObjects;

public class RoundTripFlightBooking  {

	 WebDriver driver = Hooks.base.driver;
	HomePageObjects homepage = new HomePageObjects(driver);

//	@Given("user logins into QAClickJet webpage")
//	public void loginIntoHomePage() {
//		//launchUrl();
//	}
//
//	@When("user is on home page")
//	public void user_is_on_home_page() {
//		System.out.println("User is on home page");
//	}

	//@Then("Enter {string} name")
	@Then("^Enter \"([^\"]*)\" name$")
	public void enter_india_name(String s) {

		homepage.selectCountry(s);
	}

	@And("Select round trip")
	public void Select_round_trip() {

		homepage.clickOnRoundTrip();
	}

	@Then("Select {string} city")
	public void Select_Depature_city(String s1) {

		homepage.selectDepCity(s1);
	}

	@And("Select {string} City")
	public void Select_Arrival_City(String s2) {

		homepage.selectArrCity(s2);
	}

//	@Then("Select Depature date")
//	public void Select_Depature_date() {
//
//		homepage.selectDepdate();
//	}

	@Then("Select return date")
	public void Select_return_date() {

		homepage.selectArrdate();
	}

//	@Then("click on Passengers tab")
//	public void click_on_Passengers_tab() {
//
//		homepage.clickOnPassengers();
//	}

	@And("select {int} adults")
	public void selectAdult(int n1) {

		homepage.add_Adult_Passengers(n1);
		
	}

	@And("select {int} childs and click on done")
	public void selectChild(int n2) {

		homepage.add_Child_Passengeters(n2);
	}

	@Then("Select {string}")
	public void selectCurrency(String s5) {

		homepage.selectCurrency(s5);
	}

//	@Then("click on Search")
//	public void selectSearch() {
//
//		System.out.println("Clicked on search button");
//		//tearDown();
//		System.out.println("In feature file");
//		
//	}
}
