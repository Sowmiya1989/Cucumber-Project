package org.pojo;

import org.baseclass.LibMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPojo extends LibMethods
{
	public SearchHotelPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement roomNos;
	
	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotels() {
		return hotels;
	}


	public WebElement getRoomType() {
		return roomType;
	}


	public WebElement getRoomNos() {
		return roomNos;
	}


	public WebElement getDateIn() {
		return dateIn;
	}


	public WebElement getDateOut() {
		return dateOut;
	}


	public WebElement getAdultRoom() {
		return adultRoom;
	}


	public WebElement getChildRoom() {
		return childRoom;
	}


	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(id="datepick_in")
	private WebElement dateIn;
	
	@FindBy(id="datepick_out")
	private WebElement dateOut;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childRoom;
	
	
	@FindBy(id="Submit")
	private WebElement submit;
}
