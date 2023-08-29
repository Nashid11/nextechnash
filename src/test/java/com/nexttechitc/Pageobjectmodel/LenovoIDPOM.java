package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LenovoIDPOM {

	WebDriver driver;

	  public LenovoIDPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);


}
	  @FindBy(xpath="//*[@id=\"b69672ce6abb6-4d8a-986e-6d4382535a61\"]/div[4]/div[2]/div[4]/ul[1]/li[5]/div[1]/img[2]")
		WebElement drop_down;
		public WebElement dropdown() {
			return drop_down;

		}
		
		@FindBy(xpath="//*[@id=\"b69672ce6abb6-4d8a-986e-6d4382535a61\"]/div[4]/div[2]/div[4]/ul[1]/li[5]/div[2]/div[2]/p[1]/span[2]")
		WebElement click_sign;
		public WebElement sign() {
			return click_sign;

		}

		@FindBy(xpath="//*[@id=\"3a31ad87-f33b-4fa3-9ec9-7744d7c1f74d\"]/main/div[1]/div[2]/div[1]/button")
		WebElement click_createID;
		public WebElement createID() {
			return click_createID;

		
		}
		
		@FindBy(xpath="//*[@id=\"personal\"]/div[2]/span")
		WebElement click_acctype;
		public WebElement acctype() {
			return click_acctype;


}	

		@FindBy(xpath="//*[@id=\"continueEmail\"]/span")
		WebElement click_continue;
		public WebElement contemail() {
			return click_continue;

		}


		@FindBy(xpath="//*[@id=\"uEmail\"]")
		WebElement enter_email;
		public WebElement email() {
			return enter_email;
		
		}
		@FindBy(xpath="//*[@id=\"uFname\"]")
		WebElement enter_FirstName;
		public WebElement FirstName() {
			return enter_FirstName;
		
		
		}	
		
		
		@FindBy(xpath="//*[@id=\"uLname\"]")
		WebElement enter_LastName;
		public WebElement LastName() {
			return enter_LastName;
		
}
		@FindBy(xpath="//*[@id=\"upwd\"]")
		WebElement enter_PassWord;
		public WebElement password() {
			return enter_PassWord;
		
}	

		@FindBy(xpath="//*[@id=\"cpwd\"]")
		WebElement enter_rePassWord;
		public WebElement repassword() {
			return enter_rePassWord;

		}
		@FindBy(xpath="//*[@id=\"fcd6ebf7-579a-411e-bb19-8dffd8bdbd49\"]/main/div[3]/form/div[2]/div[2]/div[1]/div/input")
		WebElement click_reward;
		public WebElement reward() {
			return click_reward;

}
		@FindBy(xpath="//*[@id=\"fcd6ebf7-579a-411e-bb19-8dffd8bdbd49\"]/main/div[3]/form/div[2]/div[3]/div[1]/div[1]/div/input")
		WebElement click_emailsignup;
		public WebElement emailsign() {
			return click_emailsignup;

		}


		@FindBy(xpath="//*[@id=\"fcd6ebf7-579a-411e-bb19-8dffd8bdbd49\"]/main/div[3]/form/div[2]/div[4]/div[1]/div/input")
		WebElement click_policy;
		public WebElement policy() {
			return click_policy;


}	

		


}
		