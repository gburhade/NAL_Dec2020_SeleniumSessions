package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Gaurav\\GB\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//Verification point/check point/Actual vs Expected
		if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("Correct title");
		}
		else
		{
			System.out.println("Incorrect title");
		}
		
		String url = driver.getCurrentUrl();
		if(url.contains("facebook"))
		{
			System.out.println("Correct URL");
		}
		else
		{
			System.out.println("In correct URL");
		}
		
		driver.close();
	}

}
