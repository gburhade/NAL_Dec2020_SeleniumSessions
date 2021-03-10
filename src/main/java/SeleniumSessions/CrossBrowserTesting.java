package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		String browser = "chrome";
		
		if(browser.equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\GB\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver", "D:\\Gaurav\\Drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();  
			driver = new FirefoxDriver();	
		}
//		else if(browser.equals("safari"))
//		{
//			driver = new SafariDriver();
//		}
		else
		{
			System.out.println("Please pass the correct browser name");
		}
		
		driver.get("https://www.amazon.in/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		
		

	}

}
