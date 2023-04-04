package cssValidation;

import org.openqa.selenium.By;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.SeleniumUtility;

public class ActitimeErrorMsgPositionValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://demo.actitime.com/login.do");
		SeleniumUtility.clickOnElement(driver.findElement(By.id("loginButton")));	
		SeleniumUtility.waitUntilTexttobeMatched(By.cssSelector(".errormsg"),"Username or Password is invalid. Please try again.");
		WebElement errorMsg = driver.findElement(By.cssSelector(".errormsg"));
		WebElement usernameInputField = driver.findElement(By.id("username"));
	
		Point errorPosition = errorMsg.getLocation();
		int error_X_Cord = errorPosition.getX();
		int error_Y_Cord = errorPosition.getY();
		System.out.println("Error msg x-cords---> " + error_X_Cord);
		System.out.println("Error msg y-cords---> " + error_Y_Cord);

		Point usernamePosition = usernameInputField.getLocation();
		int username_X_Cord = usernamePosition.getX();
		int username_Y_Cord = usernamePosition.getY();
		System.out.println("Username x-cords---> " + username_X_Cord);
		System.out.println("Username y-cords---> " + username_Y_Cord);

		System.out.println(
				"Is error msg getting displayed above username input field: " + (error_Y_Cord < username_Y_Cord));

	}

}
