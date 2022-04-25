package com.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactinhotel {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://adactinhotelapp.com");

		WebElement txtname = driver.findElement(By.name("username"));

		txtname.sendKeys("Maruthu");

		WebElement txtpass = driver.findElement(By.name("password"));

		txtpass.sendKeys("9823657800");
	}
}


