package marvenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	// to get driver
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void launch(String url) {
		driver.get(url);
		

	}

	public WebElement locations(String locators, String value) {
		WebElement el = null;
		
		switch (locators) {
		case "id": el=driver.findElement(By.id(value));
			break;
		case "name": el=driver.findElement(By.name(value));
			break;
		case "className": el=driver.findElement(By.className(value));
			break;
		case "tagName": el=driver.findElement(By.tagName(value));
			break;
		case "xpath": el=driver.findElement(By.xpath(value));
		break;
		
		default: System.out.println("Invalid locator");
			break;
		}
		
		return el;
	}
	
	public WebElement id(String idvalue) {
		WebElement findElement = driver.findElement(By.id(idvalue));
		return findElement;
	}

	public WebElement name(String namevalue) {
		WebElement findElement = driver.findElement(By.name(namevalue));
		return findElement;

	}

	public WebElement xpathBase(String xpathvalue) {
		WebElement findElement = driver.findElement(By.xpath(xpathvalue));
		return findElement;

	}

	public void textsend(WebElement refname, String textvalue) {
		refname.sendKeys(textvalue);

	}

	public void buttonclick(WebElement refname) {
		refname.click();
	}

	
}
