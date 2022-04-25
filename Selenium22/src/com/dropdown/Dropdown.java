package com.dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement btnclik = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		btnclik.click();
		
		WebElement dropday = driver.findElement(By.id("day"));
		
		Select s = new Select(dropday);
		s.selectByValue("8");
		
		WebElement dropmon = driver.findElement(By.id("month"));
		Select s1 = new Select(dropmon);
		s1.selectByIndex(4);
		
		WebElement dropyear = driver.findElement(By.id("year"));
		Select s2 = new Select(dropyear);
		s2.selectByVisibleText("1997");
		 
		
		
		
		Thread.sleep(10000);
		driver.quit();	
		
		
	}
	
}
