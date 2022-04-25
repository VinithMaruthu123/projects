package com.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCBANK {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
	driver.get("https://netbanking.hdfcbank.com/netbanking/");

	WebElement txtcusID = driver.findElement(By.xpath("//input[contains(@name,'fldLoginUserId')]"));
	
	txtcusID.sendKeys("Vinithmaruthu");
}
}