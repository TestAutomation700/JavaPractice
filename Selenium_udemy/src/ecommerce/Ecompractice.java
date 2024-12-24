package ecommerce;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Ecompractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\DriverFiles\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		//options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "enable-automation"));

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); 

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		List<WebElement> productName = driver.findElements(By.xpath("//*[@class='product-name']"));
		
		for(int i=0;i<productName.size();) {
			String itemTobeAdded =  productName.get(i).getText();
			
				if(itemTobeAdded.contains("Cucumber - 1 Kg")) {
					 driver.findElements(By.xpath("//*[text()='ADD TO CART']")).get(i).click();
					break;
				}
				else {
					i++;
				}
		}
		
		//driver.manage().deleteAllCookies();
		//driver.quit();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@ng-show,'teams-tests')]/div"));
		
		for(int i=0;i<list.size();i++) {
			
			
			
		}
				
	
	}

}
