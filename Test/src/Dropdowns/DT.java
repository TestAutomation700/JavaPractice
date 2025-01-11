package Dropdowns;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\DriverFiles\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "enable-automation"));

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // implicit wait

		driver.get("https://www.discounttire.com/");

		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//*[@data-icon='times']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[contains(text(),'Sign In')]")).click();
		
		
       
		driver.quit();
	}

}
