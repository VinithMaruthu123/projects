package com.greenscart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Green {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe" );
	
		WebDriver driver = new ChromeDriver();

		driver.get("http://greenscart.in/#/");

		driver.manage().window().maximize();

		Thread.sleep(10000);

		WebElement txtUserName = driver.findElement(By.id("loginEmailId"));
		txtUserName.sendKeys("ramraja6812@gmail.com");

		WebElement txtPass = driver.findElement(By.id("loginPassword"));
		txtPass.sendKeys("Saran@1522");

		WebElement btnLogin = driver.findElement(By.xpath("//input[@value='Login']"));
		btnLogin.click();

		Thread.sleep(5000);
		WebElement txtproduct = driver.findElement(By.xpath("//input[@placeholder='Search Products']"));
		txtproduct.sendKeys("Apple Iphone 12");

		WebElement btnsearch = driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary']"));
		btnsearch.click();
   
		Thread.sleep(3000);
    
		WebElement btnselect = driver.findElement(By.xpath("//img[@class='card-img-top']"));
		btnselect.click();

		WebElement btnBuyNow = driver.findElement(By.xpath("//button[text()='Buy Now']"));

		btnBuyNow.click();
		WebElement btncode = driver.findElement(By.xpath("//button[text()='ADD GIFT CODE']"));

		btncode.click();
		Thread.sleep(2000);

		WebElement btnPromoCode = driver.findElement(By.xpath("//span[text()='GRN10']"));
  
		Actions actions = new Actions(driver);
		
		Thread.sleep(3000);

		actions.doubleClick(btnPromoCode).perform();

		Thread.sleep(2000);
		
		WebElement btnClose = driver.findElement(By.xpath("//span[@class='px-1 close']"));
		actions.contextClick(btnClose).perform();
		

		Thread.sleep(2000);
		WebElement btnClose2 = driver.findElement(By.xpath("//section[@class='user-menu ng-star-inserted']"));
		btnClose2.click();


}
}