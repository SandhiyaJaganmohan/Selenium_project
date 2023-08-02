package com.interviewQues;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_using_Sendkeys {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"./Drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver()  ;
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
WebElement search = driver.findElement(By.id("APjFqb"));

JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("document.getElementById('APjFqb').value='Selenium'");
}
}