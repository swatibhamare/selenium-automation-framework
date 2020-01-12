package com.orangehrm.test;
import org.testng.annotations.Test;

import com.orangehrm.common.BaseSelenium;
import com.orangehrm.pages.LoginPage;

public class LoginTest extends BaseSelenium{
	
	
	@Test (groups={"critical","LoginModule"})
	public void verifAdminLoginSucessfull ()
	
	{	
		LoginPage lpage = new LoginPage();//default constructor
		lpage.IsPageLoaded().login("swati", "Test_123");
		//lpage.login("swati", "Test_123")
			.verifyWelcome("Welcome Admin");
	}
	
	@Test
	public void verifyWelcomeText ()
	
	{
       LoginPage lpage = new LoginPage();//default constructor
	   lpage.login("swati", "Test_123")
	   		.verifyWelcome("Welcome Admin");		
	}
		
	@Test 	
   public void verifyLoginUnsucessfull ()
	
	{
		//System.setProperty("webWebDriverFactory.threadLevelStorage.get()iver.chrome.WebDriverFactory.threadLevelStorage.get()iver","c:\\selenium\\chromeWebDriverFactory.threadLevelStorage.get()iver.exe");
		//WebWebDriverFactory.threadLevelStorage.get()iverWebDriverFactory.getWebDriver() = new ChromeWebDriverFactory.threadLevelStorage.get()iver ();
		//WebDriverFactory.threadLevelStorage.get().get("http://127.0.0.1/orangehrm-3.3.1/symfony/web/index.php/auth/login");
		
		LoginPage lpage = new LoginPage();//default constructor
	    lpage.login("swati", "abcd")
	    	.verifyWelcome("Invalid credentials");	
	
	}
		
	@Test(enabled = true)
	public void verifyLoginWithSpecialChars()
	{
		LoginPage lpage = new LoginPage();//default constructor
	    lpage.loginForInvalidCredentials("swati", "@#$%")
	    	.verifyErrorMsg("Invalid credentials");
	}
	
   
    @Test (groups={"critical","LoginModule"})
	public void verifyLoginWithBlankUserName()
	{	
		
    	LoginPage lpage = new LoginPage();//default constructor
	    lpage.login("", "Test_123");

	    lpage.verifyErrorMsg("Username cannot be empty");
	    
	    System.out.println("Blank Username cant be send");
	
	}

	@Test (groups={"critical","LoginModule"})
	public void verifyLoginWithBlankPassword()
	{
		LoginPage lpage = new LoginPage();//default constructor
	    lpage.login("swati", "");

	    lpage.verifyErrorMsg("Password cannot be empty");
	    
	    System.out.println("Blank password cant be send");
	
	}
	
}
	
/*	@Test (groups={"critical","LoginModule"})
	public void verifyLinkedINLogo()
	{
		
		
		WebElement Lnlogo =WebDriverFactory.getWebDriver().findElement(By.xpath("//img[@alt = 'LinkedIn OrangeHRM group']"));
		Assert.assertEquals(Lnlogo.isDisplayed(),true);
		System.out.println("LinkedIN Logo Displayed");
	}

	@Test (groups={"critical","LoginModule"})
	public void verifyFaceBookLogo()
	{
	    WebElement fblogo =WebDriverFactory.getWebDriver().findElement(By.xpath("//img[@alt = 'OrangeHRM on Facebook']"));
		Assert.assertEquals(fblogo.isDisplayed(),true);
		System.out.println("FaceBook Logo Displayed.");
	}


	
	
	@Test (groups={"critical","LoginModule"})
	public void verifyLoginWithMaxLengthOfUsername()
	{
		
		WebElement username =WebDriverFactory.getWebDriver().findElement(By.id("txtUsername"));
		username.sendKeys("swatiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
		WebElement password=WebDriverFactory.getWebDriver().findElement(By.id("txtPassword"));
		password.sendKeys("");
		WebElement loginbtn =WebDriverFactory.getWebDriver().findElement(By.id("btnLogin"));
		loginbtn.click();
		WebElement invaliddata =WebDriverFactory.getWebDriver().findElement(By.id("spanMessage"));
		invaliddata.isDisplayed();
		invaliddata.getText();
		System.out.println("Login Failed"+invaliddata);
	
	}

	@Test (groups={"critical","LoginModule"})
	public void verifyLoginWithMinLengthOfPassword()
	{
		
		WebElement username =WebDriverFactory.getWebDriver().findElement(By.id("txtUsername"));
		username.sendKeys("swati");
		WebElement password=WebDriverFactory.getWebDriver().findElement(By.id("txtPassword"));
		password.sendKeys("a12");
		WebElement loginbtn =WebDriverFactory.getWebDriver().findElement(By.id("btnLogin"));
		loginbtn.click();
		WebElement invaliddata =WebDriverFactory.getWebDriver().findElement(By.id("spanMessage"));
		invaliddata.isDisplayed();
		invaliddata.getText();
		System.out.println("Login Failed"+invaliddata);
		WebDriverFactory.getWebDriver().quit();
	}

	
}
*/
