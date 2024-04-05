package seleniumprgms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlingkeyboard {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("Grocery")).sendKeys("Grocery list");
	Actions action=new Actions(driver);
	action.sendKeys(Keys.ENTER).build().perform();
	action.sendKeys(Keys.ARROW_DOWN).build().perform();
}
}
