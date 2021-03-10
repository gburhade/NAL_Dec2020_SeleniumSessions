package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class is having different generic methods related to browser...
 * @author PERENNIAL-QA
 *
 */
public class BrowserUtility 
{
	WebDriver driver;
	
	
	/**
	 * This method is used to initializa webdriver on the basis of given browser name...
	 * @param browserName
	 * @return This method returns webdriver reference
	 */
	public WebDriver launchBrowser(String browserName)
	{
		System.out.println("launching the browser "+browserName);
		
		switch (browserName) 
		{
		case "chrome":
		 	            WebDriverManager.chromedriver().setup();
		 	            driver = new ChromeDriver();
		            	break;
     
		case "firefox":
						WebDriverManager.firefoxdriver().setup();
						driver = new FirefoxDriver();
						break;
						
		case "safari":
						driver = new SafariDriver();
						break;


		default:
					System.err.println("Browser not found ..."+browserName);
					break;
		}
		
		return driver;
	}
	
	
	/**
	 * This method is used to enter the url in browser
	 * @param URL
	 */
	public void launchURL(String URL)
	{
	   System.out.println("URL is "+ URL);
		
		if(URL.isEmpty())
		{
			System.out.println("URL is empty..."+ URL);
			return;  // means return nothing = void
		}
		driver.get(URL);
	}
	
	
	/**
	 * This method is used to fetch the title of current webpage
	 * @return this method returns title of page
	 */
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	
	
	/**
	 * This method is used to capture the Currenct browser URL of webpage
	 * @return this method return Current URL of page
	 */
	public String getPageUrl()
	{
		return driver.getCurrentUrl();
	}
	

	//Quit Browser Util
	public void quitBrowser()
	{
		driver.quit();
	}
	
	//Close Browser Util
	public void closeBrowser()
	{
	   driver.close();
	}
	
	
}
