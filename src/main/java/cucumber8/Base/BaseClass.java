package cucumber8.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public  WebDriver driver;
	public Properties p;
	public static String datePath;
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
	
	public void ScreenshotCode(String s)
	{
		if(datePath == null)
		{
			LocalDateTime myDateObj = LocalDateTime.now();
		    //System.out.println("Before formatting: " + myDateObj);
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");

		    datePath = myDateObj.format(myFormatObj);
		}
    	
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f, new File(System.getProperty("user.dir")+"/screenshot/"+datePath+"/"+s+"img.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		datePath = null;
	}

}
