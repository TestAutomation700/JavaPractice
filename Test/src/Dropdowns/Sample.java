package Dropdowns;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\DriverFiles\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "enable-automation"));

		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://rahulshettyacademy.com/");
		// driver.navigate().to("https://mail.google.com/");
		
		String click_link = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		driver.findElement(By.linkText("Courses")).sendKeys(click_link);
		
		Set<String> window_handle = driver.getWindowHandles();
		Iterator<String> iterator = window_handle.iterator();
		
		String parent_window = iterator.next();
		String child_window = iterator.next();
		
		System.out.println(parent_window + " "+ child_window);
		
		driver.switchTo().window(child_window);
		Thread.sleep(2000L);
		
		driver.switchTo().window(parent_window);
		
		
	}

}
