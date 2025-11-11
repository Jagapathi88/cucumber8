package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbhiBus_BusSearchPageObjects {
	WebDriver driver;
	public AbhiBus_BusSearchPageObjects(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[text()='AC']")
	private WebElement AcFilter;
	
	@FindBy(xpath ="//span[text()='Bus Track']")
	private WebElement BusTractFilter;
	
	@FindBy(xpath ="//span[text()='Before 10 AM']")
	private WebElement before10AM;
	
	public void applyBusTypeFilter()
	{
		AcFilter.click();
		BusTractFilter.click();
	}
	
	public void applyDepartureTimeTypeFilter()
	{
		before10AM.click();
	}

}
