package seleniumprgms;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class IsDisplayed {
		static WebDriver driver;
		public static void main(String[] args) {
			driver=new ChromeDriver();
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();
			WebElement search=driver.findElement(By.name("btnK"));
			boolean display=search.isDisplayed();
			System.out.println(display);
}
}