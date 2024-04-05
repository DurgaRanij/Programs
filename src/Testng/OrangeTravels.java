package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeTravels {
@Test
public void Travels() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.orangetravels.in/#/");
	driver.manage().window().maximize();
}
}
