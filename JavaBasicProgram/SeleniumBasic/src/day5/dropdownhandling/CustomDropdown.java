package day5.dropdownhandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown");
		driver.findElement(By.id("bsd3-button"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement dropdown = driver.findElement(By.id("bsd1-button"));
		dropdown.click();
		List<WebElement> options = driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
		System.out.println("option count: " + options.size());
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
		options.get(2).click();
	}

}
