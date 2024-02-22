
package POMclasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class residentlogin {
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='https://www.residentportal.com']")
	private WebElement Residantlogin;
	
	@FindBy(xpath="//div[@class='start-button website-button']")
	private WebElement viewthewebsite;
	
	@FindBy(xpath="//INPUT[@id='name']")
	private WebElement contactuspage;
	
	public residentlogin (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	//TO VERIFY THAT RESIDENTLOGIN BUTTON IS ENABLE/CLICKABLE
		
	
	public void goIntoResidentLogin() {
		Residantlogin.click();
	}
	
	//TO VERIFY THAT VIEW THE WEBSITE BUTTON IS ENABLE/CLICKABLE
		
	public void clickonViewTheWebsites() {
		 viewthewebsite.click();
	}
	//SCROLL UPTO SPECIFIC CONTACT US FORM
	
	public void scrollUptoContactusPage() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", contactuspage );
	}
	}

