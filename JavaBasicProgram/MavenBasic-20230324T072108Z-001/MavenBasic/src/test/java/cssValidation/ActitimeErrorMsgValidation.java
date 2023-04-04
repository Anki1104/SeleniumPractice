package cssValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

class ActitimeErrorMsgValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://demo.actitime.com/login.do");
		SeleniumUtility.clickOnElement(driver.findElement(By.id("loginButton")));
		SeleniumUtility.waitUntilTexttobeMatched(By.cssSelector(".errormsg"),"Username or Password is invalid. Please try again.");
		WebElement errorMsg = driver.findElement(By.cssSelector(".errormsg"));
		String errorColorInRGBA = errorMsg.getCssValue("color");
		String errorFontSize = errorMsg.getCssValue("font-size");
		System.out.println("Error msg color code:" + errorColorInRGBA);
		System.out.println("Error msg for font size:" + errorFontSize);
	}

}
