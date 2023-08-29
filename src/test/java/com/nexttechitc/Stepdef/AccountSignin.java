package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.AccountSigninPOM;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountSignin {
	WebDriver driver;
	
	
	
	@Given("^open USPS$")
	public void open_USPS() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.usps.com/");
	    driver.manage().window().maximize();
	
	
	}

	@When("^user click on sign in and enter valid \"([^\"]*)\" and enter valid \"([^\"]*)\" and click sign in button$")
	public void user_click_on_sign_in_and_enter_valid_and_enter_valid_and_click_sign_in_button(String arg1, String arg2) throws Throwable {
		
		
		AccountSigninPOM obj =new AccountSigninPOM(driver);
		obj.SignIn().click();
		obj.username().sendKeys(arg1);
		obj.pass().sendKeys(arg2);
		obj.button().click();
		WebDriverWait wait=new WebDriverWait(driver,20);
	}

	@When("^user should able to sing in to the account$")
	public void user_should_able_to_sing_in_to_the_account() throws Throwable {
	    Thread.sleep(3000);
	}

	@When("^user click on user name and dropdown menu and click sign out$")
	public void user_click_on_user_name_and_dropdown_menu_and_click_sign_out() throws Throwable {
		
		
		Actions act= new Actions(driver);
		AccountSigninPOM obj =new AccountSigninPOM(driver);
	    act.moveToElement(obj.button2()).build().perform();
	    obj.signout().click();
	}

	@Then("^user successfully sign out from account$")
	public void user_successfully_sign_out_from_account() throws Throwable {
	    
	}


}
