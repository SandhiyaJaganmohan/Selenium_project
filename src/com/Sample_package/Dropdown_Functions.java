package com.Sample_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Functions {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver()  ;
    driver.get("https://theautomationzone.blogspot.com/search/label/selenium%20practice%20page");
    driver.manage().window().maximize();
    //single drop down
    
  //  WebElement singleDropdown = driver.findElement(By.id("mySelect"));
  //  Select select = new Select(singleDropdown);
    
    //select.selectByIndex(2);
    //select.selectByValue("banana");
   // select.selectByVisibleText("Orange");
    
   // System.out.println(select.getFirstSelectedOption().getText());

//Multiple -dropdown:-
    
    WebElement MultiDropdown = driver.findElement(By.id("cars"));
    Select select = new Select(MultiDropdown);
    
    select.selectByIndex(0);
    select.selectByIndex(1);
    select.selectByIndex(2);
    select.deselectByIndex(0);
    
    
   List<WebElement>  listoption =  select.getAllSelectedOptions();
   for(WebElement obj:listoption) {
	   System.out.println(obj.getText());
	   
   }
	}

}
