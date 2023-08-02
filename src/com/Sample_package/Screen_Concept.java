package com.Sample_package;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screen_Concept {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver_win32/chromedriver.exe");

		WebDriver driver = new ChromeDriver()  ;

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot)driver;

		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File dest = new File("./Screenshots/img.png");

		FileHandler.copy(src, dest);

		WebElement ele = driver.findElement(By.xpath("//span[text()='& Orders']"));

		File src1 =ele.getScreenshotAs(OutputType.FILE);

		File dest1 = new File("./Screenshots/img1.png");

		FileHandler.copy(src1, dest1);

		WebElement cont= driver.findElement(By.id("p55c_GZbfiqfOxJkE8pMpQ"));

		File src2 =cont.getScreenshotAs(OutputType.FILE);

		File dest2 = new File("./Screenshots/img2.png");

		FileHandler.copy(src2, dest2);
		driver.quit();
	}

}
