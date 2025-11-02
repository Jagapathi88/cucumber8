package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetsShopHomePageObjects {
	WebDriver driver;

	public LetsShopHomePageObjects(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[contains(text(), 'HOME')]")
	WebElement homePageTab;
	
	@FindBy(xpath = "//button[contains(text(), 'ORDERS')]")
	WebElement ordersTab;
	
	@FindBy(xpath = "//button[contains(text(),'ORDERS')]/parent::li/following-sibling::li/button[contains(text(),'Cart')]")
	WebElement cartTab;
	
	@FindBy(xpath = "//button[contains(text(),' Sign Out ')]")
	WebElement signoutTab;

	@FindBy(xpath = "//button[contains(text(),'View')]")
	WebElement viewButton;

	@FindBy(xpath = "//button[contains(text(),'Add To Cart')]")
	WebElement addToCartButton;

	@FindBy(xpath = "//div[@class='card-body']")
	WebElement cartBody;
	
	@FindBy(xpath ="//div[@id ='toast-container']")
	WebElement toaster;

	public WebElement individualItemName(String itemName) {
		WebElement eleItemName = driver
				.findElement(By.xpath("//div[@class='card-body']/descendant::b[text()='" + itemName + "']"));
		return eleItemName;
	}

	public WebElement individualItemAddTocartButton(String itemName) {
		WebElement eleItemAddToCartButton = driver.findElement(By.xpath(
				"//div[@class='card-body']/descendant::b[text()='"+itemName+"']/parent::h5/following-sibling::button[text()=' Add To Cart']"));

		return eleItemAddToCartButton;
	}

	public void addItemToCart(String[] s)
	{
		for(String s1:s)
		{
			individualItemAddTocartButton(s1).click();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void clickOnHomeButton()
	{
		homePageTab.click();
	}
	
	public void clickOnCartButton()
	{
		cartTab.click();
	}
	
	public void clickOnOrdersButton()
	{
		ordersTab.click();
	}
	
	public void clickOnSignOutButton()
	{
		signoutTab.click();
	}
	
	public void clickOnViewButton()
	{
		viewButton.click();
	}
}
