package com.Sample_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Google {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver()  ;
    driver.get("https://www.google.co.in/");
    driver.manage().window().maximize();
//    driver.findElement(By.id("APjFqb"))
//    .sendKeys("dominos pizza"+Keys.ENTER);
//    
//    driver.findElement(By.partialLinkText
//    		("Domino's Pizza – Order Online")).click();
    
    driver.navigate().to("https://www.saucedemo.com/");
    
   WebElement username= driver.findElement(By.name("user-name"));
   username.sendKeys("performance_glitch_user");
   username.clear();
   
   
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();
	}

}
    