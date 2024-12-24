package org.demo.maventest;

import org.openqa.selenium.WebDriver;

import Pages.Homepage;

public class Flightappdemo {
	
	WebDriver driver;
	
	Homepage objHomepage;
	
	public void enterDetails() {
	
	objHomepage = new Homepage(driver);
	objHomepage.enterFromDestination();
	objHomepage.enterToDestination();

}
}
