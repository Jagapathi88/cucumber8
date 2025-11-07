package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePageObjects {

	WebDriver driver;
	
	public PracticePageObjects(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//iframe[@id='courses-iframe']")
	WebElement iframe;
	
	@FindBy(xpath ="//ul[@class='navigation clearfix']/li/a[text()='Courses']")
	WebElement coursesTab;
	
	@FindBy(xpath ="//input[@id='heap_product-search']")
	WebElement searchProduct;
	
	public void goToIframe()
	{
		driver.switchTo().frame(iframe);
	}
	public void clickCourses()
	{
		coursesTab.click();
	}
	public void entertextInSearch()
	{
		searchProduct.sendKeys("Selen");
	}
}
