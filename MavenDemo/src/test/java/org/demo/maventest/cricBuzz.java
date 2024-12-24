package org.demo.maventest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stubList<WebElement> list = driver.findElements(By.xpath("//div[contains(@ng-show,'teams-tests')]/div"));
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-stats/icc-rankings/men/teams");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@ng-show,'teams-tests')]/div"));
		
		for(int i=0;i<list.size();i++) {
			
			//System.out.println(list.get(i).getText());
			
			if(!list.get(i).getText().equalsIgnoreCase("* The ratings are officially updated after each series rather than after each Test")) {
				
				String s = driver.findElement(By.xpath("//div[contains(@ng-show,'teams-tests')]/div["+(i+1)+"]/div[2]")).getText();
				
				if(s.equals("SRI LANKA")) {
					
					System.out.println(driver.findElement(By.xpath("//div[contains(@ng-show,'teams-tests')]/div["+(i+1)+"]/div[3]")).getText());
					
				}
			}
			
		}
				

	}

}
