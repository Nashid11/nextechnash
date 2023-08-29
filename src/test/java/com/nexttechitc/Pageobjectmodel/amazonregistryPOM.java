package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class amazonregistryPOM {
WebDriver driver;
	
	public amazonregistryPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//"//input[@id="twotabsearchtextbox"] "

	//@FindBy(xpath="//a[@href=\"/gp/browse.html?node=16115931011&ref_=nav_cs_registry\"]")
	//WebElement Click_amazonregistry;
	//public WebElement Amazonsearch(){
	//return Click_amazonregistry;

	 
	
	
	@FindBy(xpath="//*[@id=\"nav-xshop\"]/a[11]")

	WebElement Click_registry;
	  
	public WebElement registry(){
	return Click_registry;

	}


	////*[@id="nav-xshop"]/a[11]

	
	///html/body/div[1]/header/div/div[4]/div[2]/div[2]/div/a[11]
	}

