package POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.support.PageFactory;

public class Backtohomepage {
WebDriver driver;

public Backtohomepage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void navigateBack() throws InterruptedException { 
	
Navigation N=driver.navigate();	
	
	N.back();
	Thread.sleep(2000);//navigate to entrata.com
	
	N.back();
	Thread.sleep(2000);
}

}
