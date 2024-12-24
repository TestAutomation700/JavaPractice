package org.demo.maventest;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoLaunch {

	public static void main(String[] args) throws InterruptedException, Exception {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		// ******** Capturing the screen **************\\
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\0035G3744\\Desktop\\Screenshots");
		FileUtils.copyFile(src, dest);
		
		
		
		driver.quit();
		
	}
}
