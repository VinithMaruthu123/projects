package com.Day2task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		WebElement txt = driver.findElement(By.id("twotabsearchtextbox"));

		txt.sendKeys("Iphone");

		WebElement btnsearch = driver.findElement(By.id("nav-search-submit-button"));

		btnsearch.click();
	}
}