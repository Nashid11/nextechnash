package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpFaqsPOM {

   WebDriver driver;
   
   public HelpFaqsPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

}
   @FindBy(xpath="//*[@id=\"g-navigation\"]/div/nav/ul/li[7]/a[2]")
	WebElement click_help;
	public WebElement Help() {
		return click_help;
 
   }
	@FindBy(xpath="//*[@id=\"g-navigation\"]/div/nav/ul/li[7]/div/ul/li[1]/a")
	WebElement click_Faqs;
	public WebElement FAQs() {
		return click_Faqs;
	
	
	}
}