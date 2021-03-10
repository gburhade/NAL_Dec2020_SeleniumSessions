package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptionsHandle 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/"); 
		
		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
		List<String> indus_List = getDropDownOptionsText(industry);
		System.out.println(indus_List.contains("Healthcare"));
		System.out.println(indus_List.contains("IT"));
		System.out.println(indus_List.contains("Education"));
		System.out.println(indus_List.contains("Electronics"));
		
	
	}
	
	// WAF to get the list of drop down values (text):
	// param: By locator
	// return: List<String>
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	
	public static List<String> getDropDownOptionsText(By locator)
	{
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsListText = new ArrayList<String>();
		
		System.out.println(optionsList.size());
		
		for(WebElement e : optionsList)
		{
			optionsListText.add(e.getText());
		}
		return optionsListText;
	}

}
