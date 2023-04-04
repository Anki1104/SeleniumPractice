package SeleniumExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetUp("chrome");
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		String pageurl = driver.getPageSource();
		System.out.println(pageurl.length());
		System.out.println("The Title of the page is:"+ driver.getTitle());
		String titlelength = driver.getTitle();
		
		System.out.println("The title length is:"+ titlelength.length());
		//driver.close();
	}

	public static void SetUp(String browserName) {
		if (browserName.equalsIgnoreCase("chrome"))
			;
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		driver = new ChromeDriver();
	}

}
