package org.step;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.baseclass.LibMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefAdactin extends LibMethods
{	
	
	public WebDriver driver;
	
	@Given("By using Adactin Hotel page application")
	public void by_using_Adactin_Hotel_page_application() {
	 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	}

	@When("User  enter the login details username and password")
	public void user_enter_the_login_details_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	   
		List<String> asList = dataTable.asList();
		String string = asList.get(0);
	    System.out.println(string);
	    
	    driver.findElement(By.id("username")).sendKeys(string);
	    
	    String string2 = asList.get(1);
	    System.out.println(string2);
	    
	    WebElement pass = driver.findElement(By.id("password"));
	    pass.sendKeys(string2);
	    String attribute = pass.getAttribute("Value");
	    System.out.println(attribute);
	}

	@When("User will click the button")
	public void user_will_click_the_button() {
		driver.findElement(By.id("login")).click();
	}
	
	


}
