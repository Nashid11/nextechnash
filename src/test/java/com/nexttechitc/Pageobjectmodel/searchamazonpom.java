package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchamazonpom {
	
	WebDriver driver;
	
	public searchamazonpom (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	
	}
	
	//"//input[@id="twotabsearchtextbox"] "  

	@FindBy(name="field-keywords")//Decclare the locator
	WebElement Type_Amazonsearch; // Decclare the 
	public WebElement Amazonsearch(){
	return Type_Amazonsearch;

	}
	
	
	@FindBy(id="nav-search-submit-button")

	WebElement Click_searchicon;
	  
	public WebElement searchicon(){
	return Click_searchicon;

	}


	
}
