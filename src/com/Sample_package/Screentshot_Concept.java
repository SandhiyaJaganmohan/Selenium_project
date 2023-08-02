package com.Sample_package;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screentshot_Concept {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver_win32/chromedriver.exe");
    WebDriver driver = new ChromeDriver()  ;
    driver.get("https://www.google.co.in/");
    driver.manage().window().maximize();
    
    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    File dest = new File("./screenshots/img.png");
    FileHandler.copy(src, dest);
    driver.quit();
	}

}
