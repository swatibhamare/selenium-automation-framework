package com.orangehrm.common;

import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
	
	
	//public static WebDriver dr;
	private static ThreadLocal <WebDriver> threadLevelStorage=new ThreadLocal<WebDriver>();
	
	//ThreadLocal is variable of data type WebDrier <Data type>
	
	
    protected static void setWebDriver(WebDriver dr) {
		
		threadLevelStorage.set(dr);
	}


	public static WebDriver getWebDriver(){
		
		return threadLevelStorage.get();
	}
	

}
