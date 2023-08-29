package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.amazonregistryPOM;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class amazonregistry {

WebDriver driver;
	@Given("^user visits amazon homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
	    
	  //how to open browser?
		 System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		   
		    
		 // how to open URL
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		
		// Maximize window 
        
		driver.manage().window().maximize();      
		
		Thread.sleep(6000);
	
	}
	
	
	@When("^user click on registry$")
	public void user_click_on_registry() throws Throwable {
	    
		amazonregistryPOM search= new amazonregistryPOM(driver);
		//search.amazonregistry().click();
		Thread.sleep(3000);
		search.registry().click();
		
	}
	

	@Then("^user should able to redirect to the registry page$")
	public void user_should_able_to_redirect_to_the_registry_page() throws Throwable {
	    
	}



}
