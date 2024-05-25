package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {
	public static void main(String[] args) {
		System.getProperty("web.chrome.driver", "C:\\Users\\MJ\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		// driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.findElement(By.partialLinkText("Dashboard")).click();

	}

}
