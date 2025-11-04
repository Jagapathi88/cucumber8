package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber8.Base.Hooks;
import io.cucumber.java.en.Given;
import pageObjects.GreenCartHomePage;

public class Greencart {
	
	WebDriver driver = Hooks.base.driver;
	GreenCartHomePage greenCart = new GreenCartHomePage(driver);
	String[] s = {"Brocolli","Carrot","Beans"};
	
    @Given("Add all the required items")
    public void Given_Add_all_the_required_items()
    {
    	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	for(String s1:s)
    	{
    		greenCart.addToCart(s1);
			System.out.println("feature1");
    	}
    	try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }



}
