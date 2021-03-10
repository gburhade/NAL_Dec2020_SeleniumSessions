package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementRefExceptionConcept 
{
	static WebDriver driver;
	
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		WebElement username = driver.findElement(By.id("input-email"));
		//f1fdf740-0105-41ed-b104-63feb0b3d16d
		
		username.clear();
		username.sendKeys("gaurav@gmail.com");
		//f1fdf740-0105-41ed-b104-63feb0b3d16d
		
		//username.clear();
		driver.navigate().refresh();  // DOM Refresh
		
		
		//solution to StaleElementRefException
		username = driver.findElement(By.id("input-email"));
		username.sendKeys("naveen@gmail.com");
		

	}

}
