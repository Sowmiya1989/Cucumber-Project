package org.step;

import java.util.concurrent.TimeUnit;

import org.baseclass.LibMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pojo.BookHotelPojo;
import org.pojo.LoginPojo;
import org.pojo.SearchHotelPojo;
import org.pojo.SelectHotelPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends LibMethods {
	@Given("By using Adactin Hotel page application")
	public void by_using_Adactin_Hotel_page_application() {
		browserLaunch();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	}

	@When("User  enter the login details {string} and {string}")
	public void user_enter_the_login_details_and(String string, String string2) {
		LoginPojo l = new LoginPojo();
		sendKeys(l.getUser(), string);
		sendKeys(l.getPass(), string2);
		buttonClick(l.getLogin());
	}

	@When("User will choose search hotel page by location,hotels,roomtype,roomnumbers,checkindate,checkoutdate,adultsroom,childroom and login")
	public void user_will_choose_search_hotel_page_by_location_hotels_roomtype_roomnumbers_adultsroom_childroom_and_login() {
		SearchHotelPojo s = new SearchHotelPojo();
		selectByVisibleText(s.getLocation(), "Melbourne");
		selectByVisibleText(s.getHotels(), "Hotel Creek");
		selectByVisibleText(s.getRoomType(), "Double");
		selectByVisibleText(s.getRoomNos(), "4 - Four");
		sendKeys(s.getDateIn(), "28/11/2020");
		sendKeys(s.getDateOut(), "29/11/2020");
		selectByVisibleText(s.getAdultRoom(), "3 - Three");
		selectByVisibleText(s.getChildRoom(), "2 - Two");
		buttonClick(s.getSubmit());
	}

	@When("User  select hotel by click and continue")
	public void user_select_hotel_by_click_and_continue()
	{
		SelectHotelPojo sh = new SelectHotelPojo();
		radioClick(sh.getRadioClick());
		buttonClick(sh.getCont());
	}

	@When("User books the hotel by {string},{string},{string},{string},ccType,expirydate,expirymonth,{string} and book the hotel")
	public void user_books_the_hotel_by_ccType_expirydate_expirymonth_and_book_the_hotel(String string, String string2,
			String string3, String string4, String string5) 
	{
			BookHotelPojo b = new BookHotelPojo();
			sendKeys(b.getFirstName(), string);
			sendKeys(b.getLastName(), string);
			sendKeys(b.getAddress(), string);
			sendKeys(b.getCcNum(), string);
			selectByVisibleText(b.getType(), "VISA");
			selectByVisibleText(b.getMonth(), "February");
			selectByVisibleText(b.getYear(), "2022");
			sendKeys(b.getCvv(), string);
			buttonClick(b.getBookNow());
	}

	@When("User have an order id")
	public void user_have_an_order_id() {

	}

}
