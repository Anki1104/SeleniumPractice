package day5.dropdownhandling;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleSelectDropdownList {

	public static void main(String[] args) {
		String driverPath = System.getProperty("user.dir") + "\\executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://omayo.blogspot.com/");
		WebElement carDropdown = driver.findElement(By.id("multiselect1"));
		// constructor
		Select selectSkill = new Select(carDropdown);
		System.out.println("Is dropdown is allowing you to select multiple option: " + selectSkill.isMultiple());

		List<WebElement> options = selectSkill.getOptions();
		System.out.println("Option count is:" + options.size());
		for (int i = 0; i < options.size(); i++) {
			System.out.println("Option " + i + ": " + options.get(i).getText());
		}

		selectSkill.selectByIndex(0);
		selectSkill.selectByIndex(2);
		selectSkill.selectByIndex(3);

		List<WebElement> selectCars = selectSkill.getAllSelectedOptions();
		System.out.println("Selected car count: " + selectCars.size());

		// unselect already select options
//		selectSkill.deselectByIndex(0);
//		selectSkill.deselectByValue("Hyundaix");
//		selectSkill.deselectByVisibleText("Audi");
		// or
		selectSkill.deselectAll();

	}

}
