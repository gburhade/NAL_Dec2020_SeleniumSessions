package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuggestionList_Assignment_AutomationPractice 
{
   static WebDriver driver;
   
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		
		driver.navigate().to(url);
		Thread.sleep(3000);
		
		List<WebElement> suggestionLists = driver.findElements(By.xpath("//div[@class='ac_results']//li"));
		
		System.out.println(suggestionLists.size());
		for(WebElement e: suggestionLists)
		{
			if(e.getText().equals("T-shirts > Faded Short Sleeve T-shirts"))
			{
				e.click();
				break;
			}
		}
		
		//Validations
		WebElement itemName = driver.findElement(By.tagName("h1"));
		if(itemName.getText().equals("Faded Short Sleeve T-shirts"))
		{
			System.out.println("Correct Product shown");
		}
		else
		{
			System.out.println("Wrong Product");
		}

	}

}
