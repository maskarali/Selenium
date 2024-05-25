package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class ButtonExample {

	public static void main(String[] args) {
		System.setProperty("web.chrome.driver",  "C:\\Users\\MJ\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		// get the x and y Postion
		WebElement getPositionbutton = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt98\']/span[2]"));
		Point xyelement = getPositionbutton.getLocation();
		int xValue = xyelement.getX();
		int yValue = xyelement.getY();
		System.out.println("X value is"+ xValue+"Y value is"+yValue);
		
		//get color
		WebElement getcolor = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt96\']/span[2]"));
		String color =  getcolor.getCssValue("background-color");
		System.out.println(color);
		
		// get size
		WebElement getSizebutton = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt98\']/span[2]"));
		int height =  getSizebutton.getSize().getHeight();
		int width = getSizebutton.getSize().getWidth();
		System.out.println("height"+ height+" width"+width);
		
		driver.quit();
	}
	
}
