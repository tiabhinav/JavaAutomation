package com.parabank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class ParaBankRegistration {

	WebDriver driver;
	
	// Initilize the webelements locators values using FINDBY class
	
	@FindBy(id="customer.firstName") 
	WebElement firstName;
	
	@FindBy(id="customer.lastName") 
	WebElement lastName;
	
	@FindBy(id="customer.address.street") 
	WebElement address;
	
	@FindBy(id="customer.address.city") 
	WebElement city;
	
	@FindBy(id="customer.address.state")
	WebElement state;
	
	@FindBy(id="customer.address.zipCode")
	WebElement zipcode;	
	
	@FindBy(id="customer.phoneNumber")
	WebElement phoneNumber;
	
	@FindBy(id="customer.ssn")
	WebElement ssnNumber;
	
	@FindBy(id="customer.username")
	WebElement userName;
	
	@FindBy(id="customer.password")
	WebElement password;
	
	@FindBy(id="repeatedPassword")
	WebElement confirmPassword;
	
	@FindBy(xpath="//*[@value='Register']")
	WebElement registerButton;
	
	public ParaBankRegistration(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setFirstName(String fname) {
		firstName.sendKeys(fname);
		Reporter.log("First name is " +fname);
	}

	public void setLastName(String lname) {
		lastName.sendKeys(lname);
			Reporter.log("Last name is " +lname);
		}
	public void setAddress(String add) {
		address.sendKeys(add);
		Reporter.log("Address is " +add);
	}
	
	public void setCity(String cityVal) {
		city.sendKeys(cityVal);
		Reporter.log("City is " +cityVal);
	}
	public void setState(String stateVal) {
		state.sendKeys(stateVal);
		Reporter.log("State is " +stateVal);
	}
	public void setZipCode(String zipcodeVal) {
		zipcode.sendKeys(zipcodeVal);
		Reporter.log("Postal code is " +zipcodeVal);
	}
	public void setPhoneNum(String PhoneNum) {
		phoneNumber.sendKeys(PhoneNum);
		Reporter.log("Phone number is " +PhoneNum);
	}
	
	public void setSsnNum(String ssnVal) {
		ssnNumber.sendKeys(ssnVal);
		Reporter.log("SSN is " +ssnVal);
	}
	public void setUserName(String user) {
		userName.sendKeys(user);
		Reporter.log("Username is " +user);
	}
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
		Reporter.log("Password is " +pwd);
	}
	public void setconfirmPassword(String confirmPwd) {
		confirmPassword.sendKeys(confirmPwd);
		Reporter.log("Confirm password is " +confirmPwd);
	}
	public void clickRegister() {
		registerButton.click();
		Reporter.log("Register button is clicked");
	}
	
}
