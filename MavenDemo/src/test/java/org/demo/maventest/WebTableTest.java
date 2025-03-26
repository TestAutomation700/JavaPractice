package org.demo.maventest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/cricket-series/7607/indian-premier-league-2024/points-table");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.quit();

	}

}
