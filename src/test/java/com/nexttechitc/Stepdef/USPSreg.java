package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import com.nexttechitc.Pageobjectmodel.USPSregPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class USPSreg {
	
	WebDriver driver;
	
	
	
	@Given("^user visit USPS homepage$")
	public void user_visit_USPS_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    
	   driver.get("https://www.usps.com/");
	
	   driver.manage().window().maximize(); 
	   
	   Thread.sleep(3000);
	   
	   
	
	}

	@When("^user click on register and click on sign up$")
	public void user_click_on_register_and_click_on_sign_up() throws Throwable {
		USPSregPOM reg =new USPSregPOM(driver);
		reg.Register().click();
		reg.Signup().click();
		
		
		
	}

	@When("^user select language and type new \"([^\"]*)\" and type new \"([^\"]*)\" and retype \"([^\"]*)\"$")
	public void user_select_language_and_type_new_and_type_new_and_retype(String arg1, String arg2, String arg3) throws Throwable {
		USPSregPOM select =new USPSregPOM(driver);
		Select dropdown=new Select (select.language);
		dropdown.selectByIndex(0);
		
	    select.username().sendKeys(arg1);
	    select.pw().sendKeys(arg2);
	    select.re_pw().sendKeys(arg3);
	    Thread.sleep(4000);
	    
	   }

	@When("^user select security_question(\\d+) and type \"([^\"]*)\" and retype \"([^\"]*)\" and  select security_question(\\d+) and type \"([^\"]*)\" and retype \"([^\"]*)\" and  select account type$")
	public void user_select_security_question_and_type_and_retype_and_select_security_question_and_type_and_retype_and_select_account_type(int arg1, String arg2, String arg3, int arg4, String arg5, String arg6) throws Throwable {
	    
		
		USPSregPOM obj =new USPSregPOM(driver);
		Select dropdown1=new Select (obj.security_question());
	    dropdown1.selectByIndex(3);
	    obj.ans1().sendKeys(arg2);
	    obj.re_ans1().sendKeys(arg3);
	    Select dropdown2 = new Select(obj.security_question1());
	    dropdown2.selectByIndex(1);
	    obj.ans2().sendKeys(arg5);
	    obj.re_ans2().sendKeys(arg6);
	    obj.account().click();
	    }
    
	
		@When("^user selct title and type \"([^\"]*)\" and type \"([^\"]*)\" and type \"([^\"]*)\" and retype \"([^\"]*)\" and select type and type \"([^\"]*)\"$")
	public void user_selct_title_and_type_and_type_and_type_and_retype_and_select_type_and_type(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		USPSregPOM obj =new USPSregPOM(driver);
		Select dropdown3=new Select(obj.title());
		dropdown3.selectByIndex(4);
		obj.First().sendKeys(arg1);
		obj.Last().sendKeys(arg2);
		obj.email().sendKeys(arg3);
		obj.re_email().sendKeys(arg4);
		Select dropdown4=new Select(obj.phtype);
		dropdown4.selectByIndex(0);
		obj.phone().sendKeys(arg5);
		
		
		}

	@When("^user select country and type \"([^\"]*)\"and type \"([^\"]*)\" and select state and type \"([^\"]*)\" and clcik verify address$")
	public void user_select_country_and_type_and_type_and_select_state_and_type_and_clcik_verify_address(String arg1, String arg2, String arg3) throws Throwable {
	    
		USPSregPOM obj =new USPSregPOM(driver);
		
	    Select dropdown4=new Select(obj.county());
	    dropdown4.selectByIndex(0);
	    obj.Address().sendKeys(arg1);
	    obj.City().sendKeys(arg2);
	    Select dropdown5=new Select(obj.State());
	    dropdown5.selectByVisibleText("NY - New York");
	    obj.code().sendKeys(arg3);
	    obj.verify().click();
	    
	    
	   }

	@Then("^user able to see create account button$")
	public void user_able_to_see_create_account_button() throws Throwable {
	    
	}

             
}
