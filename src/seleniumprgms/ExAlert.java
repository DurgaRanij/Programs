package seleniumprgms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExAlert {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.name("cusid")).sendKeys("durga");
		driver.findElement(By.name("submit")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(alert.getText());
		alert.dismiss();
		
		
		
		
	}

}
