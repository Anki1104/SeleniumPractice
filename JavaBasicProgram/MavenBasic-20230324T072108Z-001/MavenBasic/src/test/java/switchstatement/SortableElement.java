package switchstatement;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class SortableElement {
	public static void main(String[] args) throws InterruptedException {
	  SeleniumUtility.setUp("chrome", "https://jqueryui.com/");
	 Thread.sleep(2000);
	  SeleniumUtility.driver.findElement(By.xpath("//a[text()='Sortable']")).click();
	  Thread.sleep(2000);
		WebElement frame =  SeleniumUtility.driver.findElement(By.cssSelector(".demo-frame"));
		
		 SeleniumUtility.driver.switchTo().frame(0);
		 
	}
}