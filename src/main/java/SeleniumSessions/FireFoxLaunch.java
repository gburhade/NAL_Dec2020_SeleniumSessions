package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver,gecko.driver", "D:\\Gaurav\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
        driver.get("https://www.google.com/"); //enter URL
		
		String title = driver.getTitle(); // get the title
		System.out.println(" page title is "+title);
		
		//Verification point/check point / Actual vs Expected
		
		if(title.equals("Google"))
		{
			System.out.println("Correct Title");
		}
		else
		{
			System.out.println("in-correct title");
		}
		
		
		//Getting the current url
		System.out.println(driver.getCurrentUrl());
		
		//getting page source of webpage
	//	System.out.println(driver.getPageSource());
		
		driver.close();

	}

}
