package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationApplicationTest 
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException 
	{
		
		BrowserUtility browutil = new BrowserUtility();
		driver = browutil.launchBrowser("chrome");
		browutil.launchURL("https://demo.opencart.com/index.php?route=account/register");
		String title = browutil.getPageTitle();
		System.out.println(title);
		
		//Validations
		if(title.equals("Register Account"))
		{
			System.out.println("Correct title");
		}
		else
		{
			System.out.println("Incorrect Title");
		}
		
		By fname = By.id("input-firstname");
		By lname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephn = By.id("input-telephone");
		By password = By.id("input-password");
		By confpswd = By.id("input-confirm");
		By privacypolicy = By.xpath("//input[@name='agree']");
		By contbtn = By.xpath("//input[@type='submit']");	
		By acctitle = By.xpath("//div[@id='content']//h1");
		
		
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.doSendkeys(fname, "Gaurav");
		eleutil.doSendkeys(lname, "Burhade");
		eleutil.doSendkeys(email, "gaurav3@gmail.com");
		eleutil.doSendkeys(telephn, "9988556321");
		eleutil.doSendkeys(password, "User@123");
		eleutil.doSendkeys(confpswd, "User@123");
		eleutil.doClick(privacypolicy);
		eleutil.doClick(contbtn);
		
		Thread.sleep(3000);
		String confirmtnmsg= eleutil.doGetElementText(acctitle);
		if(confirmtnmsg.equals("Your Account Has Been Created!"))
		{
			System.out.println("Account Successfully added");
		}
		
			
		driver.quit();

	}

}
