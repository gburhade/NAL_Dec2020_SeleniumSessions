package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoEcommAppTest {

	public static void main(String[] args) 
	{
		
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.launchURL("https://demo.opencart.com/index.php?route=account/login");
		String title = bu.getPageTitle();
		System.out.println("Login Page Title is "+title);
		
		//By Locators
		By email = By.id("input-email"); 
		By password = By.id("input-password"); 
		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		By yourStoreLink = By.linkText("Your Store");
		
		ElementUtil eu = new ElementUtil(driver);
		eu.doSendkeys(email, "gaurav.burhade77@gmail.com");
		eu.doSendkeys(password, "Lmessi@10");
		eu.doClick(loginBtn);
		
		String accntpageTitle = bu.getPageTitle();
		System.out.println(accntpageTitle);
		
		if(eu.doIsDisplayed(yourStoreLink))
		{
			String linktext = eu.doGetElementText(yourStoreLink);
			System.out.println(linktext);
		}

		bu.closeBrowser();
	}

}
