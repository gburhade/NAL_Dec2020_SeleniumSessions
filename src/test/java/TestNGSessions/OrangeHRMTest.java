package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest
{
	
	@Test(priority=1)
	public void orangeHRMtitleTest()
	{
		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		//Assertions
		Assert.assertEquals(title, "Free Human Resource Management Software | 30 Day Trial Creation");
	}
	
	@Test(priority=2)
	public void contactSalesTest()
	{
		Assert.assertTrue(driver.findElement(By.linkText("CONTACT SALES")).isDisplayed());
	}
	

}
