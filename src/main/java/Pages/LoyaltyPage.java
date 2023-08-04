package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utils.ElementUtil;

public class LoyaltyPage {

	private WebDriver driver;
	private ElementUtil elementUtil;
	
	public LoyaltyPage(WebDriver driver) {
		this.driver=driver;
		elementUtil = new ElementUtil(driver);
	}
	
	public WebElement getSureLoginButtonElement(String forSureloginbutton) {
		String SureLoginButtonText= "//button[text()='"+forSureloginbutton+"']//parent::div//button";
		return elementUtil.getElement("xpath", SureLoginButtonText);
	}
}
