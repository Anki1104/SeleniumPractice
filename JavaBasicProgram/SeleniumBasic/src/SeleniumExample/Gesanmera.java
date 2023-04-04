package SeleniumExample;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gesanmera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		driver.manage().window().maximize();
		List<WebElement> mobilePhones = driver.findElementsByCssSelector(".brandmenu-v2.light.l-box.clearfix>ul>li>a");
		System.out.println("Total suggestion found: " + mobilePhones.size());
		for (int i = 0; i < mobilePhones.size(); i++) {
			WebElement mobile = mobilePhones.get(i);
			System.out.println("mobile phone List :" + mobile.getText());
		}
	}

}