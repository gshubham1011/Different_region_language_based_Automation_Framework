package Factory;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebElement_Repository.SFDC_Loyalty_Elements;


public class DriverFactory {
	  
		public static WebDriver driver;
		public static WebDriverWait wait;
		public static JavascriptExecutor js;
		public static SFDC_Loyalty_Elements Artlogin = new SFDC_Loyalty_Elements();
		
	public WebDriver initDriver(Properties prop) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Drivers\\chromedriver.exe"); 
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();		
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    wait = new WebDriverWait(driver, Duration.ofSeconds(120));
	    js = (JavascriptExecutor)driver;
	    Artlogin = PageFactory.initElements(driver, SFDC_Loyalty_Elements.class);

	    //driver.get(prop.getProperty("Loylty_URL"));
	    return driver;
	}
}
