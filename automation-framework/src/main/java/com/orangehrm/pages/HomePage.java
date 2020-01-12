package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.orangehrm.common.WebDriverFactory;



public class HomePage {
	
	@FindBy(id ="welcome")
	WebElement  welcomeText;
	
	@FindBy(id = "menu_admin_viewAdminModule")
	
	WebElement adminbtn;
	
	WebDriverWait wait = new WebDriverWait(WebDriverFactory.getWebDriver(), 30);
	
	public HomePage()
	
	{
		
		PageFactory.initElements(WebDriverFactory.getWebDriver(), this);
		
	}
	
	public HomePage verifyWelcome (String welcometext)
	
	{
		Assert.assertEquals(welcomeText.getText(), welcometext);
		
		System.out.println("Welcometext seen");	
		
		return this;
	}
	
	public AdminPage clickonAdminbtn ()

	{   
		adminbtn.click();	
		return new AdminPage();
		
	}
	
	public HomePage IsPageLoaded ()
	
	{
		wait.until(ExpectedConditions.elementToBeClickable(adminbtn));
		return this;
		
		
	}

}
