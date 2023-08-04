package TestCases;

import static org.testng.Assert.expectThrows;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.mongodb.util.Util;

import Utils.CommonUtils;
import Utils.util;
import WebElement_Repository.SFDC_Loyalty_Elements;
import io.netty.util.internal.SystemPropertyUtil;

public class SFDC_Loyalty extends util{
     
	CommonUtils commonUtils = new CommonUtils();
	Date date;
	SimpleDateFormat formatter;
	@Test
	public void User_Registration() throws Exception {
		date = new Date();
	    formatter = new SimpleDateFormat("ddMMyyyyHHmmss");
	    String datestring = formatter.format(date);
	    
		System.out.println(" user Registration ");
        SoftAssert assertion = new SoftAssert();
		System.out.println(" Set up Done "+commonUtils.readPropertyFile("Loylty_URL"));		
	    driver.get(commonUtils.readPropertyFile("Loylty_URL"));
	    Artlogin.getloginCanon().click();
	    String LandingPageTitle= Artlogin.getTitlePage().getText();
	    assertion.assertEquals(LandingPageTitle, "Sign in with Canon ID" ," Canon Landing page title is not correct");
	    Artlogin.getCreateaCanonIDAccount().click();
	    Artlogin.getSignUpwithEmail().click();
	    assertion.assertEquals("Your details", Artlogin.getYourDetails().getText()," Your Details title is not correct or Missing");
		Artlogin.getCreateMyAccount().click();
		assertion.assertEquals(Artlogin.getmaterror().getText(), "Your first name is required"," Error Text is missing after without filling details ");
	    Artlogin.getRegFirstName().sendKeys("Test"+datestring);
	    Artlogin.getRegLastName().sendKeys("Test"+datestring);
	    Artlogin.getRegEmail().sendKeys("Test"+datestring+"@gmail.com");
	    Artlogin.getPassword().sendKeys(datestring);
	    Thread.sleep(4000);
	    js.executeScript("arguments[0].click();", Artlogin.getCreateMyAccount());
	    js.executeScript("arguments[0].click();", Artlogin.getyesItisCorrectbutton());
	    js.executeScript("arguments[0].click();", Artlogin.getStayinTouchCheckbox());
	    js.executeScript("arguments[0].click();", Artlogin.getContinueButton());
	    wait.until(ExpectedConditions.visibilityOf(Artlogin.getSureLetDoIt()));
	    js.executeScript("arguments[0].click();", Artlogin.getSureLetDoIt());
	    js.executeScript("arguments[0].scrollIntoView(true);", SFDC_Loyalty_Elements.SkipButton);
	    js.executeScript("arguments[0].click();", Artlogin.getSkipButton());
	    js.executeScript("arguments[0].scrollIntoView(true);", SFDC_Loyalty_Elements.continueButton);
	    js.executeScript("arguments[0].click();", Artlogin.getcontinueButton());
	    Thread.sleep(4000);
	    assertion.assertEquals(1,Artlogin.getProductName().size()," Product name Field is missing register a new Product page");
	    assertion.assertEquals(1,Artlogin.getSerialNumber().size()," Serial Number Field is missing register a new Product page");
	    js.executeScript("arguments[0].scrollIntoView(true);", SFDC_Loyalty_Elements.Other.get(0));
	    assertion.assertEquals(1,Artlogin.getSelectTheCountryofPurchase().size()," Select The country of purchase Field is missing register a new Product page");
	    assertion.assertEquals(1,Artlogin.getSelectyourDealer().size()," Select your Dealer Field is missing register a new Product page");
	    assertion.assertEquals(1,Artlogin.getOther().size()," Other Field is missing register a new Product page");
	    assertion.assertEquals(1,Artlogin.getpurchaseDate().size()," Purchase Date Field is missing register a new Product page");
	    assertion.assertEquals(1,Artlogin.getproofofpurchse().size()," Proof of purchse Field is missing register a new Product page");
        assertion.assertEquals(false,Artlogin.getRegisterNow().isEnabled());
        
	    js.executeScript("arguments[0].scrollIntoView(true);", SFDC_Loyalty_Elements.ProductName.get(0));
	    Thread.sleep(2000);
	    Artlogin.getProductNameInput().sendKeys("EOS-1N");
	    Artlogin.getEOSIN().click();
	    js.executeScript("arguments[0].scrollIntoView(true);", Artlogin.getRegisterNow());
	    Thread.sleep(2000);
        Artlogin.getRegisterNow().click();
        Thread.sleep(4000);
        Artlogin.getCloseIcon().click();
        wait.until(ExpectedConditions.visibilityOf(Artlogin.getMyProductTitle()));
	    js.executeScript("arguments[0].scrollIntoView(true);", Artlogin.getItemBox());
	    assertion.assertEquals(Artlogin.getStatusText().getText(), "INACTIVE"," Status of the product is incorrect while missing mendatory field");
        Artlogin.getViewProduct().click();
        wait.until(ExpectedConditions.visibilityOf(Artlogin.getCompleteyourRegistrationTitle()));
	    js.executeScript("arguments[0].scrollIntoView(true);", Artlogin.getEditDetailsButton());
	    js.executeScript("arguments[0].click();", Artlogin.getEditDetailsButton());
	    Artlogin.getEditDetailsInputField().sendKeys("123456789123");
	    js.executeScript("arguments[0].scrollIntoView(true);", Artlogin.getEditDetailsSelectDealer());
	    Thread.sleep(2000);
	    Artlogin.getEditDetailsCountryofPurchase().click();
	    js.executeScript("arguments[0].scrollIntoView(true);", Artlogin.getCanadaDropdown());
	    js.executeScript("arguments[0].click();", Artlogin.getCanadaDropdown());
	    Artlogin.getEditDetailsSelectDealer().sendKeys("Other");
	    Thread.sleep(4000);
	    System.out.println(" total others : "+driver.findElements(By.xpath("//*[contains(text(),'Other')]")).size());
	    js.executeScript("arguments[0].click();", Artlogin.getOtherDropdown().get(1));
        Artlogin.getEditDetailsOther().sendKeys(" Test ");
        Artlogin.getEditDetailsPurchaseDate().sendKeys("4-8-2023");
        Artlogin.getupdatebutton().click();
	    
	    js.executeScript("arguments[0].scrollIntoView(true);", Artlogin.getBackToMyProduct());
	    Thread.sleep(2000);
	    js.executeScript("arguments[0].click();", Artlogin.getBackToMyProduct());
	    wait.until(ExpectedConditions.visibilityOf(Artlogin.getDismisslink()));
	    js.executeScript("arguments[0].click();", Artlogin.getDismisslink());

	    wait.until(ExpectedConditions.visibilityOf(Artlogin.getMyProductTitle()));
	    js.executeScript("arguments[0].scrollIntoView(true);", Artlogin.getItemBox());
	    assertion.assertEquals(Artlogin.getStatusText().getText(), "ACTIVE"," Status of the product must be Active now ");

	    Artlogin.getMyAccount().click();
	    
        //EOS-1N
	    
	   
		assertion.assertAll();
	}
	
	
}
