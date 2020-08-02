package locatorConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdownwoutselectorangehrm {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		DropdownWithoutSelect.driver = new ChromeDriver();
		DropdownWithoutSelect.driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By Countryoptions =   By.xpath("//select[@id ='Form_submitForm_Country']/option");
//		By CountryAfgani =   By.xpath("//select[@id ='Form_submitForm_Country']/option[2]");
//		DropdownWithoutSelect.driver.findElement(CountryAfgani).click();
		
		DropdownWithoutSelect.getdropdownselected(Countryoptions, "Afghanistan");
		

	}

}
