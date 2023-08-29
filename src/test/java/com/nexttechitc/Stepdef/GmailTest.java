package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.GmailTestPOM;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailTest {
	
	
	WebDriver driver;
	
	@Given("^user visit Gamil page$")
	public void user_visit_Gamil_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("https://www.gmail.com/");
		    
		    driver.manage().window().maximize();      
			
			Thread.sleep(3000);
		
		    
	}

	@When("^user type valid \"([^\"]*)\" and click next$")
	public void user_type_valid_and_click_next(String arg1) throws Throwable {
		GmailTestPOM Type= new GmailTestPOM(driver);
		Type.email().sendKeys(arg1);
		Thread.sleep(4000);
		
		Type.next().click();
	}

	@When("^user enter valid \"([^\"]*)\" and click next$")
	public void user_enter_valid_and_click_next(String arg2) throws Throwable {
		GmailTestPOM enter= new GmailTestPOM(driver);
		enter.email().sendKeys(arg2);
		Thread.sleep(4000);
		
		enter.next1().click();
	}

	@Then("^user should able to log in Gmail account$")
	public void user_should_able_to_log_in_Gmail_account() throws Throwable {
	    
	}


}
