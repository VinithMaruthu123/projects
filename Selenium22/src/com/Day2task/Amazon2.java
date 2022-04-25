package com.Day2task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon2 {
	

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement clicklap = driver.findElement(By.xpath("(//img[@alt='Top deals on Mi Notebooks and RedmiBook Laptops; Starting 37999'])"));
		clicklap.click();
		
		
}
}
