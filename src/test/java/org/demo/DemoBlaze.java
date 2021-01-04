package org.demo;

import java.util.concurrent.TimeUnit;

import org.baseclass.LibMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DemoBlaze extends LibMethods
{
	@Given("Open the url link of demoblaze application")
	public void open_the_url_link_of_demoblaze_application() 
	{
		browserLaunch();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	}

	@When("User going to click the product")
	public void user_going_to_click_the_product() 
	{
			driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")).click();
	}

	@When("User giving add to cart product and click alert")
	public void user_giving_add_to_cart_product_and_click_alert() throws InterruptedException 
	{
		driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
		Thread.sleep(2000);
		alertAccept();
	}

	@When("User go to the cart page")
	public void user_go_to_the_cart_page() 
	{
			driver.findElement(By.xpath("//a[@id='cartur']")).click();
			driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
	}

	@When("User going to place order by {string} , {string} , {string} , {string} , {string} , {string}")
	public void user_going_to_place_order_by(String string, String string2, String string3, String string4, String string5, String string6) 
	{
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys(string);
			driver.findElement(By.xpath("//input[@id='country']")).sendKeys(string2);
			driver.findElement(By.xpath("//input[@id='city']")).sendKeys(string3);
			driver.findElement(By.xpath("//input[@id='card']")).sendKeys(string4);
			driver.findElement(By.xpath("//input[@id='month']")).sendKeys(string5);
			driver.findElement(By.xpath("//input[@id='year']")).sendKeys(string6);
			driver.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();


	}

}
