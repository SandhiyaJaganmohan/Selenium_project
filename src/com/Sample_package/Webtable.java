package com.Sample_package;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver()  ;
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://letcode.in/table");
    driver.manage().window().maximize();
    
    List<WebElement> allRows= driver.findElements(By.cssSelector("tbody tr"));
    for (WebElement row:allRows) {
    List<WebElement>	col=row.findElements(By.tagName("td"));
    WebElement firstcol=col.get(0);
    System.out.println(firstcol.getText() );
    
    }
    driver.quit();
	}

}
