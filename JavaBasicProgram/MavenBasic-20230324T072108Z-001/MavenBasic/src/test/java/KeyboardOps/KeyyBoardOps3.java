package KeyboardOps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class KeyyBoardOps3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = SeleniumUtility.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		WebElement name = SeleniumUtility.driver.findElement(By.xpath("//div/input[@placeholder='First Name']"));
		name.sendKeys("ankita", Keys.chord(Keys.CONTROL, "a"));
		name.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		 WebElement lastname =SeleniumUtility.driver.findElement(By.xpath("//div/input[@placeholder='Last Name']"));
				lastname.sendKeys(Keys.chord(Keys.CONTROL, "v"));

	}

}
