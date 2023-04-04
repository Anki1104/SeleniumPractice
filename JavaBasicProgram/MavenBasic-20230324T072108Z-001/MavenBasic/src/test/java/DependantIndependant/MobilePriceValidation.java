package DependantIndependant;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class MobilePriceValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.flipkart.com");
		SeleniumUtility.driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL.ESCAPE);
		SeleniumUtility.driver.findElement(By.xpath("//div[text() ='Mobiles']")).click();
		SeleniumUtility.driver.findElement(By.xpath("//div[@class='_1kidPb']/span[text()='Electronics']")).click();
		SeleniumUtility.driver.findElement(By.xpath("//a[text()='Samsung']")).click();
		WebElement Mobileprice = SeleniumUtility.driver.findElement(By
				.xpath("//div[div[a[text()='SAMSUNG Galaxy F04 (Jade Purple, 64 GB)']]]/div[3]/div[1]/div[text()='₹7,499']"));
System.out.println("Mobile price and name is:"+Mobileprice.getText());
	
	}

}