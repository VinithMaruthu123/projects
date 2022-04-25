package marvenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG2 {

	static WebDriver driver;

	@BeforeClass
	private void getdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Parameters("username")
	@Test
	private void loginpa(String s) {
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys(s);
	}
	@Parameters("password")
	@Test
	private void password(String s) {
		WebElement txtuser = driver.findElement(By.id("pass"));
		txtuser.sendKeys(s);
	
}}
