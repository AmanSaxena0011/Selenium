package alertPopupHandle;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import webelements.WebDrivermethods;

public class SignupPage {

	public static void main(String[] args) {
		
		String browser = "chrome";
		WebDrivermethods wf = new WebDrivermethods();
		WebDriver driver = wf.LauchBrowser(browser);	
		wf.launchURL("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println(wf.getCurrentURL());
		
		By FirstName = By.id("Form_submitForm_FirstName");
		By LastName = By.id("Form_submitForm_LastName");
		By Country = By.id("Form_submitForm_Country");
		
		ElementUtil elementutil = new ElementUtil(driver);
		elementutil.doSendKeys(FirstName, "Aman");
		elementutil.doSendKeys(LastName, "Saxena");
		elementutil.doSelectValueByVisibleText(Country, "India");
		
		
		
//		wf.closeBrowser();
	}

}
