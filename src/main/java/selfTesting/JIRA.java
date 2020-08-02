package selfTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JIRA {
	
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://smartmergence.nectechnologies.in:8443/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		By username = By.id("login-form-username");
		By password = By.id("login-form-password");
		By checkbox = By.id("login-form-remember-me");
		By Login    = By.id("login");
		By Issuedropdown = By.xpath("//*[@id=\"find_link_drop\"]/span");
		By LDBBugs = By.xpath("//ul[@class = 'aui-list-section']/li[contains(@id,'filter_lnk_25404')]");
		By Views  = By.linkText("Views");
		By Excel = By.linkText("Excel (Current fields)");
		
		driver.switchTo().frame("gadget-0");
		
		doSendKeys(username, "aman.saxena");
		doSendKeys(password, "Ctsnec#123");
		doClick(checkbox);
		doClick(Login);
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		

		doClick(Issuedropdown);
		Thread.sleep(2000);
		doClick(LDBBugs);
		doClick(Views);
		doClick(Excel);
	}
	
	
	
	
	public static WebElement getElement(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
		} catch (Exception e) {
		System.out.println("The locator could not be read: "+ locator);
		}
		return element;
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void doSendKeys(By locator, String Value) {
		getElement(locator).sendKeys(Value);
	}


	
	
}
