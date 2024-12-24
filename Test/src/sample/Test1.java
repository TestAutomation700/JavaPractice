package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.out.println("Hello world!");

		
		System.setProperty("webdriver.chrome.driver", "C:\\DriverFiles\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // driver.close(); 
      
       
       WebDriverWait wait = new WebDriverWait(driver, 10);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Login'])")));
       
       driver.findElement(By.xpath("(//a[contains(@href,'/sign_in/')])")).click();
       
      
       
       
       //driver.quit();
	}

}
