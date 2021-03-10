package TestNGSessions;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityConcept 
{
	
//	@BeforeSuite
//	public void createUser()
//	{
//		System.out.println("BS -  Create User");
//	}
//	
//	@BeforeTest
//	public void connecttoDB()
//	{
//		System.out.println("BT - Connect to Database");
//	}
//	
//	@BeforeClass
//	public void launchBrowser()
//	{
//		System.out.println("BC - Launch the browser");
//	}
//	
//	@BeforeMethod
//	public void loginToApp()
//	{
//		System.out.println("BM  -  Login to App");
//	}

	@Test(priority=1)
	public void A_Test()
	{
		System.out.println("A Test");
	}
	
	@Test(priority=1)
	public void B_Test()
	{
		System.out.println("B Test");
	}
	
	@Test(priority=1)
	public void C_Test()
	{
		System.out.println("C Test");
	}
	
	@Test()
	public void G_Test()
	{
		System.out.println("G Test");
	}
	
	@Test()
	public void E_Test()
	{
		System.out.println("E Test");
	}
	
	@Test()
	public void F_Test()
	{
		System.out.println("F Test");
	}
	
	
}
