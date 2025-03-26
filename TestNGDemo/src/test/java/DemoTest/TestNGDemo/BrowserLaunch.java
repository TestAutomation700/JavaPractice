package DemoTest.TestNGDemo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BrowserLaunch {
	
	WebDriver driver;
	
	@Test ()
	public void chromeTest() {
		
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.quit(); 
	}
	
	@Test
	public void firefoxTest() {
		driver=new FirefoxDriver();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.quit(); 
	}
	
	
    @AfterMethod
    public void tearDown() {
    	
        if (driver != null) {
            driver.quit();
        }
    }

}
