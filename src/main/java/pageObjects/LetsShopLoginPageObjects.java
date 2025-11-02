package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetsShopLoginPageObjects {
	WebDriver driver;
	
	public LetsShopLoginPageObjects(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='userEmail']")
	WebElement emailId;
	
	@FindBy(xpath = "//input[@id='userPassword']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='login']")
	WebElement SiginButton;
	
	public void login(String emailid, String passkey)
	{
		emailId.sendKeys(emailid);
		password.sendKeys(passkey);
		SiginButton.click();
	}
	
	

}
