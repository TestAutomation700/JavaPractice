package org.demo.maventest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XpathTest {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//*[@title='Email']")).sendKeys("abc123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Register123");
		
		driver.findElement(By.xpath("//*[@name='company']")).sendKeys("TestCompany");
		driver.findElement(By.xpath("//*[contains(@name,'mobile')]")).sendKeys("+91-9074326876");
		
		driver.findElement(By.xpath("//*[@iconid='editon'] ")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
				
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        
        // Wait until the 'First Name' field is visible
        WebElement firstNameField = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@class,'dfae242')]//input[1]"))
        );
        // Scroll to the 'First Name' field and interact with it
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", firstNameField);
        firstNameField.sendKeys("Test");
        
        // Wait until the 'Last Name' field is visible
		/*
		 * WebElement lastNameField = wait.until(
		 * ExpectedConditions.elementToBeClickable(By.xpath(
		 * "//*[contains(@class,'dfae242')]//input[2]")) ); // Scroll to the 'Last Name'
		 * field and interact with it ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].scrollIntoView(true);", lastNameField);
		 * lastNameField.sendKeys("User");
		 */
		
		Select select = new Select(driver.findElement(By.id("cars")));
		select.selectByValue("opel");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    
	    driver.quit();

	}

}
