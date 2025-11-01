package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePageObjects {
	public static WebDriver driver;

	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//String n;
	@FindBy(xpath = "//input[@id='autosuggest']")
	WebElement country;

	//WebElement selectCountry = driver.findElement(By.xpath("//ul[@id='ui-id-1']/li/a[text()='India']"));

	@FindBy(xpath = "//table[@id='ctl00_mainContent_rbtnl_Trip']/tbody/tr/td[1]")
	WebElement oneWay;
	@FindBy(xpath ="//input[@id='ctl00_mainContent_rbtnl_Trip_1']")
	WebElement RoundTrip;

	@FindBy(xpath = "//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")
	WebElement DepartureCity;
//	WebElement selectDepCity = driver.findElement(By.xpath(
//			"//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']/descendant::div[@class='dropdownDiv']/ul/li/a[@value='"
//					+ n + "']"));

	@FindBy(xpath = "//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")
	WebElement ArrivalCity;
//	WebElement selectArrCity = driver.findElement(By.xpath(
//			"//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']/descendant::div[@class='dropdownDiv']/ul/li/a[@value='"
//					+ n + "']"));

	@FindBy(xpath = "//input[@name='ctl00$mainContent$view_date1']/following-sibling::button[@class='ui-datepicker-trigger']")
	WebElement Depdate;

	@FindBy(xpath = "//div[@id='ui-datepicker-div']/descendant::tbody/tr/td[contains(@class,'ui-datepicker-current-day')]")
	WebElement currentdate;
	
	@FindBy(xpath ="//input[@id='ctl00_mainContent_view_date2']/following-sibling::button[@class='ui-datepicker-trigger']")
	WebElement Returndate;
	
	
	@FindBy(xpath ="//div[@id='divpaxinfo']")
	WebElement passengers;
	
	@FindBy(xpath ="//span[@id='hrefIncAdt']")
	WebElement adultPass;
	
	@FindBy(xpath ="//span[@id='hrefIncChd']")
	WebElement childPass;
	@FindBy(xpath ="//input[@value='Done']")
	WebElement done;
	
	@FindBy(xpath ="//select[@id='ctl00_mainContent_DropDownListCurrency']")
	WebElement currency;

	public void selectCountry(String countryName) {
		country.sendKeys(countryName);
		//selectCountry.click();
	}

	public void selectOneWayButton() {
		oneWay.click();
	}
	
	public void clickOnRoundTrip()
	{
		RoundTrip.click();
	}

	public void selectDepCity(String s) {
		DepartureCity.click();
		driver.findElement(By.xpath(
				"//div[@id='ctl00_mainContent_ddl_originStation1_CTNR']/descendant::div[@class='dropdownDiv']/ul/li/a[@value='"+ s + "']"))
				.click();
	}
	
	public void selectArrdate()
	{
		Returndate.click();
		currentdate.click();
	}

	public void selectArrCity(String s) {
		ArrivalCity.click();
		driver.findElement(By.xpath(
				"//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']/descendant::div[@class='dropdownDiv']/ul/li/a[@value='"
						+ s + "']"))
				.click();

	}

	public void selectDepdate()
	{
		
		currentdate.click();
	}
	
	public void clickOnPassengers() {
		passengers.click();
		
	}
	public void add_Adult_Passengers(int adult)
	{
		while(adult>0)
		{
			adultPass.click();
			adult--;
		}
		
	}
	
	public void add_Child_Passengeters(int child)
	{
		while(child>0)
		{
			childPass.click();
			child--;
		}
		done.click();
	}
	
	public void selectCurrency(String s)
	{
		
		  Select se =new Select(currency);
		  se.selectByValue(s);

	}
}
