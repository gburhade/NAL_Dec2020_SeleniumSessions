package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinkswithAttribute {

	public static void main(String[] args) 
	{
		//get total links
		//print all the href values of each link (having no balank text)
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> linkLists = driver.findElements(By.tagName("a"));
		System.out.println(linkLists.size());
		
		for(WebElement e : linkLists)
		{
			if(!e.getText().isEmpty())
			{
               String URL  = e.getAttribute("href");
               if(URL != null)
               {
               System.out.println(URL);
               }
			}
		
		}
		
		

	}

}
