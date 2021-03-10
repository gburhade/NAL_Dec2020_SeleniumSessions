package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFieldElements 
{
	static WebDriver driver;

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 driver.get("https://demo.opencart.com/index.php?route=account/register");
		 
		 By textBoxes = By.xpath("//input[@class='form-control']");
		 By loginLink = By.linkText("Login");
		 
		 
		 ElementUtil eleutil = new ElementUtil(driver);
		 
		 
		 // ways to check if element is present 
		 //1st one
		 if(eleutil.doIsDisplayed(loginLink))
		 {
			 System.out.println("Login link is present");
		 }
		 
		 //2nd one - Recommended approach
		 if(eleutil.getElements(loginLink).size() == 1)
		 {
			 System.out.println("Login is present");
		 }
		 
		 List<WebElement>textFields = eleutil.getElements(textBoxes);
		 
		 if(textFields.size() == 6)
		 {
			 System.out.println("yes, all fields are present");
		 }
		 
		 for(WebElement e : textFields)
		 {
			 e.sendKeys("Selenium");
		 }

	}

}
