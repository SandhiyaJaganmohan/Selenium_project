package com.javascriptExecutorConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Methods {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver()  ;
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://letcode.in");
		driver.manage().window().maximize();
		//scrolling function
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)");
		Thread.sleep(3000);
		js.executeScript("window.scroll(0,-1000)");
		//end of the page -scrolling
		js.executeScript("window.scroll(0,document.body.scrollHeight)");
		//returning back to starting of the page 
		Thread.sleep(3000);
        js.executeScript("window.scroll(0,0)");
        //scroll to specific element 
        WebElement element = driver.findElement(By.xpath("//a[text()='Explore Workspace']"));
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}

}
