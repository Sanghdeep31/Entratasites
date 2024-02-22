package basepack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
	public static WebDriver driver;
	
	public void launchBrowser(String Browser)
	{
	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aditi Mankar\\Downloads\\chromedriver-win32 (5)\\chromedriver-win32\\chromedriver.exe\\");
				
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("https://www.entrata.com/");
		
		}
	
	
}
