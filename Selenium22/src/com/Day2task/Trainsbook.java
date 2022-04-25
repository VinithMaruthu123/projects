package com.Day2task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trainsbook {

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		
		WebElement txtfrom = driver.findElement(By.id("from_station"));
		
		txtfrom.sendKeys("Chennai");
		
		WebElement txtto = driver.findElement(By.id("to_station"));
		txtto.sendKeys("Delhi");
		
     WebElement btnclick = driver.findElement(By.id("trainFormButton"));
		
		btnclick.click();
		
		
		
}
}