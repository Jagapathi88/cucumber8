package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber8.Base.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pageObjects.PracticePageObjects;

public class PracticePageIframePractice {
	
	WebDriver driver = Hooks.base.driver;
	
	PracticePageObjects practice = new PracticePageObjects(driver);
	
	@Given("Navigate to Practice page")
	public void Navigate_to_Practice_page()
	{
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	}
    @When ("User is in Navigate page go to Iframes section")
    public void go_to_Iframes_section() throws InterruptedException
    {
    	Thread.sleep(3000);
    	practice.goToIframe();
    }
   @Then("Click on Courses")
   public void Click_on_Courses()
   {
	   practice.clickCourses();
   }
   
   @Then ("Enter text in search")
   public void Enter_text_in_search() throws InterruptedException
   {
	   practice.entertextInSearch();
	   Thread.sleep(3000);
   }

}
