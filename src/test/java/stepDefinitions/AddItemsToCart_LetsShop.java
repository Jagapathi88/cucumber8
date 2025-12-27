package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber8.Base.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LetsShopHomePageObjects;
import pageObjects.LetsShopLoginPageObjects;

public class AddItemsToCart_LetsShop {
	
	WebDriver driver = Hooks.base.driver;
	LetsShopLoginPageObjects loginPage = new LetsShopLoginPageObjects(driver);
	LetsShopHomePageObjects homePage = new LetsShopHomePageObjects(driver);
	String[] s = {"ZARA COAT 3","ADIDAS ORIGINAL","iphone 13 pro"};
	@Given ("User is in Login Page of lets shop website")
	public void User_is_in_Login_Page_of_lets_shop_website()
	{
        System.out.println("User is in Login Page1");
	}
	
     @Then("user enters Username and password")
     public void enter_username_password()
     {
    	 loginPage.login("jagapathi016@gmail.com", "Jagapathi@161788");
     }
      @And("Clicks on signin button")
      public void signIn()
      {
    	  System.out.println("User clicks on Sign in button and login in sucessfully");
      }
     @When("user is on home page for Lets shop")
     public void user_is_on_home_page()
     {
    	 System.out.println("User is on home page");
     }
     @Then("user clicks on add to cart button for all the required items")
     public void addItemsToCart()
     {
    	 homePage.addItemToCart(s);
     }
    @And ("User clicks on cart button to navigate to Cart page")
    public void navigate_to_cart_page()
    {
    	homePage.clickOnCartButton();
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

}
