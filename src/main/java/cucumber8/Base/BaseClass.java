package cucumber8.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public  WebDriver driver;
	public Properties p;
	public void setupDriver()
	{
		driver = new ChromeDriver();
		
	}
	
	public void launchUrl() throws IOException
	{
		//setupDriver();
		p = new Properties();
		File f = new File(System.getProperty("user.dir")+"\\src\\main\\java\\utils\\global.properties");
		FileInputStream src = new FileInputStream(f);
		p.load(src);
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.get("https://rahulshettyacademy.com/client/#/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
	}

}
