package Dropdowns;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalendarUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\DriverFiles\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		// options.addArguments("--headless"); to run without chrome GUI and when
		// Selenium tests run, they execute in the background.

		// options.addArguments("disable-infobars"); //deprecated

		// setExperimentalOption is the new method instead of disable infobar (infobar:
		// chrome is controlled by automated software)
		// we can pass the arguments as a list
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "enable-automation"));

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.spicejet.com/");

		// selecting Departure Date
		driver.findElement(By.xpath("//*[@data-testid='departure-date-dropdown-label-test-id']")).click();
		Thread.sleep(2000L);

		// moving the scope to the calendar section
		//WebElement date = driver.findElement(By.xpath("//*[@data-testid='undefined-calendar-picker']"));
		
		 driver.findElement(By.xpath("//*[@data-testid='undefined-calendar-day-30']")).click();

		// Selecting arrival date
		
		  driver.findElement(By.xpath("//*[@data-testid='departure-date-dropdown-label-test-id']")).click();
		  Thread.sleep(2000L);
		  driver.findElement(By.xpath("//*[@data-testid='undefined-calendar-day-29']")).click();
		  
		  //driver.quit();
		 

	}

}
