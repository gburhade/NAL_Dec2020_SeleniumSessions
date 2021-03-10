package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys 
{
  static WebDriver driver;
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By fname = By.id("Form_submitForm_FirstName");
		By contactSales = By.linkText("CONTACT SALES");
		
//		Actions action = new Actions(driver);
//		action.sendKeys(driver.findElement(fname), "Gaurav").perform();
//		
//		action.click(driver.findElement(freetrialBtn)).perform();
		

		doActionsSendkeys(fname, "Gaurav");
		doActionsClick(contactSales);

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doActionsClick(By locator)
	{
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
	}
	
	public static void doActionsSendkeys(By locator, String value)
	{
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).perform();
	}
	

}
