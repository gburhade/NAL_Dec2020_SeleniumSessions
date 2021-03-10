package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\GB\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//launch chrome
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
