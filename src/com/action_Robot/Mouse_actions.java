package com.action_Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_actions {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver()  ;
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://www.myntra.com/");
    driver.manage().window().maximize();
    
    WebElement kid = driver.findElement(By.xpath("//a[@href='/shop/kids'][@data-index='2']"));
    Actions action = new Actions(driver);
    action.moveToElement(kid).build().perform();
    //contextclick --right click
    //Doubleclick()
    
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    
	}

}
