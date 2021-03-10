package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept 
{

	public static void main(String[] args) 
	{
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.flipkart.com/");
       
       String title = driver.getTitle();
       System.out.println(title);
       
       if(title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books"))
       {
    	   System.out.println("Correct Title");
       }
       else
       {
    	   System.out.println("Correct Title");
       }
 		
		
	}

}
