package SeleniumExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example5 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetUp("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");

	    driver.findElement(By.name("password")).sendKeys("admin123") ;
	    
	    driver.findElement(By.className("oxd-button")).click();

	}

	public static void SetUp(String browserName) {
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executable\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome"));
			
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		driver = new ChromeDriver();

	}
}
