package SeleniumExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GenericwayToOpenChromeBrowser {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODOAuto-generated method stub
		setUp("chrome");

	}

	public static void setUp(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executable\\geckodriver.exe");
		} else if (browserName.equalsIgnoreCase("IEDriver"))
			;
		System.setProperty("webdriver.ie.driver", ".\\exectable\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();

	}

}
