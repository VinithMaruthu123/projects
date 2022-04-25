package com.Day2task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationpractice {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/selenium-training?q=banner#enroll-form/");
		
		WebElement btnsearch = driver.findElement(By.xpath("//a[@class='btn btn-primary-shadow btn-block']"));
		
		btnsearch.click();
		
		WebElement txtname = driver.findElement(By.xpath("//input[@id='first-name']"));
		txtname.sendKeys("Sasi");
		
		WebElement txtlname = driver.findElement(By.xpath("//input[@id='last-name']"));
		txtlname.sendKeys("vinith");
		
		WebElement txtmail = driver.findElement(By.xpath("//input[@id='email']"));
		txtmail.sendKeys("vinith20@gmail.com");
		
		WebElement txtno = driver.findElement(By.xpath("//input[@id='mobile']"));
		txtno.sendKeys("9841477882");
		
		WebElement txtcount = driver.findElement(By.xpath("//select[@class='upcoming__registration--input']"));
		txtcount.sendKeys(" india");
		
		WebElement txtcity = driver.findElement(By.xpath("//input[@id='city']"));
		txtcity.sendKeys("Chennai");		

}
}
