package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Freshworks_Assignment 
{
  static WebDriver driver;
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		
		By footerLinks = By.xpath("//div[@class='footer-main']//ul//li/a");
		
		ElementUtil eleutil = new ElementUtil(driver);
		List<WebElement> linkLists = eleutil.getElements(footerLinks);
		
		System.out.println("Freshworks --> FooterLinks");
		for(WebElement e : linkLists)
		{
			String text = e.getText();
			if(!text.isEmpty())
			{
				System.out.println(text);
			}
		}
		

	}

}
