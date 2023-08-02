package com.Xpath_concept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath_GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver()  ;
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("APjFqb")).sendKeys("testing");
		List<WebElement> list =driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	System.out.println(list.size());
	// to print all suggestions in list - use for loop
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i).getText());
		//from the suggestions, wanna click the required keyword
		if(list.get(i).getText().contains("java download")) {
			list.get(i).click();
			break;
		}
	}
	}

}
