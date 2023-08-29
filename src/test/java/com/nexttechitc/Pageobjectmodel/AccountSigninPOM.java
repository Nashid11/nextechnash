package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSigninPOM {

WebDriver driver;

  public AccountSigninPOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
  @FindBy(xpath="//*[@id=\"login-register-header\"]")
	WebElement click_Sign;
	public WebElement SignIn() {
		return click_Sign;
	}

	@FindBy(xpath="//*[@id=\"username\"]")
	WebElement user_name;
	public WebElement username() {
		return user_name;

}
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	public WebElement pass() {
		return password;


	}
	@FindBy(xpath="//*[@id=\"btn-submit\"]")
	WebElement sign_button;
	public WebElement button() {
		return sign_button;

	}
	@FindBy(xpath="//*[@id=\"anchor-login\"]")
	WebElement user_button;
	public WebElement button2() {
		return user_button;

	}
	

	@FindBy(xpath="//*[@id=\"accountLinks\"]/a[2]")
	WebElement click_signout;
	public WebElement signout() {
		return click_signout;
	}
}
