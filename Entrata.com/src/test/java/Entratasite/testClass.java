
package Entratasite;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POMclasses.Backtohomepage;
import POMclasses.Contactuspage;
import POMclasses.homepage;
import POMclasses.residentlogin;
import basepack.BaseClass;

public class testClass extends BaseClass {
//WebDriver driver;
homepage home;
residentlogin resident;
Contactuspage contact;
Backtohomepage back;


@BeforeClass
public void launchUrl() {
	//url LAUNCH
	
launchBrowser("chrome");
home=new homepage(driver);
resident=new residentlogin(driver);
contact=new Contactuspage(driver);
back=new Backtohomepage(driver);

	}
@BeforeMethod
public void homepage() {
	
System.out.println("before method run");
	
}
@Test
public void HomePagetst() throws InterruptedException, IOException {
	home.Entratahomepage();
	
	//TO VERIFY THE URL OF HOMEPAGE
	
	String expectedurl="https://www.entrata.com/";
	String Actualurl=driver.getCurrentUrl();
	SoftAssert soft=new SoftAssert();
	soft.assertEquals(Actualurl,expectedurl);
	System.out.println("continuing to second assert");
	
	//TO VERIFY THE TITLE OF HOMEPAGE
	
	String expectedtitle=("Property Management Software | Entrata");//
	String ActualTitle=driver.getTitle();
	soft.assertEquals(ActualTitle, expectedtitle);
	soft.assertAll();

	home.goIntoSignin();
	
	resident.goIntoResidentLogin();
	resident.clickonViewTheWebsites();
	resident.scrollUptoContactusPage();
	
	contact.enterName();
	contact.entermail();
	contact.enterPtopertyname();
	contact.enterPropertyurl();
	contact.selectCategeory();
	contact.entermessage();
	
//BACK TO HOMEPAGE

back.navigateBack();	

//VERIFY HOMEPAGE URL MATCH AS EXPECTED
	
	String expectedhomepageurl="https://www.entrata.com/";
	String actualurlhomepage=driver.getCurrentUrl();
	
	soft.assertEquals(actualurlhomepage,expectedhomepageurl);
	soft.assertAll();
	

	

	}
	
@AfterMethod
public void backtoHomepage(){ 
	

}
@AfterClass
public void quitBrowser() {
	driver.quit();
	
}

}

