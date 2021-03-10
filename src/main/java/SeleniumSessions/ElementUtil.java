package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil 
{
	private WebDriver driver;
	private Actions action;
	
	public ElementUtil(WebDriver driver)
	{
		this.driver = driver;
		action = new Actions(this.driver);
	}
	
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	
	//sendkeys
	public void doSendkeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	//click
	public void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	//gettext
	public String doGetElementText(By Locator)
	{
		return getElement(Locator).getText();
	}

	public boolean doIsDisplayed(By Locator)
	{
		return getElement(Locator).isDisplayed();
	}
	
	
	public void doLinkClick(By locator, String value)
	{
		List<WebElement> linksList = getElements(locator);
		 for(WebElement e: linksList)
		 {
			 String text = e.getText();
			 System.out.println(text);
			 if(text.equals(value))
			 {
			    e.click();
			    break;
		      }
	     }
    }
	
	
	//******************************Drop Down Utils *************************
	
	public void doSelectByVisibleText(By locator, String text)
	{
		Select select = new Select(getElement(locator));	
		select.selectByVisibleText(text);
	}
	
	public void doSelectByIndex(By locator, int index)
	{
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public void doSelectByValue(By locator, String value)
	{
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	
	public List<String> getDropDownOptionsText(By locator)
	{
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsListText = new ArrayList<String>();
		
		System.out.println(optionsList.size());
		
		for(WebElement e : optionsList)
		{
			optionsListText.add(e.getText());
		}
		return optionsListText;
	}
	
	public void doSelectByTextOptions(By locator, String optionValue)
	{
      Select select = new Select(getElement(locator));
		
		List<WebElement> optionsList = select.getOptions();
		
		for(WebElement e: optionsList)
		{
			if(e.getText().equals(optionValue))
			{
				e.click();
				break;
			}
		}
	}
	
	/**
	 * This method is used to select the value from drop down without Select Class 
	 * @param locator
	 * @param text
	 */
	public void doSelectDropdownWithoutSelectClass(By locator, String text)
	{
        List<WebElement> optionsList = getElements(locator);
		
		for(WebElement e: optionsList)
		{
			if(e.getText().equals(text))
			{
				e.click();
				break;
			}
		}	
	}
	
	//*********************************ACTIONS CLASS UTILS ********************************
	//2 leven Menu and submenu
		public void doMoveToElement(By locator)
		{
			action.moveToElement(getElement(locator)).perform();
		}
		
		//3 level
		public void doMoveToElement(By locator1, By locator2)
		{
			action.moveToElement(getElement(locator1)).perform();
			action.moveToElement(getElement(locator2)).perform();
		}
		
		//3 level with click
		public void doMoveToElement(By locator1, By locator2, By locator3)
		{
			action.moveToElement(getElement(locator1)).perform();
			action.moveToElement(getElement(locator2)).perform();
			doClick(locator3);
		}
	
		public void doActionsClick(By locator)
		{
			action.click(getElement(locator)).perform();
		}
		
		public void doActionsSendkeys(By locator, String value)
		{
			action.sendKeys(getElement(locator), value).perform();
		}
		
}
