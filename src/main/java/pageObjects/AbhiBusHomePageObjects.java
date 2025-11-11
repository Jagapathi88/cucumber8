package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbhiBusHomePageObjects {
	WebDriver driver;
	
	public AbhiBusHomePageObjects(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Buses']")
	WebElement busesButton;
	
	@FindBy(xpath = "//input[@placeholder='Leaving From']")
	WebElement leavingFrom;
	
	@FindBy(xpath = "//input[@placeholder='Going To']")
	WebElement goingTo;
	
	@FindBy(xpath = "//input[@placeholder='Onward Journey Date']")
	WebElement depatureDate;
	
	@FindBy(xpath = "//span[text()='Search']")
	WebElement searchButton;
	
	@FindBy(xpath ="//div[contains(@class,'container calendar')]")
	WebElement calender;
	
	@FindBy(xpath ="//div[contains(@class,'container calendar')]/div[contains(@class,'container date')]/a[contains(@class,'dark')]")
	WebElement currentDate;
	
	public void selectBuses()
	{
		busesButton.click();
	}
	
	
	public void selectLeavingFrom(String s)
	{
		leavingFrom.sendKeys(s);
		driver.findElement(By.xpath("//span[text()='"+s+"']")).click();
	}

	
	public void selectGoingTo(String s)
	{
		goingTo.sendKeys(s);
		driver.findElement(By.xpath("//span[text()='"+s+"']")).click();
	}
	
	public void selectDepartureDate()
	{
		depatureDate.click();
		currentDate.click();
	}
	public void selectDepartureDate1(String n)
	{
		depatureDate.click();
		driver.findElement(By.xpath("//div[contains(@class,'container calendar')]/div[contains(@class,'container date')]/a[text()='"+n+"']")).click();
	}
	
	public void clickOnSearch()
	{
		searchButton.click();
	}
}
