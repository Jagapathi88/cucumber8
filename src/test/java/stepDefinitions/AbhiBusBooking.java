package stepDefinitions;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber8.Base.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import pageObjects.AbhiBusHomePageObjects;
import pageObjects.AbhiBus_BusSearchPageObjects;

public class AbhiBusBooking {

	WebDriver driver = Hooks.base.driver;
	AbhiBusHomePageObjects bus = new AbhiBusHomePageObjects(driver);
	AbhiBus_BusSearchPageObjects busSearch = new AbhiBus_BusSearchPageObjects(driver);
	String leavingFrom ="Ameerpet";
	String goingTo = "Vijayawada";
	Method method;
	
	 @Given("User is in Abhi bus homepage")
	 public void homePage() {
		 driver.get("https://www.abhibus.com/");
	 }
	    @Then("User clicks on Buses option")
	    public void clickOnBusOption()
	    {
	    	bus.selectBuses();
	    }
	    @And ("enter leaving from and going to details")
	    public void enter_leaving_from_and_going_to_details()
	    {
	    	bus.selectLeavingFrom(leavingFrom);
	    	bus.selectGoingTo(goingTo);
	    }
	    @Then("select departure date")
	    public void select_departure_date()
	    {
	    	bus.selectDepartureDate();
	    }
	    @And ("Click on search button.")
	    public void click_on_search_button()
	    {
	    	bus.clickOnSearch();
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    @When("user is in bus search page")
	    public void verifyBusSearchPage()
	    {
	    	System.out.println("user is in bus search page");
	    }
	    @Then("click on bus type filters")
	    public void apply_bus_type_Filters()
	    {
	    	busSearch.applyBusTypeFilter();
	    }
	    @And("click on departure time type filter")
	    public void apply_departure_time_type_Filters() throws NoSuchMethodException, SecurityException
	    {
	    	busSearch.applyDepartureTimeTypeFilter();
	    	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	method = AbhiBusBooking.class.getDeclaredMethod("apply_departure_time_type_Filters");
	    	String methodName = method.getName();
	    	Hooks.base.ScreenshotCode(methodName);
	    }
	    @And("^enter \"([^\"]*)\" from and \"([^\"]*)\" to details$")
	    public void enter_details(String s1, String s2)
	    {
	    	bus.selectLeavingFrom(s1);
	    	bus.selectGoingTo(s2);
	    }
	    @Then("select {int} date")
	    public void enterDate(int n)
	    {
	    	bus.selectDepartureDate1(String.valueOf(n));

	    	System.out.println("master");

	    }
}
