package com.Alert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttask {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");

		WebElement clk = driver.findElement(By.xpath("//a[@href='#Textbox']"));
		clk.click();

		Robot Hi = new Robot();

		Hi.keyPress(KeyEvent.VK_TAB);
		Hi.keyRelease(KeyEvent.VK_TAB);

		Hi.keyPress(KeyEvent.VK_ENTER);
		Hi.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);

		Alert Txtid = driver.switchTo().alert();
		Txtid.sendKeys("Handsome boy is velu");
		Txtid.accept();
		Thread.sleep(3000);

		WebElement si = driver.findElement(By.id("demo1"));
		String hlo = si.getText();

		System.out.println(hlo);

	}
}