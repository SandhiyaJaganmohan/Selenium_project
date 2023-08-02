package com.AlertConcept;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertExample {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver()  ;
    driver.get("https://demoqa.com/alerts");
    driver.manage().window().maximize();
    
    //simple & confirm alert
//    driver.findElement(By.id("confirmButton")).click();
//    Alert alert =driver.switchTo().alert();
//    System.out.println(alert.getText());
//    alert.accept();
    Thread.sleep(10000);
    //propmt alert
    driver.findElement(By.id("promtButton")).click();
    Alert alert = driver.switchTo().alert();
    alert.sendKeys("java");
    alert.accept();
	}

}
