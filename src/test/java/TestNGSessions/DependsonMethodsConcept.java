package TestNGSessions;

import org.testng.annotations.Test;

public class DependsonMethodsConcept 
{
	@Test()
	public void registerTest()
	{
		
	}
	
	@Test()
	public void loginTest()
	{
		System.out.println("login Test");
		int i = 9/0;
	}

	@Test(dependsOnMethods = {"loginTest","registerTest"}, priority = 1)
	public void searchTest()
	{
		System.out.println("search Test");
	}
	
	@Test(dependsOnMethods = "loginTest", priority = 2)
	public void paymentTest()
	{
		System.out.println("payment Test");
	}
}
