package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.orangehrm.common.WebDriverFactory;

public class AddUserPage {
	
	@FindBy(name ="systemUser[userType]")
	WebElement userRole;
	
	@FindBy(name ="")
	WebElement employeeName;
	
	@FindBy(name ="systemUser[userType]")
	WebElement userName;
	
	@FindBy(name ="systemUser[userType]")
	WebElement password;
	
	@FindBy(name ="systemUser[userType]")
	WebElement confirmPassword;
	
	@FindBy(name ="systemUser[userType]")
	WebElement saveButton;
	
	
	public AddUserPage()
	
	{

	PageFactory.initElements(WebDriverFactory.getWebDriver(), this);
	
    }	


	public AdminPage addUser(String role, String strEmployeeName, String strUserName, String strPassword, String strConfirmPassword) {
		
		Select userRoleDropDown = new Select(userRole);
		userRoleDropDown.selectByVisibleText(role);
		
		employeeName.sendKeys(strEmployeeName);
		userName.sendKeys(strUserName);
		password.sendKeys(strPassword);
		confirmPassword.sendKeys(strConfirmPassword);
		saveButton.click();
		
		return new AdminPage();
	}	
	
}
