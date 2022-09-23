package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ParaBankSuccessRegistration {

	WebDriver driver;
	
	@FindBy(xpath="//*[@id='rightPanel']//child::p")
	WebElement successMsg;
	
	@FindBy(linkText="Log Out")
	WebElement logout;
	
	public ParaBankSuccessRegistration(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifySuccessMsg(String expMsg) {
		String actMsg= successMsg.getText();
		if(actMsg.equals(expMsg)) {
			Reporter.log("Registration success message is "+actMsg);
		}
		else
		{
			Reporter.log("Actual and expected success message are not same");
			Reporter.log("Actual success message is "+actMsg );
			Reporter.log("Expected success message is "+expMsg );
		}
		
	}
	
	public void clickLogout() {
		logout.click();
	Reporter.log("User is logged out successfully");
	}
}
