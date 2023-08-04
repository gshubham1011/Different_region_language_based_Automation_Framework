package TestCases;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import ConfigReader.ConfigPropReader;
import Factory.DriverFactory;
import Pages.LoyaltyPage;
import WebElement_Repository.SFDC_Loyalty_Elements;

public class SDFC_Loyalty_TestCases {

	DriverFactory df;
	ConfigPropReader cp;
	Properties prop;
	WebDriver driver;
	LoyaltyPage loyaltypage;
	
	Date date;
	SimpleDateFormat formatter;
	
	
	@BeforeTest
	public void setup() throws IOException {
		cp= new ConfigPropReader();
		prop= cp.initLangProp("Uk");
		df= new DriverFactory();
		driver=df.initDriver(prop);
		loyaltypage= new LoyaltyPage(driver);
		
	}
	
	@Test
	public void User_Registration() throws InterruptedException {
		date = new Date();
	    formatter = new SimpleDateFormat("ddMMyyyyHHmmss");
	    String datestring = formatter.format(date);
	    
		System.out.println(" user Registration ");
        SoftAssert assertion = new SoftAssert();
		System.out.println(" Set up Done "+prop.getProperty("Loylty_URL"));	
		driver.get(prop.getProperty("Loylty_URL"));
		
		DriverFactory.Artlogin.getloginCanon().click();
	    String LandingPageTitle= DriverFactory.Artlogin.getTitlePage().getText();
	    System.out.println(" Landing page titile :"+LandingPageTitle);
	    
	    assertion.assertEquals(LandingPageTitle, "Sign in with Canon ID" ," Canon Landing page title is not correct");
	    DriverFactory.Artlogin.getCreateaCanonIDAccount().click();
	    DriverFactory.Artlogin.getSignUpwithEmail().click();
	    assertion.assertEquals("Your details", DriverFactory.Artlogin.getYourDetails().getText()," Your Details title is not correct or Missing");
	    DriverFactory.Artlogin.getCreateMyAccount().click();
		assertion.assertEquals(DriverFactory.Artlogin.getmaterror().getText(), "Your first name is required"," Error Text is missing after without filling details ");
		DriverFactory.Artlogin.getRegFirstName().sendKeys("Test"+datestring);
		DriverFactory.Artlogin.getRegLastName().sendKeys("Test"+datestring);
		DriverFactory.Artlogin.getRegEmail().sendKeys("Test"+datestring+"@gmail.com");
	    DriverFactory.Artlogin.getPassword().sendKeys(datestring);
	    Thread.sleep(4000);
	    DriverFactory.js.executeScript("arguments[0].click();", DriverFactory.Artlogin.getCreateMyAccount());
	    DriverFactory.js.executeScript("arguments[0].click();", DriverFactory.Artlogin.getyesItisCorrectbutton());
	    DriverFactory.js.executeScript("arguments[0].click();", DriverFactory.Artlogin.getStayinTouchCheckbox());
	    DriverFactory.js.executeScript("arguments[0].click();", DriverFactory.Artlogin.getContinueButton());
	    DriverFactory.wait.until(ExpectedConditions.visibilityOf(loyaltypage.getSureLoginButtonElement(prop.getProperty("NoGoToMyAccount"))));
	    DriverFactory.js.executeScript("arguments[0].click();", loyaltypage.getSureLoginButtonElement(prop.getProperty("NoGoToMyAccount")));

	}
}
