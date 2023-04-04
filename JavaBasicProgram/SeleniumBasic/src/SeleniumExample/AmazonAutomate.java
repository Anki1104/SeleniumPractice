package SeleniumExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonAutomate {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		setUp("chrome");
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		  System.out.println(driver.getTitle());
		 driver.get("https://www.amazon.in/minitv?ref_=nav_avod_desktop_topnav");
		 String actualpageTitle=driver.getCurrentUrl();
		 System.out.println("actualpageTitle :"+driver.getCurrentUrl());
		 String expectedpageTitle ="https://www.amazon.in/minitv?ref_=nav_avod_desktop_topnav";
		 System.out.println("expectedpageTitle:" +expectedpageTitle.equals(actualpageTitle));
		 driver.navigate().back();
		 driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		 String actualpage=driver.getCurrentUrl();
		 System.out.println("the actualpage is:"+driver.getCurrentUrl());
		 String expectedpage ="https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles";
		 System.out.println("the expectedpage is:"+ expectedpage.equals(actualpage));
		 driver.navigate().back();
		 Thread.sleep(2000);
		 //driver.close();
	}
	public static void setUp(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
			  driver = new ChromeDriver();
		
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",".\\executable\\geckodriver.exe");
			  driver = new FirefoxDriver();
			
		}
	}

}
