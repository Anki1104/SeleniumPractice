package switchstatement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class Handlingframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://jqueryui.com");

		SeleniumUtility.driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(drag, 100, 0).perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//h2[@class='logo']")).click();

	}

}
