package com.parabank.testcase;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.parabank.pages.ParaBankHomePage;
import com.parabank.pages.ParaBankRegistration;
import com.parabank.pages.ParaBankSuccessRegistration;



public class RegistrationParaBank {
  
	public WebDriver driver;

	@Test(priority=1)
	public void launchApplication() {
		// To Set System Property
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		
		// To Create Driver Object in Driver Interface
		driver = new ChromeDriver();

		// Step:2 Launch the Home URL "https://parabank.parasoft.com/parabank/index.htm".

		// Launch the Home URL
		driver.get("https://parabank.parasoft.com/parabank/index.htm");

		// To Maximize Window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Application is launched");	
	}
	
	@Test(priority=2)
	public void regiterLink() {
		
		ParaBankHomePage clickRegister = PageFactory.initElements(driver, ParaBankHomePage.class);
		clickRegister.clickRegisterLink();
		
	}
	
	@Test(priority=3)
	public void registration() {
		
		ParaBankRegistration registerUser = PageFactory.initElements(driver, ParaBankRegistration.class);
		registerUser.setFirstName("Firsttest");
		registerUser.setLastName("Lasttest");
		registerUser.setAddress("Test address");
		registerUser.setCity("Pune");
		registerUser.setState("Maharashtra");
		registerUser.setZipCode("766767");
		registerUser.setPhoneNum("7876789876");
		registerUser.setSsnNum("3435");
		registerUser.setUserName("testuser0628");
		registerUser.setPassword("password");
		registerUser.setconfirmPassword("password");
		registerUser.clickRegister();
				
	}
	
	@Test(priority=4)
	public void verifySuccessMessageAndLogout() {
		
		ParaBankSuccessRegistration usersMsg = PageFactory.initElements(driver, ParaBankSuccessRegistration.class);
		usersMsg.verifySuccessMsg("Your account was created successfully. You are now logged in.");
		usersMsg.clickLogout();
		
	}
	
	@Test(priority=5)
	public void closeApplication() {
		driver.close();
	}
}
