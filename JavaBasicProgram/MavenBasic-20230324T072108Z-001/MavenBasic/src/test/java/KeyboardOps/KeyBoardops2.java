package KeyboardOps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class KeyBoardops2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.flipkart.com");
		WebElement element =driver.findElement(By.cssSelector("body"));
		element.sendKeys(Keys.ESCAPE);
		for (int i=0; i<10; i++) {
			element.sendKeys(Keys.PAGE_DOWN);
			
		}
		//Scrolling - directly goto bottom of the page
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		Thread.sleep(1500);
		//Scrolling- directly goto Top of the page
		element.sendKeys(Keys.chord(Keys.CONTROL,Keys.HOME));

	}

}
