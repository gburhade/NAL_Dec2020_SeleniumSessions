package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcepts 
{
	String name ;
	
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void A_Test()
	{
		System.out.println("A Test");
		int i = 9/3;
		ExpectedExceptionConcepts eec = null;
		System.out.println(eec.name);
	}
	

}
