package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.UPSnewPOM;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UPSnew {

	WebDriver driver;
	
	
	@Given("^visit UPS page$")
	public void visit_UPS_page() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.ups.com/");
	    driver.manage().window().maximize();
	
	
	}

	@When("^user click United State-English and click log in buttun and clcik sign up$")
	public void user_click_United_State_English_and_click_log_in_buttun_and_clcik_sign_up() throws Throwable {
		UPSnewPOM reg =new UPSnewPOM(driver);
		reg.English().click();
		reg.login().click();
		reg.signup().click();
		Thread.sleep(3000);
		
		}

	@When("^user select account type and eneter \"([^\"]*)\" and enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_select_account_type_and_eneter_and_enter_and(String arg1, String arg2, String arg3) throws Throwable {
		UPSnewPOM reg1 =new UPSnewPOM(driver);
		reg1.account().click();
		reg1.FullName().sendKeys(arg1);
		reg1.email().sendKeys(arg2);
		reg1.phone().sendKeys(arg3);
	    Thread.sleep(3000);
	
	}

	@When("^user create new \"([^\"]*)\" and \"([^\"]*)\" and clcik agrrement box and click sign up$")
	public void user_create_new_and_and_clcik_agrrement_box_and_click_sign_up(String arg1, String arg2) throws Throwable {
	    
		UPSnewPOM reg2 =new UPSnewPOM(driver);
		reg2.username().sendKeys(arg1);
		reg2.password().sendKeys(arg2);
		reg2.agreement().click();
		reg2.signup1().click();
	
		Thread.sleep(3000);
	
	}

	@Then("^user can able to create new account$")
	public void user_can_able_to_create_new_account() throws Throwable {
	   
	}




}
