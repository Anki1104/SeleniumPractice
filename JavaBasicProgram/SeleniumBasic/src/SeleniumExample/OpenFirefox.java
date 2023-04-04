package SeleniumExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp("firefox");
	//System.out.println("The current page url: "+ driver.getCurrentUrl());
	driver.get("https://www.google.com");
		//driver.close();
	}

	public static void setUp(String browserName) {
		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executable\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		}
	}

}
