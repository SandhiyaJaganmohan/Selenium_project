package com.WebTableConcept;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver()  ;
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://letcode.in/table");
    driver.manage().window().maximize();
    //printing the headers of the table
    WebElement table =driver.findElement(By.id("simpletable"));
    List<WebElement> headers = table.findElements(By.tagName("th"));
    for(WebElement header:headers) {
    	String text =header.getText();
    	System.out.print(" " +text);
    }
    // finding no.of rows in table 
   List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));
   
   int size =allrows.size();
   
   System.out.println("there are "+size+" rows in the table");
   
   //getting the first column data
   for(WebElement row:allrows) {
	 List<WebElement> cols = row.findElements(By.tagName("td"));
	WebElement firstcol= cols.get(1);
	System.out.println(firstcol.getText());
	if((firstcol.getText()).equals("Raj"))
			{
		WebElement point =cols.get(3).findElement(By.tagName("input"));
		point.click();
		break;
			}
   }
   //particular 

  // driver.quit();
	}

}
