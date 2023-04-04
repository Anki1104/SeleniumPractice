package switchstatement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class ActiveHandlingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://demo.actitime.com/login.do");
		WebElement focusedElement = driver.switchTo().activeElement();
		String actualattribute = focusedElement.getAttribute("placeholder");
		System.out.println("is focused on username or not:" + actualattribute.equals("Username"));
		focusedElement.sendKeys("admin", Keys.TAB);
		driver.switchTo().activeElement().sendKeys("manager", Keys.ENTER);

	}

}
