package com.face;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icicibank{

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");

		WebElement txtuser = driver.findElement(By.id("DUMMY1"));
		txtuser.click();

		WebElement txtid = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));

		txtid.sendKeys("vinith");

		WebElement txtpass = driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));

		txtpass.sendKeys("2345678");
		
	}
}
		