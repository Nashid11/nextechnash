package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.HelpFaqsPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HelpFaqs {
	
	WebDriver driver;
	
	
	
	@Given("^open USPS homepage$")
	public void open_USPS_homepage() throws Throwable {
	   
		try {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https:www.usps.com/");  
	      }
		catch(Exception e) {
		  System.out.println("url not working");
		  		}
		
		}

	@When("^user click on Help dropdown menu and click FAQs$")
	public void user_click_on_Help_dropdown_menu_and_click_FAQs() throws Throwable {
		Actions act= new Actions(driver);
		HelpFaqsPOM ser = new HelpFaqsPOM(driver);
		act.moveToElement(ser.Help()).build().perform();
		Thread.sleep(5000);
		
		
		
		ser.FAQs().click();
		
		
		}

	@Then("^user should able to redirect to the FAQs page$")
	public void user_should_able_to_redirect_to_the_FAQs_page() throws Throwable {
	    
	}


}
