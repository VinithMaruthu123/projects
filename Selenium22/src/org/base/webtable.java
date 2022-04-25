package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PANDI\\eclipse-workspace\\Selenium22\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		List<WebElement> trows = driver.findElements(By.tagName("tr"));
		int size = trows.size();
		System.out.println(size);

		List<WebElement> tdatas = driver.findElements(By.tagName("td"));
		int size2 = tdatas.size();
		System.out.println(size2);

		for (int i = 0; i < trows.size(); i++) {
			WebElement a = trows.get(i);
			String text = a.getText();
			System.out.println(text);
			
			if (text.equals("cell")) {
				System.out.println(text);
				
			}}
		}	

	}

