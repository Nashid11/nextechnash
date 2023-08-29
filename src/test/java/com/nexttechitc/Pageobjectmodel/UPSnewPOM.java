package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UPSnewPOM {
	WebDriver driver;

	public UPSnewPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}

	@FindBy(xpath="//*[@id=\"ups-imagemap4_links\"]/li[5]/a")
	WebElement click_English;
	public WebElement English() {
		return click_English;

	}

	@FindBy(xpath="//*[@id=\"ups-navContainer\"]/header/div/div[3]/a[1]")
	WebElement click_login;
	public WebElement login() {
		return click_login;
	}
	@FindBy(xpath="//*[@id=\"Login\"]/div[2]/div[1]/p/a")
	WebElement click_signup;
	public WebElement signup() {
		return click_signup;
	}

	@FindBy(xpath="//*[@id=\"ups-main\"]/div/div/div/div[2]/form/div[1]/fieldset/div[1]/div[1]/div/label")
	WebElement select_type;
	public WebElement account() {
		return select_type;
	}

	@FindBy(xpath="//*[@id=\"signUpName\"]")
	WebElement enter_fullname;
	public WebElement FullName() {
		return enter_fullname;
		
	}
	
	@FindBy(xpath="//*[@id=\"signUpEmail\"]")
	WebElement enter_email;
	public WebElement email() {
		return enter_email;
}     

	@FindBy(xpath="//*[@id=\"ups-phone_input\"]")
	WebElement enter_phone;
	public WebElement phone() {
		return enter_phone;
	}

	@FindBy(xpath="//*[@id=\"signUpUserId\"]")
	WebElement enter_user;
	public WebElement username() {
		return enter_user;
	}
	@FindBy(xpath="//*[@id=\"signUpPassword\"]")
	WebElement enter_pass;
	public WebElement password() {
		return enter_pass;
	}

	@FindBy(xpath="//*[@id=\"ups-main\"]/div/div/div/div[2]/form/div[2]/div/label")
	WebElement click_agreement;
	public WebElement agreement() {
		return click_agreement;
	}

	@FindBy(xpath="//*[@id=\"ups-main\"]/div/div/div/div[2]/form/div[3]/div/button")
	WebElement click_sign;
	public WebElement signup1() {
		return click_sign;

	}


}


