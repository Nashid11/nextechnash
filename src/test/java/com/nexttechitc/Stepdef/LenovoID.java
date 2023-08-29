package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.LenovoIDPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LenovoID {
	
	WebDriver driver;
	
	
	@Given("^user visit lenovo homepage$")
	public void user_visit_lenovo_homepage() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.lenovo.com/");
	    driver.manage().window().maximize();
	
	}
	
	
	@When("^user go sign in dropdown menu and click view your account and click create lenovo ID$")
	public void user_go_sign_in_dropdown_menu_and_click_view_your_account_and_click_create_lenovo_ID() throws Throwable {
	    Actions act = new Actions (driver);
	    LenovoIDPOM acc =new LenovoIDPOM (driver);
	    act.moveToElement(acc.dropdown()).build().perform();
	    acc.sign().click();
	    acc.createID().click();
	    Thread.sleep(3000);
	
	}

	@When("^user click select account type and click continue with email$")
	public void user_click_select_account_type_and_click_continue_with_email() throws Throwable {
		LenovoIDPOM acc1 =new LenovoIDPOM (driver);
	     acc1.acctype().click();
	     acc1.contemail().click();
	     Thread.sleep(4000);
	     
	     
	
	}

	@When("^user enter valid \"([^\"]*)\" and enter \"([^\"]*)\" and \"([^\"]*)\" and enter \"([^\"]*)\" and enter \"([^\"]*)\"$")
	public void user_enter_valid_and_enter_and_and_enter_and_enter(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	    
		LenovoIDPOM acc2 =new LenovoIDPOM (driver);
		acc2.email().sendKeys(arg1);
		acc2.FirstName().sendKeys(arg2);
		acc2.LastName().sendKeys(arg3);
		acc2.password().sendKeys(arg4);
		acc2.repassword().sendKeys(arg5);
		Thread.sleep(5000);
		
	
	
	}

	@When("^user select reward and select email sign up and click policy$")
	public void user_select_reward_and_select_email_sign_up_and_click_policy() throws Throwable {
		LenovoIDPOM acc3 =new LenovoIDPOM (driver);
	    acc3.reward().click();
	    acc3.emailsign().click();
	    acc3.policy().click();
	    
	    Thread.sleep(4000);
	
	}

	@Then("^user click on create new id$")
	public void user_click_on_create_new_id() throws Throwable {
	    
	}



}
