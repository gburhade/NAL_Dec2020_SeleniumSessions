package TestNGSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassicCRMTest extends BaseTest
{
	
	
		@Test(priority=1)
		public void crmtitleTest()
		{
			String title = driver.getTitle();
			System.out.println("Page title is : " + title);
			//Assertions
			Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		}
		
		@Test(priority=2)
		public void crmLogoTest()
		{
			Assert.assertTrue(driver.findElement(By.className("navbar-brand")).isDisplayed());
		}
		
		
		

}
