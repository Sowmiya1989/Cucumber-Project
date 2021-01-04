package org.pojo;

import org.baseclass.LibMethods;
import org.openqa.selenium.support.PageFactory;


public class LoginPojoAmazon extends LibMethods
{
	public LoginPojoAmazon() {
		PageFactory.initElements(driver, this);
	}
}
