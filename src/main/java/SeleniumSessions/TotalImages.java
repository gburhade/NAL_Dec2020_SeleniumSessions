package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		 
		driver.get("https://www.amazon.in/");
		 
		List<WebElement> imagsList = driver.findElements(By.tagName("img"));
		for(WebElement e : imagsList)
		{
			 System.out.println(e.getAttribute("alt") + " " +e.getAttribute("src"));
		}
		

	}

}
