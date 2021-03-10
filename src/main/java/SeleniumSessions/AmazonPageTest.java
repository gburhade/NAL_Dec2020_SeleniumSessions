package SeleniumSessions;

public class AmazonPageTest 
{

	public static void main(String[] args) 
	{
        String browserName = "gaurav";
		
		BrowserUtility br = new BrowserUtility();
		br.launchBrowser(browserName);
		br.launchURL("https://www.amazon.com");
		
		String title = br.getPageTitle();
		if(title.contains("Online Shopping"))
		{
			System.out.println("Correct Title");
		}
		else
		{
			System.out.println("Incorrect Title");
		}
		
		if(br.getPageUrl().contains("amazon"))
		{
			System.out.println("Pointing to Correct URL");
		}
		
		br.closeBrowser();

	}

}
