package testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pages.StartupPage;

public class LocatorsFactory extends StartupPage {
	//please write all the locators for facebook page only 
	//please write all the locators for facebook page only 
	
		By shopIconButton = By.xpath("//a[.='Shop']"); 
		By switchToNavigationMenu = By.xpath("//a[contains(text() , 'SwitchTo')]"); 
		By alertWithOk = By.xpath("//a[.='Alert with OK ']"); 
		By firstNameTextbox = By.xpath("//input[@placeholder='First Name']"); 
		By countryDropdown = By.xpath("//select[@id='countries']"); 

		

		 
		public LocatorsFactory(WebDriver driver) {
			super(driver);
		}
		
		//Expected data will be fetch from config.json file,path of the json file is:FaceBook_Automation_Dummy/src/main/resources/config.json


		public WebElement getswitchToNavigationMenu(WebDriver driver) {
			WebElement switchToNavigationMenuWebElement = driver.findElement(switchToNavigationMenu);
	        return switchToNavigationMenuWebElement;
	    }
		public WebElement getAlertWithOkButton(WebDriver driver) {
			WebElement alertWithOkWebElement = driver.findElement(alertWithOk);
	        return alertWithOkWebElement;
	    }
		public WebElement firstNameTextboxIsPresent(WebDriver driver) {
			WebElement firstNameTextboxWebElement = driver.findElement(firstNameTextbox);
	        return firstNameTextboxWebElement;
	    }
		
		public WebElement countryDropdownIsPresent(WebDriver driver) {
			WebElement countryDropdownWebElement = driver.findElement(countryDropdown);
	        return countryDropdownWebElement;
	    }
		
	
}