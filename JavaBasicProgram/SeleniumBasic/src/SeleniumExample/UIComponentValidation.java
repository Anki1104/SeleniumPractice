package SeleniumExample;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class UIComponentValidation {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://demo.automationtesting.in/Register.html");
			WebElement firstNameInputField=driver.findElement(By.className("form-control"));
			System.out.println("First name input field visible or not? "+firstNameInputField.isDisplayed());
			System.out.println("First name input field editable or not? "+firstNameInputField.isEnabled());
			String firstNameInputFieldValue=firstNameInputField.getAttribute("placeholder");
			System.out.println("Default value validation status: "+firstNameInputFieldValue.equals("First Name"));
			
			WebElement maleRadioBtn=driver.findElement(By.name("radiooptions"));
			System.out.println("Male radio button visible or not? "+maleRadioBtn.isDisplayed());
			System.out.println("Male radio button functional or not? "+maleRadioBtn.isEnabled());
			System.out.println("Male radio button default selection status? "+maleRadioBtn.isSelected());	
			maleRadioBtn.click();
			System.out.println("After selection, Male radio button selection status? "+maleRadioBtn.isSelected());	
			
			WebElement submitBtn=driver.findElement(By.id("submitbtn"));
			System.out.println("Submit button visible or not? "+submitBtn.isDisplayed());
			System.out.println("Submit button functional or not? "+submitBtn.isEnabled());	
			String actualButtonName=submitBtn.getText().trim();
			System.out.println("Submit button name validation status? "+actualButtonName.equals("Submit"));
		}
	}

