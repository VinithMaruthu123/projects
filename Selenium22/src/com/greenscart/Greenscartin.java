package com.greenscart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Greenscartin {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe" );
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenscart.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
	WebElement txtname = driver.findElement(By.id("loginEmailId"));
	txtname.sendKeys("vinithmaruthu.26@gmail.com");
	
	Thread.sleep(1000);
	
	WebElement txtpass = driver.findElement(By.id("loginPassword"));
	txtpass.sendKeys("Vinith@123");
	
	Thread.sleep(2000);
	
	WebElement btnlogin = driver.findElement(By.xpath("//input[@value='Login']"));
	btnlogin.click();
	
	Thread.sleep(3000);
	
	WebElement btnclk = driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary']"));
	btnclk.click();
	
	WebElement btnsrch = driver.findElement(By.id("typeahead-basic"));
	btnsrch.sendKeys("vivo");	
	
	Thread.sleep(3000);
	
	WebElement btnclk1 = driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary']"));
	btnclk1.click();
	
	Thread.sleep(2000);
	WebElement btnclick1 = driver.findElement(By.xpath("//img[@class='card-img-top'][1]"));
	btnclick1.click();
	
	Thread.sleep(2000);
	
	WebElement btnclick2 = driver.findElement(By.xpath("//button[@class='btn btn-warning btn-long buy buttonKart']"));
	btnclick2.click();
	
	Thread.sleep(2000);
	
	WebElement btnclick3 = driver.findElement(By.xpath("//button[@class='btn btn-block btn-outline-primary btn-lg']"));
	btnclick3.click();
	
	Thread.sleep(3000);
	
	WebElement btnclick4 = driver.findElement(By.xpath("//span[text()='GRN10']")); 
	
	Actions actions = new Actions(driver);
	actions.doubleClick(btnclick4).perform();
	
	Thread.sleep(2000);
	WebElement btnclose = driver.findElement(By.xpath("//span[@class='px-1 close']"));
	
	Thread.sleep(2000);
	
	actions.contextClick(btnclose).perform();
	
	Thread.sleep(2000);
	
	WebElement btnclose2 = driver.findElement(By.xpath("//section[@class='user-menung-star-inserted']"));
	
	btnclose2.click();
	

	
	
	
	
	

	}

}
