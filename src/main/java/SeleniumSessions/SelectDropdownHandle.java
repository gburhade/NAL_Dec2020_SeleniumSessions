package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdownHandle 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		//In order to user Select class to select dropdown options, html tag of webelement should be select
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
//		WebElement indus_ele = driver.findElement(industry);
//		WebElement country_ele = driver.findElement(country);
//		
//		Select select = new Select(indus_ele);	
//	    select.selectByIndex(2);//Select by index option should be used when dropdown values are fixed like day,week,months
//	    select.selectByVisibleText("Automotive");
//	    select.selectByValue("health"); // Value attribute should be present under select html tag in dropdown options properties
//	    
//	    Select select1 = new Select(country_ele);
//	    select1.selectByValue("India");
		
		doSelectByVisibleText(industry, "Education");
		doSelectByVisibleText(country, "India");
	    
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doSelectByVisibleText(By locator, String text)
	{
		Select select = new Select(getElement(locator));	
		select.selectByVisibleText(text);
	}
	
	public static void doSelectByIndex(By locator, int index)
	{
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectByValue(By locator, String value)
	{
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	

}
