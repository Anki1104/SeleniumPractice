package MouseOps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.flipkart.com");
		SeleniumUtility.driver.findElement(By.xpath("//body")).sendKeys(Keys.CONTROL.ESCAPE);
		List<WebElement> mainmenu = SeleniumUtility.driver.findElements(By.xpath("//div[@class='_37M3Pb']/div/a"));

		System.out.println("The List of the main menu is :" + mainmenu.size());
		Actions act = new Actions(driver);
		for (int i = 0; i < mainmenu.size(); i++) {
			act.moveToElement(mainmenu.get(i)).perform();
			Thread.sleep(2000);
		}
		List<WebElement> listofmainmenu = SeleniumUtility.driver
				.findElements(By.xpath("//div[@class='_37M3Pb']/div//following::div[@class='xtXmba']"));
		for (int i = 0; i < listofmainmenu.size(); i++) {
			WebElement list = listofmainmenu.get(i);
			System.out.println("the list of main menu is:" + list.getText());
		}

	}
}
