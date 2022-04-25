package com.Day2task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement txtuser = driver.findElement(By.xpath("//input[@type='text']"));
		txtuser.sendKeys("Vinith");

		WebElement txtpassword = driver.findElement(By.xpath("//input[@type='password']"));

		txtpassword.sendKeys("345678900");
		
		WebElement btnsearch = driver.findElement(By.xpath("//button[@value='1']"));
		
		btnsearch.click();
		
		WebElement click = driver.findElement(By.xpath("(//mat-icon[@role='img'])[1]"));
		click.click();
	}
}
