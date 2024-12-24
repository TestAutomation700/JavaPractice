package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class robotclass {



	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_0 );
		
		WebDriver driver = new ChromeDriver();
		String TC_id="";
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Results\\screenshots\\"+TC_id+".png");
		FileUtils.copyFile(src, dest);
		

	}


}
