package testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.StartupPage;

public class LocatorsFactory extends StartupPage {
	//please write all the locators for facebook page only 

	By refreshButton = By.xpath("//button[@value='Refresh']"); 
	By logoIconLink = By.xpath("//a[@class='navbar-brand']"); 
	By CollapsibleGroup3 = By.xpath("//b[contains(text(), 'Collapsible Group 3 - Methhod Chaining')]"); 
	By autoCompleteTextBox = By.xpath("//input[@type='text']");
	By firstNameTextbox = By.xpath("//input[@placeholder='First Name']"); 
	By emailTextField = By.xpath("//input[@placeholder=\"E mail\"]"); 
	By switchToNavigationMenu = By.xpath("//a[contains(text() , 'SwitchTo')]"); 

	public LocatorsFactory(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}





	//Expected data will be fetch from config.json file,path of the json file is:FaceBook_Automation_Dummy/src/main/resources/config.json

	public WebElement refreshButton(WebDriver driver) {
		WebElement refreshButtonWebElement = driver.findElement(refreshButton);
		return refreshButtonWebElement; 
	}

	public WebElement logoIcon(WebDriver driver) {
		WebElement logoIconLinkWebElement = driver.findElement(logoIconLink);
		return logoIconLinkWebElement; 
	}
	
	public WebElement CollapsibleGroup3(WebDriver driver) {
		WebElement CollapsibleGroup3WebElement = driver.findElement(CollapsibleGroup3);
		return CollapsibleGroup3WebElement; 
	}
	
	public WebElement autoCompleteTextBox(WebDriver driver) {
		WebElement autoCompleteTextBoxWebElement = driver.findElement(autoCompleteTextBox);
		return autoCompleteTextBoxWebElement; 
	}
	
	public WebElement emailTextFieldIsPresent(WebDriver driver) {
		WebElement emailTextFieldWebElement = driver.findElement(emailTextField);
        return emailTextFieldWebElement;
    }
	
	public WebElement firstNameTextboxIsPresent(WebDriver driver) {
		WebElement firstNameTextboxWebElement = driver.findElement(firstNameTextbox);
        return firstNameTextboxWebElement;
    }
	public WebElement getswitchToNavigationMenu(WebDriver driver) {
		WebElement switchToNavigationMenuWebElement = driver.findElement(switchToNavigationMenu);
        return switchToNavigationMenuWebElement;
    }

}
