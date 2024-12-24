package sample;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class snippet{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\DriverFiles\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		checkbox.click();
		Assert.assertTrue(checkbox.isSelected());
		checkbox.click();
		Thread.sleep(2000L);
		Assert.assertFalse(checkbox.isSelected());
		
		int checkbox_cnt = driver.findElements(By.xpath("//*[@type='checkbox']")).size();
		System.out.println(checkbox_cnt);
		
	}
	
}