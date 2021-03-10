package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConcept 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		//driver.get("https://www.freshworks.com/");
		
		//driver.get("http://classic.crmpro.com/");
		
		//Locators :
		//create the web element --> perform the action(click, send keys, get the text)
		//First Locator : id  - always unique
		
		
		//1st approach
//		driver.findElement(By.id("input-email")).sendKeys("gaurav123@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Test@123");
		
		//2nd approach
//		WebElement emailid = driver.findElement(By.id("input-email"));
//		emailid.sendKeys("gaurav@yopmail.com");
//		
//		WebElement password = driver.findElement(By.id("input-password"));
//		password.sendKeys("test@123");
		
		
		//3rd approach : By Locators - Object Repository
//		By email = By.id("input-email"); // By Locators
//		By password = By.id("input-password"); // By Locators
//		
//		WebElement emailid = driver.findElement(email);  // Creating webelement
//		WebElement pwd = driver.findElement(password);  // Creating webelement
//		
//		emailid.sendKeys("naveen@gmail.com"); // Performing actions
//		pwd.sendKeys("test123");  // Performing actions
		
		
		//4th Approach : creating generic method for getting WebElement
//		getElement(email).sendKeys("gauravb");
//		getElement(password).sendKeys("root");
		
		//5th Approach
//		doSendkeys(email,"gaurav@yopmail.com");
//		doSendkeys(password,"User@123");
		
		
		//Second Locator : name - is not unique attribute
		//driver.findElement(By.name("username")).sendKeys("gaurav@gmail.com");
		
		//third Locator : className  - not recommended if class name is not unique
		//driver.findElement(By.className("btn")).sendKeys("gaurav@123");
		
		//Fourth Locator : xpath - is a locator , not an attribute. 
		//xpath is address of element in HTML Dom  
		
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[1]")).sendKeys("naveenk");
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/input[2]")).sendKeys("Test@123");
//		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div/input")).click();
		
		//Fifth Locator : CSS Selector : is a locator , not an attribute
//		driver.findElement(By.cssSelector("#loginForm > div > input:nth-child(1)")).sendKeys("gaurav123");
//		driver.findElement(By.cssSelector("#loginForm > div > div > input")).click();
		
		
		//Sixth Locator : Linktext - only for links  whose htmltag is <a> (anchor)
//		driver.findElement(By.linkText("Register")).click();
//		driver.findElement(By.linkText("Forgotten Password")).click();
		
		//Seventh Locator : PartialLinkText only for links  whose htmltag is <a> (anchor)
//		driver.findElement(By.partialLinkText("PDAs")).click();
		
		//About Us
		//About Me
		
		
		//Eight Locator : tagName - htmlTag
//		String h2headerText = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(h2headerText);
		
		//By Locators
		
		By email = By.id("input-email"); 
		By password = By.id("input-password"); 
		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		doSendkeys(email,"naveenanimation20@gmail.com");
		doSendkeys(password,"Selenium12345");
		
		doClick(loginBtn);
		
	}

	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doSendkeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}
	
}
