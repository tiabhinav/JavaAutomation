package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;



public class ParaBankHomePage {
	
	WebDriver driver;
	
	// Initilize the register locator value using FINDBY class
	
	@FindBy(linkText="Register") 
	WebElement registerLink;

	public ParaBankHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickRegisterLink() {
		registerLink.click();
		Reporter.log("Register link is clicked");
	}

}
