package com.Sample_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/selenium-training/#enroll-form");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[text()='Selenium WebDriver - Basics']")).click();
		
	}

}
