package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.dellactionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellActionService {
	
	
	WebDriver driver;
	
	
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
	    
	  //how to open browser?
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		   
		    
		 // how to open URL
		driver.get("https://www.dell.com/");
		Thread.sleep(3000);
		
		// Maximize window 
        
		driver.manage().window().maximize();      
		
		Thread.sleep(3000);
	
		
	}

	@When("^user go to service dropdown menu and able to see View All Service$")
	public void user_go_to_service_dropdown_menu_and_able_to_see_View_All_Service() throws Throwable {
		
		Actions act= new Actions(driver);// drop down , right left 
		dellactionPOM ser= new dellactionPOM(driver);// service= ser
		act.moveToElement(ser.service()).build().perform();
		Thread.sleep(5000);
		
		ser.viewallservice().click();
		
		
	
	}

	@Then("^user redirects to view all service$")
	public void user_redirects_to_view_all_service() throws Throwable {
	    
	}

  
}
