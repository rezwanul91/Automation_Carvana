package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Base {
	
	public static WebDriver driver;
	
	public static void navigateUrl(String url) {
		driver.get(url);
	}
	
	public static void click(By by) {
		driver.findElement(by).click();
	}
	
	public static void sendkeys(By by, String value) {
		driver.findElement(by).sendKeys(value);
	}
	
	public static String getElementText(By by) {
		WebElement element = driver.findElement(by);
		return element.getText();
	}
	
	public static void clear(By by) {
		driver.findElement(by).click();
	}
	
	public static void mousehoover(By by){ 
		Actions action = new Actions(driver); 
		WebElement element2 = driver.findElement(by);
		action.moveToElement(element2).build().perform();
		}
	


}//class
