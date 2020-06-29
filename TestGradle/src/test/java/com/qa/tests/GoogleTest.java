package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test
	public void googleTitleTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("google title is" + title);
		
		Assert.assertEquals(title, "Google");
		
		driver.quit();
	}
	
	
}
