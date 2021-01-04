package org.pojo;

import org.baseclass.LibMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPojo extends LibMethods
{
	public SelectHotelPojo() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radioClick;
	
	@FindBy(id="continue")
	private WebElement cont;

	public WebElement getRadioClick() {
		return radioClick;
	}

	public WebElement getCont() {
		return cont;
	}
	
}
