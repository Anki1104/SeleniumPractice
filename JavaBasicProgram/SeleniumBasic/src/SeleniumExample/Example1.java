package SeleniumExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example1 {
	static WebDriver driver;

	public static void main(String[] args) {
		SetUp("chrome");

		driver.get("https://demo.actitime.com/login.do");

		 WebElement userNameInputField = driver.findElement(By.id("username"));
		userNameInputField.sendKeys("admin");

		WebElement passwordInputField = driver.findElement(By.name("pwd"));
	    passwordInputField.sendKeys("manager");

		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();

		driver.close();
	}

	public static void SetUp(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
}
