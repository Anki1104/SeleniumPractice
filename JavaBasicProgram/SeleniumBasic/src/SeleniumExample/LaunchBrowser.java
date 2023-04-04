package SeleniumExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.techlistic.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(450, 600));
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/java.html");
		
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.get("https://www.techlistic.com/p/bdd-tutorial-with-python-behave.html");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.get("https://www.techlistic.com/p/selenium-tutorials.html");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.get("https://www.techlistic.com/p/software-testing.html");
		driver.navigate().back();
		Thread.sleep(2000);

	}

}
