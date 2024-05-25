package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
	public static void main(String[] args) {
		System.setProperty("web.chrome.driver", "C:\\Users\\Askar\\Downloads\\chromedriver-win64\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Agni" + Keys.ENTER);
		driver.quit();
	}

}
