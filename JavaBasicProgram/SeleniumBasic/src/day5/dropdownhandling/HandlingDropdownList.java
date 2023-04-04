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

public class HandlingDropdownList {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement skillDropdown = driver.findElement(By.id("Skills"));

		Select selectSkill = new Select(skillDropdown);

		System.out.println("Is dropdown is allowing you to select multiple option: " + selectSkill.isMultiple());

		System.out.println("Already selected option name: " + selectSkill.getFirstSelectedOption().getText());

		List<WebElement> options = selectSkill.getOptions();
		System.out.println("Option count is:" + options.size());
		for (int i = 0; i < options.size(); i++) {
			System.out.println("Option " + i + ": " + options.get(i).getText());
		}

		selectSkill.selectByIndex(4);
		System.out.println("Already selected option name: " + selectSkill.getFirstSelectedOption().getText());
		// or
		selectSkill.selectByValue("Backup Management");
		System.out.println("Already selected option name: " + selectSkill.getFirstSelectedOption().getText());
		// or
		selectSkill.selectByVisibleText("Analytics");
		System.out.println("Already selected option name: " + selectSkill.getFirstSelectedOption().getText());

		String act_skillName = "";//
		for (int i = 1; i < options.size(); i++) {
			if ((options.size() - 1) != i) {
				act_skillName = act_skillName + options.get(i).getText() + ", ";
			} else {
				act_skillName = act_skillName + options.get(i).getText();
			}
		}
		String exp_skillName = "Adobe InDesign, Adobe Photoshop, Analytics, Android, APIs, Art Design, AutoCAD, Backup Management, C, C++, Certifications, Client Server, Client Support, Configuration, Content Managment, Content Management Systems (CMS), Corel Draw, Corel Word Perfect, CSS, Data Analytics, Desktop Publishing, Design, Diagnostics, Documentation, End User Support, Email, Engineering, Excel, FileMaker Pro, Fortran, HTML, Implementation, Installation, Internet, iOS, iPhone, Linux, Java, Javascript, Mac, Matlab, Maya, Microsoft Excel, Microsoft Office, Microsoft Outlook, Microsoft Publisher, Microsoft Word, Microsoft Visual, Mobile, MySQL, Networks, Open Source Software, Oracle, Perl, PHP, Presentations, Processing, Programming, PT Modeler, Python, QuickBooks, Ruby, Shade, Software, Spreadsheet, SQL, Support, Systems Administration, Tech Support, Troubleshooting, Unix, UI / UX, Web Page Design, Windows, Word Processing, XML, XHTML";
		System.out.println("skillName: " + act_skillName);
		System.out.println("exp_skillName: " + exp_skillName);
		System.out.println("Skills are in sorted order or not: " + act_skillName.equals(exp_skillName));

		Select dayDrop = new Select(driver.findElement(By.id("daybox")));
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
		Select Selectmonth = new Select(driver.findElement(By.cssSelector("select[placeholder='Month']")));
		List<WebElement> MonthList = Selectmonth.getOptions();
		for (int i = 0; i < MonthList.size(); i++) {
			System.out.println("monthsList is :" + i + ":" + MonthList.get(i).getText());
		}
		String act_MonthsName = "";
		for (int i = 1; i < MonthList.size(); i++) {
			if ((MonthList.size() - 1) != i) {
				act_MonthsName = act_MonthsName + MonthList.get(i).getText() + ", ";
			} else {
				act_MonthsName = act_MonthsName + MonthList.get(i).getText();

			}
		}
		String exp_MonthsName = "January, February, March, April, May, June, July, August, September, October, November, December";
		System.out.println("monthName: " + act_MonthsName);
		System.out.println("exp_monthsName: " + exp_MonthsName);
		System.out.println("months are in sorted order or not: " + act_MonthsName.equals(exp_MonthsName));
		// for year
		Select Selectyear = new Select(driver.findElement(By.id("yearbox")));
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
		String exp_yearlist = "1916, 1917, 1918, 1919, 1920, 1921, 1922, 1923, 1924, 1925, 1926, 1927, 1928, 1929, 1930, 1931, 1932, 1933, 1934, 1935, 1936, 1937, 1938, 1939, 1940, 1941, 1942, 1943, 1944, 1945, 1946, 1947, 1948, 1949, 1950, 1951, 1952, 1953, 1954, 1955, 1956, 1957, 1958, 1959, 1960, 1961, 1962, 1963, 1964, 1965, 1966, 1967, 1968, 1969, 1970, 1971, 1972, 1973, 1974, 1975, 1976, 1977, 1978, 1979, 1980, 1981, 1982, 1983, 1984, 1985, 1986, 1987, 1988, 1989, 1990, 1991, 1992, 1993, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015";
		System.out.println("act_yearlist is :" + act_yearlist);
		System.out.println("exp_yearlist:" + exp_yearlist);
		System.out.println("year list are acending order or not:" + act_yearlist.equals(exp_yearlist));

	}
}