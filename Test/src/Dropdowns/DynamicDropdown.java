package Dropdowns;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\DriverFiles\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver(options);
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		driver.get("https://www.spicejet.com/");
//		driver.manage().window().maximize();
//
////		JavascriptExecutor je = (JavascriptExecutor)driver;
////		String Title = je.executeScript("return document.title;").toString();
////		System.out.println(Title);
////		Thread.sleep(2000L);
//		
//		
//		//driver.findElement(By.xpath("(//input[contains(@class,'css-1cwyjr8')])[1]")).sendKeys("DEL");
//		
//		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input")).sendKeys("MAA");
//		
//		
//		//driver.quit();
//		
		HashMap<String,String> map = new HashMap<String, String>();
		map.put("User", "james:User123");
		map.put("Admin", "john:User124");
	
		if(map.containsKey("User")) {
			System.out.println(map.get("User").split(":")[0]);
		}
		
		
	}

}