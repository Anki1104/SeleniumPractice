package SeleniumExample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GesanmeraSamsungList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		WebElement samsung = driver.findElementByCssSelector("a[href='samsung-phones-9.php']");
		samsung.click();
		List<WebElement> mobileList = driver.findElements(By.cssSelector(".makers>ul>li>a>strong>*:first-child"));
		System.out.println("samsung mobile List:" + mobileList.size());
		for (int i = 0; i < mobileList.size(); i++) {

			WebElement mobile = mobileList.get(i);
			System.out.println("samsung mobile list name :" + mobile.getText());
		}
	}

}
