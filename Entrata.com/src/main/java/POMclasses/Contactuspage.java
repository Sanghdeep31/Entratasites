package POMclasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactuspage {
WebDriver driver;

@FindBy(xpath="//input[@name='customer[name]']")
private WebElement name;

@FindBy(xpath="//input[@id='email']")
private WebElement gmail;

@FindBy(xpath="//input[@id='property_name']")
private WebElement propertyname;

@FindBy(xpath="//input[@id='property_url']")
private WebElement propertyurl;

@FindBy(xpath="//select[@id='category']")
private WebElement categeory;

@FindBy(xpath="//textarea[@id='message']")
private WebElement message;



public Contactuspage(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);	
}
//TO VERIFY ALL THE TAB OF CONTACTUSPAGE

public void enterName() {
	name.sendKeys("saurabh");
}
public void entermail() {
	gmail.sendKeys("saurabh123@gmail.com");
}
public void enterPtopertyname() throws InterruptedException, IOException {
	
	propertyname.sendKeys("entrata");
	Thread.sleep(2000);
}
public void enterPropertyurl() throws InterruptedException {

	propertyurl.sendKeys("www.entrata.com");
	Thread.sleep(2000);
}
public void selectCategeory() throws InterruptedException {
	
	categeory.click();
	Thread.sleep(1000);
	Actions act=new Actions(driver);
     act.sendKeys(Keys.ARROW_DOWN,Keys.ALT).build().perform();
Thread.sleep(2000);
}  
public void entermessage () {	
	message.sendKeys("its awesome experience");
	
}
	


public void backToHomepage() throws InterruptedException, IOException {
//	Navigation N=driver.navigate();	
//	
//	N.back();
//	Thread.sleep(2000);//navigate to entrata.com
//	
//	N.back();
//	Thread.sleep(2000);
//	
//File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//File dest=new File("C:\\Users\\Aditi Mankar\\Desktop\\Screenshot.png\\");
//FileHandler.copy(source, dest);
}

}



