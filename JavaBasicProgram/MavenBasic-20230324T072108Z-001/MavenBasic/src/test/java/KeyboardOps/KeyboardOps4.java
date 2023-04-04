package KeyboardOps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class KeyboardOps4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.flipkart.com");
		WebElement element = driver.findElement(By.cssSelector("body"));
		element.sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.F5);
		//driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL,"R");
		driver.navigate().refresh();
	}

}
