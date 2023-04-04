package SeleniumExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GoogleSuggestions {
	static WebDriver driver;

	public static void main(String[] args) {
		setUp("chrome", "https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium interview questions");
		List<WebElement> suggestionList = driver
				.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>div>*:first-child>span"));
		System.out.println("Total suggestion found: " + suggestionList.size());
		for (int i = 0; i < suggestionList.size(); i++) {
			
																																																				suggestionList = driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>div>*:first-child>span"));
			WebElement suggestion = suggestionList.get(i);
			System.out.println("Suggestion " + i + ": " + suggestion.getText());
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
	}
}
