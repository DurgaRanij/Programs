package seleniumprgms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String ExpectedURL="https://www.amazon.in/";
		String ActualURL=driver.getCurrentUrl();
		if(ExpectedURL.equals(ActualURL)) {
			System.out.println("Testtcase is pass");
			
		}
		else
		{
			System.out.println("Testcase is fail");
	}
  //to find single element
	driver.findElement(By.linkText("Today's Deals")).click();
}
}