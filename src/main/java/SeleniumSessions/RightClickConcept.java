package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept 
{
   static WebDriver driver;
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightclickBtn = driver.findElement(By.className("context-menu-one"));
		 
		Actions action = new Actions(driver);
		//action.moveToElement(rightclickBtn).contextClick().build().perform();
		action.contextClick(rightclickBtn).perform();
		
		List<WebElement> rightClickOptions = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//span"));
		
		System.out.println(rightClickOptions.size());
		
		for(WebElement e : rightClickOptions)
		{
			String text = e.getText();
			System.out.println(text);
			
			if(text.equals("Cut"))
			{
				e.click();
				break;
			}
		}
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
//		
	//	driver.close();

	}

}
