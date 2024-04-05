package seleniumprgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
static WebDriver driver;
public static void main(String[] args) {
	driver= new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement  draggable=driver.findElement(By.id("container"));
	WebElement  droppable=driver.findElement(By.id("container"));
	Actions action=new Actions(driver);
	action.dragAndDrop(draggable, droppable).build().perform();
	
}

}
