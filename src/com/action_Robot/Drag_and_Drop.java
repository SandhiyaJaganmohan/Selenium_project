package com.action_Robot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver()  ;
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://letcode.in/dropable");
    driver.manage().window().maximize();
    Actions action = new Actions(driver);
    WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
    WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));
    
    //action.clickAndHold(source).moveToElement(target).release(target).build().perform();
    action.dragAndDrop(source, target).build().perform();
	}

}
