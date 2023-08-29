package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StampsPurchasePOM {

WebDriver driver;

public StampsPurchasePOM (WebDriver driver) {
this.driver =driver;
PageFactory.initElements(driver,this);

}
@FindBy(xpath="/html/body/div[6]/div[1]/div/div/div[2]/div/a/img")
WebElement stamps_supplies;
public WebElement stamps() {
	return stamps_supplies;
}
@FindBy(xpath="/html/body/div[3]/div[5]/div/div[2]/div[1]/div/a/div/img")
WebElement stamps_flags;
public WebElement flags() {
	return stamps_flags;
}
@FindBy(xpath=" //*[@id=\"122704\"]/span[2]")
WebElement choose_format;
public WebElement format() {
	return choose_format;
}

//@FindBy(xpath=" //*[@id=\"cartQuantity\"]")

//public WebElement quantity; 
	 


@FindBy(xpath=" //*[@id=\"addToCartVisBtn122704\"]")
WebElement click_chart;
public WebElement chart() {
	return click_chart; 

}

@FindBy(xpath=" //*[@id=\"atg_button_checkout\"]")
WebElement click_checkout;
public WebElement checkout() {
	return click_checkout; 
}
@FindBy(xpath=" //*[@id=\"btn-guest-checkout-test\"]")
WebElement click_guest;
public WebElement guest() {
	return click_guest; 
}

@FindBy(xpath=" //*[@id=\"custFirstName\"]")
WebElement First_Name;
public WebElement First() {
	return First_Name; 
}
@FindBy(xpath=" //*[@id=\"custLastName\"]")
WebElement Last_Name;
public WebElement Last() {
	return Last_Name; 

}
@FindBy(xpath=" //*[@id=\"custPhone\"]")
WebElement phone_number;
public WebElement phone() {
	return phone_number; 
}

@FindBy(xpath=" //*[@id=\"custEmail\"]")
WebElement email_address;
public WebElement email() {
	return email_address; 
}
@FindBy(xpath=" //*[@id=\"billingInfo\"]/div[5]/div/div[1]/div/label/span")
WebElement select_sameaddress;
public WebElement sameabove() {
	return select_sameaddress; 
}
@FindBy(xpath=" //*[@id=\"shipAddress1\"]")
WebElement enter_address;
public WebElement address() {
	return enter_address; 
}
@FindBy(xpath=" //*[@id=\"shipAddress2\"]")
WebElement enter_address1;
public WebElement address1() {
	return enter_address1; 

}
@FindBy(xpath=" //*[@id=\"shipCity\"]")
WebElement enter_city;
public WebElement city() {
	return enter_city; 
}
@FindBy(xpath=" //*[@id=\"shipState\"]")
WebElement select_state;
public WebElement state() {
	return select_state; 

}
@FindBy(xpath=" //*[@id=\"shipZip\"]")
WebElement enter_zip;
public WebElement zip() {
	return enter_zip; 
}
@FindBy(xpath=" //*[@id=\"moveToBillingBtn\"]/span")
WebElement click_checkout1;
public WebElement checkout1() {
	return click_checkout1; 

}
@FindBy(xpath=" //*[@id=\"normal-shipping\"]")
WebElement click_shipping;
public WebElement shipping() {
	return click_shipping; 

}
@FindBy(xpath=" //*[@id=\"atg_store_checkoutShippingMethod\"]/div[5]/div/a")
WebElement click_confirm;
public WebElement confirm() {
	return click_confirm; 

}

}


