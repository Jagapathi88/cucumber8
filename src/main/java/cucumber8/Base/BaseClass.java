package cucumber8.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public  WebDriver driver;
	
	public void setupDriver()
	{
		driver = new ChromeDriver();
		
	}
	
	public void launchUrl()
	{
		//setupDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
	}

}
