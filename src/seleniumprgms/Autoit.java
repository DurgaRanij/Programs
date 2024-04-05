package seleniumprgms;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoit {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Select PDF file")).click();
		Runtime.getRuntime().exec("C:\\Users\\HP\\OneDrive\\Desktop\\vara.exe");
		

}
}
