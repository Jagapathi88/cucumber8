package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreenCartHomePage {
	WebDriver driver;
	
	public GreenCartHomePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@class='search-keyword']")
	WebElement searchButton;
	
	@FindBy(xpath ="//button[text()='ADD TO CART']")
	WebElement addToCartButton;
	
  @FindBy(xpath = "//div[@class='product']/h4[contains(text(),'Brocolli')]")
  WebElement addToCartForVegitable;
  
  public void addToCart(String s)
  {
	  driver.findElement(By.xpath("//div[@class='product']/h4[contains(text(),'"+s+"')]/following-sibling::div[@class='product-action']/button")).click();
  }
}
