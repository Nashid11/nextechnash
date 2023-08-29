package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class USPSregPOM {
	WebDriver driver;

	public USPSregPOM (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}

	@FindBy(xpath="//*[@id=\"login-register-header\"]")
	WebElement register;
	public WebElement Register() {
		return register;
	}

	@FindBy(xpath="//*[@id=\"sign-up-button\"]")
	WebElement signup_now;
	public WebElement Signup() {
		return signup_now;
	}

	@FindBy(xpath="//*[@id=\"slanguage\"]")
	
	public WebElement language;
		
	

   @FindBy(xpath="//*[@id=\"tuserName\"]")
   WebElement user_name;
   public WebElement username() {
	return user_name;
}
   @FindBy(xpath="//*[@id=\"tPassword\"]")
	WebElement pass_word;
	public WebElement pw() {
		return pass_word;
	}

	@FindBy(xpath="//*[@id=\"tPasswordRetype\"]")
	WebElement re_pass_word;
	public WebElement re_pw() {
		return re_pass_word;

}
	@FindBy(xpath="//*[@id=\"ssec1\"]")
	WebElement s_question;
	public WebElement security_question() {
		return s_question;
	
	}
	
	@FindBy(xpath="//*[@id=\"tsecAnswer1\"]")
	WebElement s_ans1;
	public WebElement ans1() {
		return s_ans1;
	}
	
	@FindBy(xpath="//*[@id=\"tsecAnswer1Match\"]")
	WebElement re_s_ans1;
	public WebElement re_ans1() {
		return re_s_ans1;
	
	}
	
	@FindBy(xpath="//*[@id=\"ssec2\"]")
	WebElement s_question1;
	public WebElement security_question1() {
		return s_question1;
	
	}
	@FindBy(xpath="//*[@id=\"tsecAnswer2\"]")
	WebElement s_ans2;
	public WebElement ans2() {
		return s_ans2;
	}
		
	@FindBy(xpath="//*[@id=\"tsecAnswer2Match\"]")
	WebElement re_s_ans2;
	public WebElement re_ans2() {
		return re_s_ans2;
	}
	@FindBy(xpath="//*[@id=\"for-rAccount1\"]")
	WebElement account_type;
	public WebElement account() {
		return account_type;
	}

	@FindBy(xpath="//*[@id=\"stitle\"]")
	WebElement select_title;
	public WebElement title() {
		return select_title;
	
	}

	@FindBy(xpath="//*[@id=\"tfName\"]")
	WebElement First_Name;
	public WebElement First() {
		return First_Name;
	}
	@FindBy(xpath="//*[@id=\"tlName\"]")
	WebElement Last_Name;
	public WebElement Last() {
		return Last_Name;
	}
	@FindBy(xpath="//*[@id=\"temail\"]")
	WebElement email_address;
	public WebElement email() {
		return email_address;
	
	}
	
	@FindBy(xpath="//*[@id=\"temailRetype\"]")
	WebElement re_email_address;
	public WebElement re_email() {
		return re_email_address;

	}

	@FindBy(xpath="//*[@id=\"sphoneType\"]")
	
	public WebElement phtype;
	
	@FindBy(xpath="//*[@id=\"tphone\"]")
	WebElement phone_number;
	public WebElement phone() {
		return phone_number;

	
	}
	@FindBy(xpath="//*[@id=\"scountry\"]")
	WebElement select_country;
	public WebElement county() {
		return select_country;

	}
	@FindBy(xpath="//*[@id=\"taddress\"]")
	WebElement street_address;
	public WebElement Address() {
		return street_address;
	
	}
	@FindBy(xpath="//*[@id=\"tcity\"]")
	WebElement my_city;
	public WebElement City() {
		return my_city;
	}

	@FindBy(xpath="//*[@id=\"sstate\"]")
	WebElement select_state;
	public WebElement State() {
		return select_state;
	
	}
	@FindBy(xpath="//*[@id=\"tzip\"]")
	WebElement zip_code;
	public WebElement code() {
		return zip_code;
	
	}
	
	@FindBy(xpath="//*[@id=\"a-address-step1\"]")
	WebElement verify_address;
	public WebElement verify() {
		return verify_address;
	
	}
}
		



