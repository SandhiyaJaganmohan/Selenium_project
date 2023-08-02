package com.SeleProj6am;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SamplePractise {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver()  ;
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://letcode.in/dropable");
    driver.manage().window().maximize();
    System.out.println(driver.getCurrentUrl());
    System.out.println(driver.getTitle());
	}

}
