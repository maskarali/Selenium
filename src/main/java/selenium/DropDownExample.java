package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class DropDownExample {

	public static void main(String[] args) {
		System.setProperty("web.chrome.driver",  "C:\\Users\\MJ\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement dropDown1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		WebElement dropDown2 = driver.findElement(By.id("j_idt87:country_input"));
		Select select = new Select(dropDown1);
		Select select2 = new Select(dropDown2);
		select.selectByIndex(1);
		select.selectByVisibleText("Playwright");
		//select2.selectByValue("USA");
		List<WebElement> dropdownElements = select.getOptions();
		System.out.println(dropdownElements.size());
		dropDown1.sendKeys("Cypress");
		driver.quit();

	}

}
