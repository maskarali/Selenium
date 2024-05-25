package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {

	public static void main(String[] args) {
		System.setProperty("web.chrome.driver", "C:\\Users\\Askar\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		WebElement email = driver.findElement(By.id("j_idt88:name"));
		email.sendKeys("test@gmail.com");
		WebElement appendBox = driver.findElement(By.name("j_idt88:j_idt91"));
		appendBox.sendKeys("test");
		WebElement getBox = driver.findElement(By.id("j_idt88:j_idt97"));
		String value = getBox.getAttribute("value");
		System.out.println(value);
		WebElement clear = driver.findElement(By.id("j_idt88:j_idt95"));
		clear.clear();
		WebElement isEnabled = driver.findElement(By.id("j_idt88:j_idt93"));
		Boolean enabled = isEnabled.isEnabled();
		System.out.println(enabled);

	}

}
