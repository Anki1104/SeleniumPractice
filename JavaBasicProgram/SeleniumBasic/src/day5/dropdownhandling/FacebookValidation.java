package day5.dropdownhandling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();

		Select dayDrop = new Select(driver.findElement(By.id("day")));
		List<Integer> days = new ArrayList<Integer>();
		for (int i = 1; i < dayDrop.getOptions().size(); i++) {
			String day = dayDrop.getOptions().get(i).getText();
			days.add(Integer.parseInt(day)); 
			 
		}
		List<Integer> dupDays = new ArrayList<Integer>(days);
		// dupDays.addAll(days);
		Collections.sort(dupDays);
		System.out.println(days.equals(dupDays));
		
		// for month
		Select Selectmonth = new Select(driver.findElement(By.id("month")));
		List<WebElement> MonthList = Selectmonth.getOptions();
		for (int i = 0; i < MonthList.size(); i++) {
			System.out.println("monthsList is :" + i + ":" + MonthList.get(i).getText());
		}
		String act_MonthsName = "";
		for (int i = 0; i < MonthList.size(); i++) {
			if ((MonthList.size() - 1) != i) {
				act_MonthsName = act_MonthsName + MonthList.get(i).getText() + ", ";
			} else {
				act_MonthsName = act_MonthsName + MonthList.get(i).getText();

			}
		}
		String exp_MonthsName = "January, February, March, April, May, June, July, August, September, October, November, December";
		System.out.println("act_monthName: " + act_MonthsName);
		System.out.println("exp_monthsName: " + exp_MonthsName);
		System.out.println("months are in sorted order or not: " + act_MonthsName.equals(exp_MonthsName));
		// for year
		Select Selectyear = new Select(driver.findElement(By.id("year")));
		List<WebElement> yearList = Selectyear.getOptions();
		for (int i = 0; i < yearList.size(); i++) {
			System.out.println("yearList is :" + yearList.get(i).getText());
		}
		String act_yearlist = "";
		for (int i = 1; i < yearList.size(); i++) {
			if ((yearList.size() - 1) != i) {
				act_yearlist = act_yearlist + yearList.get(i).getText() + ", ";
			} else {
				act_yearlist = act_yearlist + yearList.get(i).getText();
			}

		}
		String exp_yearlist = "2022, 2021, 2020, 2019, 2018, 2017, 2016, 2015, 2014, 2013, 2012, 2011, 2010, 2009, 2008, 2007, 2006, 2005, 2004, 2003, 2002, 2001, 2000, 1999, 1998, 1997, 1996, 1995, 1994, 1993, 1992, 1991, 1990, 1989, 1988, 1987, 1986, 1985, 1984, 1983, 1982, 1981, 1980, 1979, 1978, 1977, 1976, 1975, 1974, 1973, 1972, 1971, 1970, 1969, 1968, 1967, 1966, 1965, 1964, 1963, 1962, 1961, 1960, 1959, 1958, 1957, 1956, 1955, 1954, 1953, 1952, 1951, 1950, 1949, 1948, 1947, 1946, 1945, 1944, 1943, 1942, 1941, 1940, 1939, 1938, 1937, 1936, 1935, 1934, 1933, 1932, 1931, 1930, 1929, 1928, 1927, 1926, 1925, 1924, 1923, 1922, 1921, 1920, 1919, 1918, 1917, 1916, 1915, 1914, 1913, 1912, 1911, 1910, 1909, 1908, 1907, 1906, 1905";
		System.out.println("act_yearlist is :" + act_yearlist);
		System.out.println("exp_yearlist:" + exp_yearlist);
		System.out.println("year list are sorted order or not:" + act_yearlist.equals(exp_yearlist));

	}
}
