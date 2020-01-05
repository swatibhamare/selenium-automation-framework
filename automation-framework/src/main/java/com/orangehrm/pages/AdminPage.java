package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.common.WebDriverFactory;

public class AdminPage {
	
	@FindBy(id = "btnAdd") 
	WebElement addbtn;
	
	public AdminPage()
	
	{
		PageFactory.initElements(WebDriverFactory.getWebDriver(), this);
	}
	
	
	public AddUserPage clickonAddbtn()
	{
		addbtn.click();
		return new AddUserPage();
	}
	
	

}
