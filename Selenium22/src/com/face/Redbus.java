package com.face;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Redbus {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.redbus.in/");

			WebElement txtFrom = driver.findElement(By.id("src"));

			txtFrom.sendKeys("Chennai");

		}
}
