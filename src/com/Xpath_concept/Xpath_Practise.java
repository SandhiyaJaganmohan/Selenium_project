package com.Xpath_concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Practise {
	
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver",
					"./Drivers/chromedriver_win32/chromedriver.exe");
		
			WebDriver driver = new ChromeDriver()  ;
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

			driver.get("https://selectorshub.com/xpath-practice-page/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[contains(text(),'Joe.')]/parent::td[@class='left']/preceding-sibling::td//input")).click();

	}

}
