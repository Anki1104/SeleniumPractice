package SeleniumExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOps {

	public static void main(String[] args) throws InterruptedException {
		// set required browser driver executable path using
		// System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// enter the required URL
		driver.get("https://demo.automationtesting.in/Register.html");
		// maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.manage().window().setSize(new Dimension(450, 600));

		driver.manage().window().maximize();

		driver.findElement(By.linkText("WebTable")).click();
		Thread.sleep(1500);

		driver.navigate().back();
		Thread.sleep(1500);

		driver.navigate().forward();
		Thread.sleep(1500);

		driver.navigate().refresh();
		Thread.sleep(1500);
		// to move to different application
		driver.navigate().to("http://www.google.com");
	}
}
