package com.orangehrm.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.pages.LoginPage;

public class AddUserTest extends BaseSelenium {
	
	@Test
	public void verifyAdminUserGettingAddedSuccessfuly()
	{
		
		LoginPage lp = new LoginPage();
		
		lp.login("swati", "Test_123")
			.verifyWelcome("Welcome Admin")
				.clickonAdminbtn()
					.clickonAddbtn()
						.addUser("Admin", "Swati", "User123","Password_123","Password_123");
	}
	
	

	@Test
	public static void AddUserWithAdminRole()
	
	{
		LoginPage lp = new LoginPage();
		
		lp.login("swati", "Test_123")
		  .verifyWelcome("Welcome Admin")
		    .clickonAdminbtn()
		     .clickonAddbtn()
		      .addUser("Admin", "ABC", "ABC_123", "Test_123", "Test_123");
		
	}
	
	@Test
	public static void AddUserWithESSRole()
	
	{
        LoginPage lp = new LoginPage();
		
		lp.login("swati", "Test_123")
		  .verifyWelcome("Welcome Admin")
		    .clickonAdminbtn()
		     .clickonAddbtn()
		      .addUser("ESS", "XYZ", "XYZ_123", "Test_123", "Test_123");
		
	}
	
	@Test
	public static void AddUserWithDisabledStatus()
	
	{
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		//System.setProperty("webdriver.geckodriver.driver", "C:\\Selenium\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer.exe");
		
		//WebDriver dr = new 
		//WebDriver dr = new InternetExplorerDriver();
		WebDriver dr = new ChromeDriver();
		//Webdriver - Userdefined datatype , dr - variable or Object  
		
		dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");

		WebElement userName= dr.findElement(By.id("txtUsername"));
		userName.sendKeys("swati");
		WebElement password = dr.findElement(By.name("txtPassword"));
		password.sendKeys("Test_123");
		WebElement loginBtn = dr.findElement(By.id("btnLogin"));
		loginBtn.click();
		
		WebElement admnMenu = dr.findElement(By.id("menu_admin_viewAdminModule"));
		admnMenu.click();
		WebElement addUserBtn = dr.findElement(By.id("btnAdd"));
		addUserBtn.click();
		
		WebElement userrole = dr.findElement(By.name("systemUser[userType]"));
		
		Select dropdown = new Select (userrole);
		dropdown.selectByValue("0");
		WebElement empName = dr.findElement(By.id("systemUser_employeeName_empName"));
		empName.sendKeys("fdfsdf efg");
		WebElement usrNm = dr.findElement(By.id("systemUser_userName"));
		usrNm.sendKeys("Emp8765");
		
		WebElement status = dr.findElement(By.id("systemUser_status"));
		Select dropdn =  new Select (status);
		dropdn.selectByValue("0");
		
		WebElement psw = dr.findElement(By.id("systemUser_password"));
		psw.sendKeys("Test@123");
		WebElement confrmpsw = dr.findElement(By.id("systemUser_confirmPassword"));
		confrmpsw.sendKeys("Test@123");
		WebElement saveBtn = dr.findElement(By.id("btnSave"));
		saveBtn.click();
		
	}
	
	@Test
	public static void AddUserWithEnabledStatus()
	
	{
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		//System.setProperty("webdriver.geckodriver.driver", "C:\\Selenium\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer.exe");
		
		//WebDriver dr = new 
		//WebDriver dr = new InternetExplorerDriver();
		WebDriver dr = new ChromeDriver();
		//Webdriver - Userdefined datatype , dr - variable or Object  
		
		dr.get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");

		WebElement userName= dr.findElement(By.id("txtUsername"));
		userName.sendKeys("swati");
		WebElement password = dr.findElement(By.name("txtPassword"));
		password.sendKeys("Test_123");
		WebElement loginBtn = dr.findElement(By.id("btnLogin"));
		loginBtn.click();
		
		WebElement admnMenu = dr.findElement(By.id("menu_admin_viewAdminModule"));
		admnMenu.click();
		WebElement addUserBtn = dr.findElement(By.id("btnAdd"));
		addUserBtn.click();
		
		WebElement userrole = dr.findElement(By.name("systemUser[userType]"));
		
		Select dropdown = new Select (userrole);
		dropdown.selectByValue("0");
		WebElement empName = dr.findElement(By.id("systemUser_employeeName_empName"));
		empName.sendKeys("eretert");
		WebElement usrNm = dr.findElement(By.id("systemUser_userName"));
		usrNm.sendKeys("Emp6575");
		
		WebElement status = dr.findElement(By.id("systemUser_status"));
		Select dropdwn = new Select (status);
		dropdwn.selectByValue("1");
		WebElement psw = dr.findElement(By.id("systemUser_password"));
		psw.sendKeys("Test@123");
		WebElement confrmpsw = dr.findElement(By.id("systemUser_confirmPassword"));
		confrmpsw.sendKeys("Test@123");
		WebElement saveBtn = dr.findElement(By.id("btnSave"));
		saveBtn.click();
		
	}
	
}
