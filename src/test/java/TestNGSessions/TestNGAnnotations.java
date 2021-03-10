package TestNGSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations 
{
	//Global Pre Conditions
	   //Pre-conditions ->  Test Steps  -> Post Conditions
	   //Pre-conditions ->  Test Steps  -> Post Conditions
	   //Pre-conditions ->  Test Steps  -> Post Conditions
	//Global Post Conditions
	
	
/**
 *    	BS -  Create User
	    BT - Connect to Database
	    BC - Launch the browser
	    
	         BM  -  Login to App
	                Do the Payment
	         AM  - logout from app
	         
	         BM  -  Login to App
	              add the product to the Cart
	         AM  - logout from app
	         
	          BM  -  Login to App
	                 search the product
	          AM  - logout from app
	          
	AC  -  close the browser
	AT   -  disconnect from Database
	AS   -  Delete the user
	*/
	
	
	@BeforeSuite
	public void createUser()
	{
		System.out.println("BS -  Create User");
	}
	
	@BeforeTest
	public void connecttoDB()
	{
		System.out.println("BT - Connect to Database");
	}
	
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("BC - Launch the browser");
	}
	
	@BeforeMethod
	public void loginToApp()
	{
		System.out.println("BM  -  Login to App");
	}
	
	@Test(priority=3)
	public void searchTest()
	{
		System.out.println("search Test");
	}
	
	@Test(priority=2)
	public void addToCart()
	{
		System.out.println("add To Cart");
	}
	
	@Test(priority=1)
	public void paymentTest()
	{
		System.out.println(" Payment Test");
	}
	
	@AfterMethod
	public void logoutApp()
	{
		System.out.println("AM  - logout from app");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("AC  -  close the browser");
	}
	
	@AfterTest
	public void disconnectDB()
	{
		System.out.println("AT   -  disconnect from Database");
	}
	
	@AfterSuite
	public void DeleteUser()
	{
		System.out.println("AS   -  Delete the user");
	}
	

}
