package DependantIndependant;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class GiftpriceValidation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.amazon.in");
		SeleniumUtility.driver
		.findElement(By.xpath("//div[@id='nav-search-dropdown-card']/div/div/i[@class='nav-icon']")).click();
		SeleniumUtility.driver.findElement(By.xpath("//select[@name='url']/option[15]")).click();
		SeleniumUtility.driver.findElement(By.xpath("//div[@class='nav-right']/div/span/input")).click();

	}

}
