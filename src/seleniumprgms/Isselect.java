package seleniumprgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselect {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.w3schools.com/tags/att_input_type_radio.asp");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[text()='PYTHON']")).click();
	System.out.println(driver.findElement(By.xpath("//a[text()='PYTHON']")).isSelected());
}
}