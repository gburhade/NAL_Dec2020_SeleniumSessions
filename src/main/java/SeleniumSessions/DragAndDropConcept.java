package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept 
{
   static WebDriver driver;
	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html"); 
		
		WebElement srcElement = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
//		action
//		.clickAndHold(srcElement)
//		.moveToElement(targetElement)
//		.release()
//		.build().perform();
		
		action.dragAndDrop(srcElement, targetElement).perform();
		
		
		
		
	}

}
