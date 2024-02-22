package POMclasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class homepage {
public WebDriver driver;
	
	@FindBy (xpath="//button[@id='rcc-confirm-button']")
	private WebElement Acceptcookies;
	
	@FindBy(xpath="(//a[@href='/sign-in'])[1]")
	private WebElement ClickonSignin;//
	
	public  homepage(WebDriver driver) {//contructor
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
		
	}
	
	//CLICK ON ACCEPT COOKIES BUTTON
	
	public void Entratahomepage(){
		 Acceptcookies.click();
		 }
	public void goIntoSignin() throws InterruptedException {
		
//TO CHECK WHETHER THE PAGE WILL SCROLL UP AND DOWN 
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)");//verify scroll down upto footer of home page
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(4000,0)");//verify scrollup upto header of the web page
		Thread.sleep(3000);
		ClickonSignin.click();
	
		
	}
}
