package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDowValuewithText 
{
   static WebDriver driver;
	
	public static void main(String[] args) 
	{
		//How to select dropdown value without using any of selectbyvalue, selectbyindex and selectbyVisibleText
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
//		Select select = new Select(driver.findElement(industry));
//		
//		List<WebElement> optionsList = select.getOptions();
//		
//		for(WebElement e: optionsList)
//		{
//			if(e.getText().equals("Healthcare"))
//			{
//				e.click();
//				break;
//			}
//		}
		
		doSelectByTextOptions(industry, "Healthcare");
		doSelectByTextOptions(country, "India");
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	//Interview Questions
	//Without using SelectByIndex, SelectByValue and SelectByVisibleText
	public static void doSelectByTextOptions(By locator, String optionValue)
	{
      Select select = new Select(getElement(locator));
		
		List<WebElement> optionsList = select.getOptions();
		
		for(WebElement e: optionsList)
		{
			if(e.getText().equals(optionValue))
			{
				e.click();
				break;
			}
		}
	}

}
