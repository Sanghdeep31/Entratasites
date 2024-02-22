package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class quitBrowser {
WebDriver driver;

public quitBrowser(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
}
	public void quitbrowser() {
		driver.quit();
	}
	
}
