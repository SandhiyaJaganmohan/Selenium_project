package com.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver()  ;
    driver.get("https://letcode.in/frame");
    driver.manage().window().maximize();
    
    //switch to frame
    
    driver.switchTo().frame(0);
    driver.findElement(By.name("fname")).sendKeys("summa");
    
   WebElement inner = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
    
    driver.switchTo().frame(inner);
    driver.findElement(By.name("email")).sendKeys("san@gmail.com");
    
    driver.switchTo().parentFrame();
    driver.findElement(By.name("fname")).sendKeys(" try pannra");
    
    driver.switchTo().defaultContent();
    driver.findElement(By.xpath("//a[@class='card-footer-item']")).click();
    
    List<WebElement> frameCount=driver.findElements(By.tagName("div"));
    int size =frameCount.size();
    System.out.println(size);

	}

}
