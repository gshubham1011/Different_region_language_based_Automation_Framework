package WebElement_Repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SFDC_Loyalty_Elements {

	@FindBy(xpath="//span[text()='Canon ID (Customer Portal)']")
	public static  WebElement loginCanon;	
	public WebElement getloginCanon() {
		return loginCanon;
	}
	
	@FindBy(xpath="//h1[@id='gcid-title-text']")
	public static  WebElement TitlePage;	
	public WebElement getTitlePage() {
		return TitlePage;
	}
	
	@FindBy(xpath="//a[text()='Create a Canon ID account']")
	public static  WebElement CreateaCanonIDAccount;	
	public WebElement getCreateaCanonIDAccount() {
		return CreateaCanonIDAccount;
	}
	@FindBy(xpath="//p[text()='Sign up with your email']")
	public static  WebElement SignUpwithEmail;	
	public WebElement getSignUpwithEmail() {
		return SignUpwithEmail;
	}
	@FindBy(xpath="//h1[text()='Your details']")
	public static  WebElement YourDetails;	
	public WebElement getYourDetails() {
		return YourDetails;
	}
	@FindBy(xpath="//span[text()='Create my account']")
	public static  WebElement CreateMyAccount;	
	public WebElement getCreateMyAccount() {
		return CreateMyAccount;
	}
	@FindBy(xpath="//mat-error[text()=' Your first name is required ']")
	public static  WebElement materror;	
	public WebElement getmaterror() {
		return materror;
	}
	@FindBy(xpath="//input[@id='regFirstName']")
	public static  WebElement RegFirstName;	
	public WebElement getRegFirstName() {
		return RegFirstName;
	}
	@FindBy(xpath="//input[@id='regLastName']")
	public static  WebElement RegLastName;	
	public WebElement getRegLastName() {
		return RegLastName;
	}
	@FindBy(xpath="//input[@id='regEmail']")
	public static  WebElement RegEmail;	
	public WebElement getRegEmail() {
		return RegEmail;
	}
	@FindBy(xpath="//input[@id='mat-input-2']")
	public static  WebElement Password;	
	public WebElement getPassword() {
		return Password;
	}
	@FindBy(xpath="//span[text()='Yes, it is correct']")
	public static  WebElement yesItisCorrectbutton;	
	public WebElement getyesItisCorrectbutton() {
		return yesItisCorrectbutton;
	}
	@FindBy(xpath="//span[text()='Continue']")
	public static  WebElement ContinueButton;	
	public WebElement getContinueButton() {
		return ContinueButton;
	}
	@FindBy(xpath="//button[text()='NO, GO TO MY ACCOUNT']//parent::div//button")
	public static  WebElement SureLetDoIt;	
	public WebElement getSureLetDoIt() {
		return SureLetDoIt;
	}
	@FindBy(xpath="//button[text()='Skip']")
	public static  WebElement SkipButton;	
	public WebElement getSkipButton() {
		return SkipButton;
	}
	@FindBy(xpath="//button[text()='Continue']")
	public static  WebElement continueButton;	
	public WebElement getcontinueButton() {
		return continueButton;
	}
	@FindBy(xpath="//input[@name='marketingConsent']")
	public static  WebElement StayinTouchCheckbox;	
	public WebElement getStayinTouchCheckbox() {
		return StayinTouchCheckbox;
	}
	
	@FindBy(xpath="//h2[text()='Register a new Product']")
	public static  WebElement RegisteranewProduct;	
	public WebElement getRegisteranewProduct() {
		return RegisteranewProduct;
	}
	@FindBy(xpath="//label[text()='Product name']")
	public static  List<WebElement> ProductName;	
	public List<WebElement> getProductName() {
		return ProductName;
	}
	
	@FindBy(xpath="//input[@name='product-search']")
	public static  WebElement ProductNameInput;	
	public WebElement getProductNameInput() {
		return ProductNameInput;
	}
	@FindBy(xpath="//label[text()='Serial number']")
	public static  List<WebElement> SerialNumber;	
	public List<WebElement> getSerialNumber() {
		return SerialNumber;
	}
	@FindBy(xpath="//label[text()='Select the country of purchase']")
	public static  List<WebElement> SelectTheCountryofPurchase;	
	public List<WebElement> getSelectTheCountryofPurchase() {
		return SelectTheCountryofPurchase;
	}
	@FindBy(xpath="//label[text()='Select your dealer']")
	public static  List<WebElement> SelectyourDealer;	
	public List<WebElement> getSelectyourDealer() {
		return SelectyourDealer;
	}
	@FindBy(xpath="//label[text()='Other']")
	public static  List<WebElement> Other;	
	public List<WebElement> getOther() {
		return Other;
	}
	@FindBy(xpath="//p[text()='Purchase date']")
	public static  List<WebElement> purchaseDate;	
	public List<WebElement> getpurchaseDate() {
		return purchaseDate;
	}
	@FindBy(xpath="//p[text()='Proof of purchase']")
	public static  List<WebElement> proofofpurchse;	
	public List<WebElement> getproofofpurchse() {
		return proofofpurchse;
	}
	@FindBy(xpath="//button[text()='Register now']")
	public static  WebElement RegisterNow;	
	public WebElement getRegisterNow() {
		return RegisterNow;
	}
	@FindBy(xpath="//span[text()='EOS-1N ']")
	public static  WebElement EOSIN;	
	public WebElement getEOSIN() {
		return EOSIN;
	}
	@FindBy(xpath="//button[@aria-label='Close']/span")
	public static  WebElement CloseIcon;	
	public WebElement getCloseIcon() {
		return CloseIcon;
	}
	@FindBy(xpath="//h1[text()='My Products']")
	public static  WebElement MyProductTitle;	
	public WebElement getMyProductTitle() {
		return MyProductTitle;
	}
	@FindBy(xpath="//c-loyalty-kitbag-product[@data-item='[object Object]']")
	public static  WebElement ItemBox;	
	public WebElement getItemBox() {
		return ItemBox;
	}
	@FindBy(xpath="//span[contains(@class,'indicator__status')]//following-sibling::span")
	public static  WebElement StatusText;	
	public WebElement getStatusText() {
		return StatusText;
	}
	@FindBy(xpath="//button[text()='View Product']")
	public static  WebElement ViewProduct;	
	public WebElement getViewProduct() {
		return ViewProduct;
	}
	@FindBy(xpath="//div[text()='Complete your registration']")
	public static  WebElement CompleteyourRegistrationTitle;	
	public WebElement getCompleteyourRegistrationTitle() {
		return CompleteyourRegistrationTitle;
	}
	@FindBy(xpath="//button[text()='Edit details']")
	public static  WebElement EditDetailsButton;	
	public WebElement getEditDetailsButton() {
		return EditDetailsButton;
	}
	@FindBy(xpath="//input[@class='slds-input']")
	public static  WebElement EditDetailsInputField;	
	public WebElement getEditDetailsInputField() {
		return EditDetailsInputField;
	}
	@FindBy(xpath="//input[@class='slds-input slds-combobox__input']")
	public static  WebElement EditDetailsSelectDealer;	
	public WebElement getEditDetailsSelectDealer() {
		return EditDetailsSelectDealer;
	}
	@FindBy(xpath="//button[@aria-label='Country of purchase']/span")
	public static  WebElement EditDetailsCountryofPurchase;	
	public WebElement getEditDetailsCountryofPurchase() {
		return EditDetailsCountryofPurchase;
	}
	@FindBy(xpath="(//input[@class='slds-input'])[2]")
	public static  WebElement EditDetailsOther;	
	public WebElement getEditDetailsOther() {
		return EditDetailsOther;
	}
	@FindBy(xpath="(//input[@class='slds-input'])[3]")
	public static  WebElement EditDetailsPurchaseDate;	
	public WebElement getEditDetailsPurchaseDate() {
		return EditDetailsPurchaseDate;
	}
	@FindBy(xpath="//span[contains(@title,'Canada')]")
	public static  WebElement CanadaDropdown;	
	public WebElement getCanadaDropdown() {
		return CanadaDropdown;
	}
	@FindBy(xpath="//span[contains(text(),'Other')]")
	public static  List<WebElement> OtherDropdown;	
	public List<WebElement> getOtherDropdown() {
		return OtherDropdown;
	}
	@FindBy(xpath="//button[text()='UPDATE']")
	public static  WebElement updatebutton;	
	public WebElement getupdatebutton() {
		return updatebutton;
	}
	@FindBy(xpath="//a[text()='Back to My Products']")
	public static  WebElement BackToMyProduct;	
	public WebElement getBackToMyProduct() {
		return BackToMyProduct;
	}
	@FindBy(xpath="//*[text()='Dismiss']")
	public static  WebElement Dismisslink;	
	public WebElement getDismisslink() {
		return Dismisslink;
	}
	@FindBy(xpath="//button[text()='Register']")
	public static  WebElement Register;	
	public WebElement getRegister() {
		return Register;
	}
	@FindBy(xpath="//span[text()='My Account']")
	public static  WebElement MyAccount;	
	public WebElement getMyAccount() {
		return MyAccount;
	}
}
