package org.step;

import java.util.concurrent.TimeUnit;

import org.baseclass.LibMethods;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefAmazon extends LibMethods
{
	public WebDriver driver;
	@Given("End user wants to open the Amazon application.")
	public void end_user_wants_to_open_the_Amazon_application() 
	{
			WebDriverManager.chromedriver().setup();
			driver.get("https://www.amazon.in/");
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			
			
	}

	@When("End user enters the login details.")
	public void end_user_enters_the_login_details()
	{
			
	}

	@When("User will search the product.")
	public void user_will_search_the_product() {
	   
	}

	@When("User will add the product it to the cart.")
	public void user_will_add_the_product_it_to_the_cart() {
	    
	}

	@When("User starts paying the payment.")
	public void user_starts_paying_the_payment() {
	    
	}



}
