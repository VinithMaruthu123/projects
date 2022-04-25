package com.sprint;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	
	public class Sprint {
		public static void main(String[] args) throws InterruptedException {
	

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe");

			
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.t-mobile.com/?src=spr&rdpage=/");
				
				driver.manage().window().maximize();
				
				WebElement element = driver.findElement(By.xpath("//button[@class='phx-button phx-button--primary']"));
				element.click();
				
				Thread.sleep(5000);
				
				WebElement element2 = driver.findElement(By.xpath("//button[@class='tntOverlayCloseBtn']"));
				element2.click();	
				 
				Thread.sleep(3000);
				
				WebElement pd = driver.findElement(By.xpath("//a[text()='Phones & devices']"));
				Actions a = new Actions(driver);
				a.moveToElement(pd).perform();
				Thread.sleep(3000);
				
				WebElement g5 = driver.findElement(By.xpath("//a[text()='5G phones']"));
				g5.click();
				Thread.sleep(3000);
				
				WebElement txt = driver.findElement(By.xpath("//a[text()=' Do Not Sell My Personal Information']"));
				String text = txt.getText();
				System.out.println(text);
				Thread.sleep(3000);
			}
			}
	
	
	