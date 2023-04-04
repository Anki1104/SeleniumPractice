package SeleniumExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewChromeBrowser {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setup("chrome");
		driver.get("https://demo.actitime.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		String pageSource = driver.getPageSource();
		System.out.println("the page source is:" + pageSource);
		System.out.println(pageSource.length());
		driver.close();
	}

	public static void setup(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
}
