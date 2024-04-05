package seleniumprgms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniummethods {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().to("https://www.meesho.com/");
		System.out.println(driver.getPageSource());
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		driver.quit();
		
	}
	

}
