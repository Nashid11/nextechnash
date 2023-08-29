package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dellactionPOM {
WebDriver driver;
	
	public dellactionPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//"//input[@id="twotabsearchtextbox"] "

	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/button/span")
	WebElement Action_Service;
	public WebElement service(){
	return Action_Service;
	}

	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[3]/a")
	WebElement Click_viewallservice;
	public WebElement viewallservice(){
	return Click_viewallservice;
	}

	}


	//"//*[@id="unified-masthead-navigation"]/nav/ul/li[4]/ul/li[3]/a"

	

