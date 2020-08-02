package locatorConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownWrappertest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		DropDownWrapper.driver = new ChromeDriver();
		DropDownWrapper.driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
//		Thread.sleep(3000);
		
		By Employee = By.id("Form_submitForm_NoOfEmployees");
		By Industry = By.id("Form_submitForm_Industry");
		By Country =  By.id("Form_submitForm_Country");
		
		
		DropDownWrapper.doSelectValueByVisibleText(Employee, "16 - 20");
		DropDownWrapper.doSelectValueByIndex(Industry, 3);
		DropDownWrapper.doSelectValueByValue(Country, "Algeria");
	}
	

}
