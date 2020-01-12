package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.orangehrm.common.WebDriverFactory;

public class LoginPage {
	
	
	@FindBy(id="txtUsername")
	WebElement  username;
	
	@FindBy(id= "txtPassword")
	WebElement  password;
	
	@FindBy(id ="btnLogin")
	WebElement  loginbtn;
	
	@FindBy (id = "spanMessage")
	WebElement spanText;
	
	//WebDriver wait;
	WebDriverWait wait = new WebDriverWait(WebDriverFactory.getWebDriver(), 30);
	
	public LoginPage()
	{
		PageFactory.initElements(WebDriverFactory.getWebDriver(), this);
		
		
	}
	
	public HomePage login (String strUsername, String strPassword)
	
	{
		username.sendKeys(strUsername);
		password.sendKeys(strPassword);
		loginbtn.click();
		return new HomePage();
	}
	
	
	
	public LoginPage loginForInvalidCredentials (String strUsername, String strPassword)
	
	{
		username.sendKeys(strUsername);
		password.sendKeys(strPassword);
		loginbtn.click();
		return this;
	}
	public LoginPage verifyErrorMsg (String spanMsgText)
	
	{
		Assert.assertEquals(spanText.getText(),spanMsgText ,"Invalid Log in spam message seen");
		return this; //log in page object
	}
	
	
	public LoginPage IsPageLoaded()
	
	{   wait.until(ExpectedConditions.elementToBeClickable(loginbtn));
	    wait.until(ExpectedConditions.elementToBeClickable(username));
	    wait.until(ExpectedConditions.elementToBeClickable(password));
		return this;
		
	}
}
