package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsMethod 
{

	public static void main(String[] args) 
	{
		//get list of elements using findElements
		//get list count
		//print the text of link
		//only print those element text whose text is not empty
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		for(int i=0;i<linklist.size();i++)
		{
			String text = linklist.get(i).getText();
			if(!text.isEmpty())
			{
			  System.out.println(i+ "-->"+text);
			}
		}
		

	}

}
