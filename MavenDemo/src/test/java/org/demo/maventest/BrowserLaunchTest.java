package org.demo.maventest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserLaunchTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://google.com");		


	}
	
	@Test
	public void launchGmail() {
		
		driver.findElement(By.linkText("Gmail")).click();
		
		
	}
	
	
	@AfterTest
	 public void tearDown() {
		
		driver.quit();
		
	}
		
	
		
	}


