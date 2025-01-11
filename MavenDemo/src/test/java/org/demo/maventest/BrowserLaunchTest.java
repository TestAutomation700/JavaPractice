package org.demo.maventest;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunchTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\DriverFiles\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize(); //maximize the window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
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


