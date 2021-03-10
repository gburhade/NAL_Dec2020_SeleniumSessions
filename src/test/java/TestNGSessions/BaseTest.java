package TestNGSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest 
{
	
	 WebDriver driver;
		
	    @Parameters({"browser","url"})
		@BeforeTest()
		public void setUp(String browser,String url)
		{
			if(browser.equals("chrome"))
			{
			  WebDriverManager.chromedriver().setup();
			  driver = new ChromeDriver();
		     }
			else if(browser.equals("firefox"))
			{
				  WebDriverManager.firefoxdriver().setup();
				  driver = new FirefoxDriver();
			 }
			else if(browser.equals("safari"))
			{
				driver = new SafariDriver();
			}
			else
			{
				System.out.println("browser not found " + browser);
			}
			
			driver.get(url);
			
		}
	    
		@AfterTest()
		public void tearDown()
		{
			driver.quit();
		}

}
