package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest
{
	
	
	@Test(priority=1)
	public void titleTest()
	{
		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		//Assertions
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}

	@Test(priority=2)
	public void urlTest()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertTrue(url.contains("amazon"));
	}
	
	@Test(priority=3)
	public void logoTest() throws InterruptedException
	{
		Assert.assertTrue(driver.findElement(By.id("nav-logo-sprites")).isDisplayed());
	}
	

	
}
