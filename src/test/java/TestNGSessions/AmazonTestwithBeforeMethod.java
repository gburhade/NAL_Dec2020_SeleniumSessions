package TestNGSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTestwithBeforeMethod 
{
   WebDriver driver;
	
	@BeforeMethod()
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}
	
	
	@Test()
	public void titleTest()
	{
		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		//Assertions
		Assert.assertEquals(title, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	}
	
	@Test()
	public void urlTest()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("amazon"));
	}
	
	@Test()
	public void logoTest()
	{
		Assert.assertTrue(driver.findElement(By.cssSelector("#nav-logo")).isDisplayed());
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}

}
