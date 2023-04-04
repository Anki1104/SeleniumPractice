package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp("chrome");
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.clear();
		userName.sendKeys("admin");

		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Test@123");

		WebElement Signin = driver.findElement(By.className("buttonBlue"));
	   Signin.click();
	}

	public static void setUp(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}

}
