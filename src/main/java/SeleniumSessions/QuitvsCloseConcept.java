package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitvsCloseConcept 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Gaurav\\GB\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		//driver.quit();
		driver.close();
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println("Ending");
		driver.close();
		//driver.quit();

	}

}
