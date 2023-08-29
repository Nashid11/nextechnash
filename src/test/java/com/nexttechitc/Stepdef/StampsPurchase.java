package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttechitc.Pageobjectmodel.StampsPurchasePOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StampsPurchase {
	
	WebDriver driver;
	
	@Given("^visit usps$")
	public void visit_usps() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	   
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    
	    driver.get("https://www.usps.com/");
	    driver.manage().window().maximize();
	   Thread.sleep(3000);
	}

	@When("^user click stamps & Supplies and click us flag stamp$")
	public void user_click_stamps_Supplies_and_click_us_flag_stamp() throws Throwable {
		StampsPurchasePOM obj=new StampsPurchasePOM (driver);
		obj.stamps().click();
		obj.flags().click();
		Thread.sleep(4000);
		}

	@When("^user on format and click add to chart and click on check out now$")
	public void user_on_format_and_click_add_to_chart_and_click_on_check_out_now() throws Throwable {
		StampsPurchasePOM obj=new StampsPurchasePOM (driver);
		obj.format().click();
		obj.chart().click();
		Thread.sleep(9000);
		obj.checkout().click();
	}

	@When("^user click on check out as a Guest and able to rediect to the contact information page$")
	public void user_click_on_check_out_as_a_Guest_and_able_to_rediect_to_the_contact_information_page() throws Throwable {
		StampsPurchasePOM obj=new StampsPurchasePOM (driver);
		obj.guest().click();
	    Thread.sleep(4000);
	
	}

	@When("^user enter \"([^\"]*)\" and enter \"([^\"]*)\" and enter \"([^\"]*)\" and enter \"([^\"]*)\" and click same as avobe box$")
	public void user_enter_and_enter_and_enter_and_enter_and_click_same_as_avobe_box(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		StampsPurchasePOM type =new StampsPurchasePOM (driver);
		type.First().sendKeys(arg1);
		type.Last().sendKeys(arg2);
		type.phone().sendKeys(arg3);
		type.email().sendKeys(arg4);
		type.sameabove().click();
	   Thread.sleep(5000);
	
	}

	@When("^user enter \"([^\"]*)\" and enter \"([^\"]*)\" enter \"([^\"]*)\" and select state and enter \"([^\"]*)\" and clcik check out button$")
	public void user_enter_and_enter_enter_and_select_state_and_enter_and_clcik_check_out_button(String arg1, String arg2, String arg3, String arg4) throws Throwable {
		StampsPurchasePOM type1 =new StampsPurchasePOM (driver);
	    type1.address().sendKeys(arg1);
	    type1.address1().sendKeys(arg2);
	    type1.city().sendKeys(arg3);
	    Select dropdown1=new Select(type1.state());
	    dropdown1.selectByVisibleText("NY - New York");
	    type1.zip().sendKeys(arg4);
	    type1.checkout1().click();
	 Thread.sleep(5000);
	}

	@When("^user select shipping method and click confirm shipment$")
	public void user_select_shipping_method_and_click_confirm_shipment() throws Throwable {
		StampsPurchasePOM type1 =new StampsPurchasePOM (driver);
	    type1.shipping().click();
	    type1.confirm().click();
	Thread.sleep(3000);
	}

	@Then("^user able to see billing page$")
	public void user_able_to_see_billing_page() throws Throwable {
	    
	}


}
