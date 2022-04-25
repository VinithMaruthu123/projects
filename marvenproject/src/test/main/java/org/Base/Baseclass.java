package org.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	static WebDriver drivder;
	
	public void getDriver() {
	WebDriverManager.chromedriver().setup();
	
	drivder = new  ChromeDriver();
	drivder.manage().window().maximize(); 
	
	}
	
	public void launchURL (String url) {
		drivder.get(url);
		
	}
	
	
		
	
	

	
	

	 
	 
	
	}
	
}
