package com.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;
	@Test
	public void google() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement find = driver.findElement(By.name("q"));
		find.clear();
		find.sendKeys("qaxchange");
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");
		driver.findElement(By.name("btnK")).click();;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)", "");
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		WebElement qax=driver.findElement(By.partialLinkText("THE QA XCHANGE, INC."));
		qax.click();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		driver.quit();
	}	
	}
	
