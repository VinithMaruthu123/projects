package marvenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RockeyBai extends Baseclass {
		
		public static void main(String[] args) {
			Baseclass c = new Baseclass();
		 c.getDriver();
		 c.launch("https://www.facebook.com/");
		 WebElement txtuser = c.locations("id", "email");
		 c.textsend(txtuser, "Maruthu Vinith");
		 WebElement txtpass = c.locations("id", "pass");
		 c.textsend(txtpass, "Hello");
		 WebElement btncl = c.locations("name", "login");
		c.buttonclick(btncl);
//			c.getDriver();
//			c.launch();
//			WebElement id = c.id("email");
//			id.sendKeys("hhjhuy");
//			WebElement name = c.name("pass");
//			name.sendKeys("0979865");
//			WebElement xpath = c.xpathBase("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']");
//			c.buttonclick(xpath);
//		}
//	}
		}
}
