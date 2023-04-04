package MouseOps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class Mouseop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = SeleniumUtility.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		WebElement username = SeleniumUtility.driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		username.sendKeys("admin");
		Actions act = new Actions(driver);
		act.moveToElement(username).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build()
				.perform();

		WebElement lastName = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		act.moveToElement(lastName).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

	}

}
