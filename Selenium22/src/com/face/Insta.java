package com.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");

		WebElement txtusername = driver.findElement(By.name("username"));		
		txtusername.sendKeys("Crazy.vinith");
		
		WebElement txtpass = driver.findElement(By.xpath("(//input[@type='password'])"));
		txtpass.sendKeys("87586475487");
		
}
}