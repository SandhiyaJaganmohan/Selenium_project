package com.Sample_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
public static void main(String[] args) {
	
	//setting the browser environment
	System.setProperty("webdriver.chrome.driver",
			"./Drivers/chromedriver_win32/chromedriver.exe");
	
	//creating object for webdriver
	WebDriver driver = new ChromeDriver();
	
	//launching the browser
	driver.get("https://www.amazon.in/");
	
	//to maximize the window
	driver.manage().window().maximize();
	
	//navigate to another url
	
	driver.navigate().to("https://web.whatsapp.com/");
	
	//back to current window/page
	
	driver.navigate().back();
	
	//forward to next page 
	
	driver.navigate().forward();
	
	//refresh the page
	
	driver.navigate().refresh();
	
	// close the current entire browsing session
	driver.quit();
	
	//close the all active windows
	driver.close();
	
	
	
	
	
	
	
}
}
