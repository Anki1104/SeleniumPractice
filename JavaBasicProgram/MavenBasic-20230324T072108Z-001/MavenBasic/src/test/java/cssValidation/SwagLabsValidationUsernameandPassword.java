package cssValidation;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class SwagLabsValidationUsernameandPassword {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.saucedemo.com");
		WebElement color = SeleniumUtility.driver.findElement(By.cssSelector("#login-button"));
		String LoginbtnColor = color.getCssValue("background-color");
		System.out.println("Print the login btn background color:" + LoginbtnColor);
		String LogintextColor = color.getCssValue("color");
		System.out.println("Print the login btn text  color:" + LogintextColor);

		WebElement username = SeleniumUtility.driver.findElement(By.cssSelector(".login_credentials"));
		String AllUsername = username.getText();
		String user[] = AllUsername.split("\n");
		WebElement password = SeleniumUtility.driver.findElement(By.cssSelector(".login_password"));
		String pass[] = password.getText().split("\n");
		SeleniumUtility.driver.findElement(By.id("user-name")).sendKeys(user[1]);
		SeleniumUtility.driver.findElement(By.id("password")).sendKeys(pass[1]);
		SeleniumUtility.driver.findElement(By.id("login-button")).click();
		
	}
}
//Validation of username and password
//1 username and password  
//2 username and password
//3 username and password
//4 username and password
//read on screen     
//Login btn clr code validation 
//Login text is white or not
//error msg password y cord
