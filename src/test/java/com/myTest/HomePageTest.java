package com.myTest;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{


	@Test
	public void getTitle() {
		doLogin();
		Assert.assertEquals(driver.getTitle(), "CRMPRO");
	}
	
	public void doLogin() {
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("batchautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.cssSelector("input.btn.btn-small"))).perform();
//		driver.findElement(By.cssSelector("input.btn.btn-small")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs("CRMPRO"));
		
	}

}
