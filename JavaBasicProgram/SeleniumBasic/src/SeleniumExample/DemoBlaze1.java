package SeleniumExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoBlaze1 {
	static WebDriver driver;

	public static void main(String[] args){
		setUp("chrome", "https://www.demoblaze.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> mobileList = driver.findElements(By.cssSelector("#tbodyid>div>div>.card-block>h4>a"));
		List<WebElement> mobilePrice = driver.findElements(By.cssSelector("#tbodyid>div>div>.card-block>h5"));
		System.out.println("total mobile found :" + mobileList.size());
		for (int i = 0; i <= mobileList.size(); i++) {
			WebElement mobile = mobileList.get(i);
			WebElement mobileprice=mobilePrice.get(i);
			System.out.println("Mobile name" + i + ":" + mobile.getText()+"-"+mobileprice.getText());
		}
	}

	public static void setUp(String browserName, String appUrl) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executable\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", ".\\executable\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(appUrl);
	}
}
