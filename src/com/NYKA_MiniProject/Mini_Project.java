package com.NYKA_MiniProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mini_Project {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver",
			"./Drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver = new ChromeDriver()  ;
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	driver.get("https://www.nykaa.com/");
	driver.manage().window().maximize();
	WebElement signin= driver.findElement(By.xpath("//button[text()='Sign in']"));
	signin.click();
	WebElement mobile= driver.findElement(By.xpath("//button[text()='Sign in with Mobile / Email']"));
	mobile.click();
	driver.findElement(By.xpath("//input[@class='input text-center']")).sendKeys("9094642289");
	WebElement proceed = driver.findElement(By.id("submitVerification"));
	proceed.click();
	Thread.sleep(50000);
//	Scanner  input =new Scanner(System.in);
//	String otp=input.next();
//	driver.findElement(By.xpath("//input[@name='otpValue']")).sendKeys(otp);
	driver.findElement(By.xpath("//button[text()='verify']")).click();
	Actions act = new Actions(driver);
	WebElement mom = driver.findElement(By.xpath("//a[contains(text(),'& baby')]"));
	act.moveToElement(mom).build().perform();
	driver.findElement(By.xpath("//a[text()='Baby Powder']")).click();
	
	WebDriverWait wait = new WebDriverWait(driver,30);

	JavascriptExecutor js= (JavascriptExecutor)driver;
    WebElement babypowder = driver.findElement(By.xpath("//div[text()='Himalaya Baby Powder']"));
	wait.until(ExpectedConditions.visibilityOf(babypowder));
    js.executeScript("arguments[0].scrollIntoView(true);",babypowder);
	
	WebElement dropdown =driver.findElement(By.xpath("//select[@class='css-2t5nwu']"));
	Select select = new Select(dropdown);
	select.selectByIndex(1);
	js.executeScript("window.scroll(0,500)");
	driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
	
}
}
