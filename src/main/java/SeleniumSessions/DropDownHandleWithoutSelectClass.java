package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass 
{
  static WebDriver driver;
	public static void main(String[] args) 
	{
		//Selecting dropdown value without using Select class 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/"); 
		
		By indus = By.xpath("//select[@id='Form_submitForm_Industry']/option");
		By country  = By.xpath("//select[@id='Form_submitForm_Country']/option");
		
		doSelectDropdownWithoutSelectClass(indus, "Healthcare");
		doSelectDropdownWithoutSelectClass(country, "India");

	}
	
	public static void doSelectDropdownWithoutSelectClass(By locator, String text)
	{
        List<WebElement> optionsList = driver.findElements(locator);
		
		for(WebElement e: optionsList)
		{
			if(e.getText().equals(text))
			{
				e.click();
				break;
			}
		}	
	}

}
