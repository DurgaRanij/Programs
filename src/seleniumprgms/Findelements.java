package seleniumprgms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
	driver.manage().window().maximize();
	List<WebElement>allElements=driver.findElements(By.tagName("a"));
	for(WebElement elements:allElements)
	{
	  System.out.println(elements.getText());
	}
	
}
}
