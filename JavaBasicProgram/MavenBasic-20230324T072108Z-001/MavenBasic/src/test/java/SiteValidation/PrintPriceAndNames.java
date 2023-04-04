package SiteValidation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class PrintPriceAndNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility.setUp("chrome", "https://www.redbus.in");
		WebElement CityFrom = SeleniumUtility.driver
				.findElement(By.xpath("//div[@class='clearfix search-wrap']/div/div/input[@id='src']"));
		CityFrom.sendKeys("Pune");
		WebElement AllSuggestions = SeleniumUtility.driver
				.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li[@class='selected']"));
		AllSuggestions.click();

		WebElement CityTo = SeleniumUtility.driver.findElement(By.xpath("//input[@id='dest']"));
		CityTo.sendKeys("Bangalore");
		WebElement allSuggestions = SeleniumUtility.driver
				.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li[@class='selected']"));
		allSuggestions.click();
		WebElement calander = SeleniumUtility.driver.findElement(By.xpath("//div/input[@id='onward_cal']"));
		calander.click();
		WebElement nextmonth = SeleniumUtility.driver.findElement(By.xpath("//table/tbody/tr/td[@class='next']"));
		nextmonth.click();
		SeleniumUtility.driver.findElement(By.xpath("//tr[5]/td[2]")).click();
		SeleniumUtility.driver.findElement(By.xpath("//button[@id='search_btn']")).click();

		SeleniumUtility.driver
				.findElement(
						By.xpath("//ul[@class='dept-time dt-time-filter']//following::li[1]//preceding-sibling::label"))
				.click();
		SeleniumUtility.driver.findElement(By.xpath("//div[contains(text(),'BUS TYPES')]//following::ul/li[3]/label"))
				.click();

		List<WebElement> busses = SeleniumUtility.driver.findElements(By.xpath(
				"//ul[@class='bus-items']/div/li/div//preceding-sibling::div[@class='travels lh-24 f-bold d-color']"));
		System.out.println("The total busses are :" + busses.size());
		for (int i = 0; i < busses.size(); i++) {
			WebElement bus = busses.get(i);
			System.out.println(bus.getText());
		}

	}
}
