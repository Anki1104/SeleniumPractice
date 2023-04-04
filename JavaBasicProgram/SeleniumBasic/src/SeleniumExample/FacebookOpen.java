package SeleniumExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookOpen {
	static WebDriver driver;
	public static void main(String[] args) {
		setUp("chrome");
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		String pageSource=driver.getPageSource();
		//System.out.println(driver.getPageSource());
		
		System.out.println(pageSource.length());
		//driver.close();
	}
	public static void setUp(String browserName) {
       if(browserName.equalsIgnoreCase("chrome")) {
    	   System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
    	   driver = new ChromeDriver();
       }
	}

}
