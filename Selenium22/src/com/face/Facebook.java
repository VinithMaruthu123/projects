package com.face;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Facebook {
	
		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");

			WebElement txtuser = driver.findElement(By.id("email"));
			txtuser.sendKeys("Vinith");

			WebElement txtpassword = driver.findElement(By.id("pass"));

			txtpassword.sendKeys("1234567890");

			
		}
		

}
