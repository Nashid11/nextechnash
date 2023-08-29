package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailTestPOM {

WebDriver driver;
	
	public GmailTestPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//"//input[@id="twotabsearchtextbox"] "

	@FindBy(xpath="//*[@id=\"identifierId\"]")
	WebElement Type_email;
	public WebElement email(){
	return Type_email;

	}
		
	@FindBy(xpath="//*[@id=\"identifierNext\"]/div/button/span")

	WebElement Click_next;
	  
	public WebElement next(){
	return Click_next;

	}


	@FindBy(xpath="//*[@id=\"password\"]/div[1]/div/div[1]/input")
	WebElement enter_password;
	public WebElement password(){
	return enter_password;

	}
	
	
	@FindBy(xpath="//*[@id=\"passwordNext\"]/div/button/span")

	WebElement Click_next1;
	  
	public WebElement next1(){
	return Click_next1;
}


}


