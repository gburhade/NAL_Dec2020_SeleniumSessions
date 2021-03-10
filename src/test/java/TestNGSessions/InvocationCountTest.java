package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCountTest 
{

	//Invocation count - execute specific test method for given number of times
	@Test(invocationCount = 5)
	public void B_Test()
	{
		System.out.println("B Test");
	}
}
