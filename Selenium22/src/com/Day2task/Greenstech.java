package com.Day2task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenstech {
	

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");

		WebElement btnclick = driver.findElement(By.id("heading20"));
		
		btnclick.click();
		
        WebElement btnclick1 = driver.findElement(By.xpath("(//a[@title='Interview Questions'])[4]"));
		
		btnclick1.click();
		
	}

}
