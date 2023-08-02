package com.Wait_Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import okio.Timeout;

public class Implicit_Wait {

	public static void main(String[] args) {

		//Implicit wait ---it is applicable globally for all webelements
		
		 
		//driver.findElement(By.id("accept")).click();
		
		//Explicity wait
		
		WebDriver driver = null;
		WebDriverWait wait = new WebDriverWait(driver,30);
		Alert until =wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(until.getText());
		until.accept();
		
	}

}
