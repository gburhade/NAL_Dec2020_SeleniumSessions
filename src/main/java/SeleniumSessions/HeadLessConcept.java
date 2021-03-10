package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessConcept 
{

	public static void main(String[] args) 
	{
		//headless - no browser
		//testing is happening behind the scene
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--Incognito");
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(co);
		//WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());

	}

}
