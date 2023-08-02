package com.AlertConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameCon {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver()  ;
    driver.get("https://letcode.in/frame");
    driver.manage().window().maximize();
    driver.switchTo().frame(0);
    driver.findElement(By.name("fname")).sendKeys("Sandy");
    driver.switchTo().frame(1);
    driver.findElement(By.name("email")).sendKeys("safugja@657");
    driver.switchTo().parentFrame();
    driver.findElement(By.name("fname")).sendKeys("Jagan");
    driver.switchTo().defaultContent();
    List<WebElement> frameCount =driver.findElements(By.tagName("iframe"));
    int size =frameCount.size();
    System.out.println(size);
	}

}
