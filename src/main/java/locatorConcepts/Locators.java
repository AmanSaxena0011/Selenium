package locatorConcepts;

// 8 locator finding techniques:

//1. Id     		*1st because id are always unique , id can not be unique.
//2. Name   		*2nd not unique, can be duplicate 
//3.ClassName		*3rd Only if Class is unique coz these are attribute , as xpath and css both are non attribute
//4.xPath			* 1st /2nd in nonat, 3rd if compare with attribute
//5.cssSelector 	** 1st /2nd in nonat,3rd if compare with attribute
//6.linkText only for links 	*4th bcz it can be duplicate
//7.PartiallinkText 	*5th risky
//8.tagName






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("http://app.hubspot.com");
		Thread.sleep(9000);
//		1. ID 1st method
//		driver.findElement(By.id("username")).sendKeys("Aman.saxena0011@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Password");
//		driver.findElement(By.id("loginBtn")).click();
		
		
//		2nd method
//		WebElement email = driver.findElement(By.id("username"));
//		WebElement password = driver.findElement(By.id("password"));
//		WebElement loginbutton = driver.findElement(By.id("loginBtn"));
//		

//		email.sendKeys("aman.saxena0011@gmail.com");
//		password.sendKeys("password");
//		loginbutton.click();
		
//		3rd methd		
//		By email = By.id("username");
//		By password = By.id("password");
//		By loginbutton = By.id("loginBtn");
		
		
//		driver.findElement(emails).sendKeys("Aman.sqaxena@india.com");
//		driver.findElement(passwords).sendKeys("pass");
//		driver.findElement(loginbuttons).click();
		
//		4th method	
//		getElement(email).sendKeys("Aman@india.com");		
//		getElement(password).sendKeys("password@123");
//		getElement(loginbutton).click();
//		
		
// 	5th most advance method , we have created custom methods of all find element , sendkeys, ckick on the basis of by operator		
		
//		By email = By.id("username");
//		By password = By.id("password");
//		By loginbutton = By.id("loginBtn");
//		
//		
//		doSendkeys(email, "aman.saxena@india.nec.com");
//		doSendkeys(password, "aman@123456");
//		doClick(loginbutton);
		
		
//	2. Name	
		
		
//		 	driver.get("https://www.salesforce.com/in/form/sem/crm-systems");
//			Thread.sleep(5000);
//			driver.findElement(By.name("UserFirstName")).sendKeys("Aman");
//			Thread.sleep(3000);
//			driver.quit();

		 
//  3. ClassName
		
//		
//		driver.findElement(By.className("login-email")).sendKeys("Aman.saxena@india.com");
//		driver.findElement(By.className("login-password")).sendKeys("Password@123");
//		Thread.sleep(3000);
//		driver.quit();
		
		
// 4. xPath 	it is not an attribute it is an attribute	
		
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("Aman@india.nec.com");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Password est");
//		
//		Thread.sleep(3000);
//		driver.quit();
		
// 5. cssSelector	it is not an attribute, it is an attribute	
//		
//		driver.findElement(By.cssSelector("#username")).sendKeys("Aman@india.nec.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("Password est");
//		
//		Thread.sleep(3000);
//		driver.quit();
		
//6.	linkText only for links. linkText only for links , link will always be associate with the a class.
		
//		driver.findElement(By.linkText("Sign up")).click();
//		
//		
//		Thread.sleep(3000);
//		driver.quit();
		
//7. PartialLinkText for partial link		
			
//	driver.findElement(By.partialLinkText("Sign")).click();
//		
//		
//		Thread.sleep(3000);
//		driver.quit();
		
//8. tagName next session
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	4th method , 5th method with latest added 2 new methods of sendkeys and click
/**
 * This method is used to get the element from By locator
 * @param byLocator
 * @return
 */
	public static WebElement getElement(By Locator) {
		WebElement Element = driver.findElement(Locator);
		return Element;
	}
	
	
	public static void doSendkeys(By Locator, String value) {
		getElement(Locator).sendKeys(value);
	}
	
	public static void doClick(By Locator) {
		getElement(Locator).click();
	}
	

}
