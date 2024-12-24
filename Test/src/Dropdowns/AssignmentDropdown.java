package Dropdowns;

import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\DriverFiles\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--disable-notifications");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking", "enable-automation"));

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS); // implicit wait

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.name("name")).sendKeys("TestUser");
		driver.findElement(By.name("email")).sendKeys("TestUser@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Test1234");

		driver.findElement(By.id("exampleCheck1")).click();

		// Selecting the gender
		WebElement static_option = driver.findElement(By.id("exampleFormControlSelect1"));
		static_option.click();
		Select select = new Select(static_option);
		select.selectByVisibleText("Female");

		driver.findElement(By.id("inlineRadio1")).click(); // select the Employment status: radio button

		driver.findElement(By.xpath("//*[@class='form-control' and @type='date']")).sendKeys("27-06-1993"); // DOB

		driver.findElement(By.xpath("//*[@type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());

		driver.quit();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.alertIsPresent(By.xpath(null)))

}
}



