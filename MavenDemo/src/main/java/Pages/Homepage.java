package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	WebDriver driver;
	
	//'From Place
	By from_dest = By.xpath("//input[contains(@class,'css-1cwyjr8')][1]");
	
	//'To Destination
	By to_dest = By.xpath("//input[@value='Select Destination']");
	
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
		
	}
	

	public void enterFromDestination() {
		driver.findElement(from_dest).sendKeys("MAA");
	}
	
	public void enterToDestination() {
		driver.findElement(to_dest).sendKeys("DEL");
	}

}
