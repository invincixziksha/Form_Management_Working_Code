package pages;

import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormManagement_L2_Pages extends StartupPage 
{

	By firstNameTextbox = By.xpath("//input[@placeholder='First Name']"); 
	By lastNameTextbox = By.xpath("//input[@placeholder='Last Name']"); 
	By addressInputAreabox = By.xpath("//textarea[@ng-model='Adress']"); 
	By emailAddressTextbox = By.xpath("//input[@type='email']"); 
	By phoneNumberTextbox = By.xpath("//input[@type='tel']"); 
	By maleRadioButton = By.xpath("//input[@value='Male']"); 
	By feMaleRadioButton = By.xpath("//input[@value='FeMale']"); 
	By CricketCheckBox = By.xpath("//input[@value='Cricket']"); 
	By MoviesCheckBox = By.xpath("//input[@value='Movies']"); 
	By HockeyCheckBox = By.xpath("//input[@value='Hockey']"); 
	By languageDropdown = By.xpath("//div[@id='msdd']"); 
	By selectEnglish = By.xpath("//a[contains(text(), 'English')]"); 
	By selectCountryIndia = By.xpath("//li[contains(text(), 'India')]"); 
	By selectYear = By.xpath("//select[@placeholder='Year']");
	By selectMonth = By.xpath("//select[@placeholder='Month']"); 
	By selectDate = By.xpath("//select[@placeholder='Day']"); 
	By password = By.xpath("//input[@id='firstpassword']");
	By confirmPassword = By.xpath("//input[@id='secondpassword']");
	By submitButton = By.xpath("//button[@id='submitbtn']");
	By refreshButton = By.xpath("//button[@value='Refresh']");
	By skillsDropdown = By.xpath("//select[@ng-model='Skill']");
	By countryDropdown = By.xpath("//select[@id='countries']");
	By radioButton = By.xpath("//input[@type='radio']");
	By switchToNavigationMenu = By.xpath("//a[contains(text() , 'SwitchTo')]"); 
	By window = By.xpath("//a[contains(text() , 'Window')]"); 
	By clickLink = By.xpath("(//button[contains(text(), 'click')])[1]");
	By openNewSeparateWindowLink = By.xpath("//a[contains(text(), 'Open New Seperate Windows')]");
	By newWindowclickLink = By.xpath("//button[@onclick='newwindow()']");
	By openMultipleSeparateWindowLink = By.xpath("//a[contains(text(), 'Open Seperate Multiple Windows')]");
	By newMultipleWindowclickLink = By.xpath("//button[@onclick='multiwindow()']");
	By skipSignInButton = By.xpath("//button[contains(text(), 'Skip Sign In')]");
	By widgetsMenu = By.xpath("//a[contains(text(), 'Widgets')]");
	By accordionList = By.xpath("//a[contains(text(), ' Accordion ')]");
	By accordionListToggle = By.xpath("//b[contains(text(), 'Collapsible Group 2 - Single Line Coding')]");
	By accordionListTogglePannel2Text = By.xpath("//div[@id=\"collapse2\"]//div");
	By autoCompleteLink = By.xpath("//a[contains(text(), ' AutoComplete ')]");
	By autoCompleteTextBox = By.xpath("//input[@type='text']");
	By signInButton = By.xpath("//button[.='Sign In']"); 
	By homeIcon = By.xpath("//a[.='Home']"); 
	By registerNavigationMenu = By.xpath("//a[contains(text() , 'Register')]"); 
	By interactioNavigationMenu = By.xpath("//a[contains(text(),'Interactions ')]");
	By dragAndDrop = By.xpath("//a[.='Drag and Drop ']");
	By staticButton = By.xpath("//a[.='Static ']");
	By sourceLocationseleniumLogo = By.xpath("//img[@id='node']");
	By targetLocationseleniumLogo = By.xpath("//div[@id='droparea']");
	


	//Getting the page name
	String pageName = this.getClass().getSimpleName();


	//constructor Initialization
	public FormManagement_L2_Pages(WebDriver driver) 
	{
		super(driver);
	}	


	//Utilization
	
	/**@Test1
	 * about this method goTohomeThenClickOnSignInButtOnValidateTitleOfTheSignInPage() 
	 * @param : null
	 * @description : Click on the home and click on the sign in button then validate the title of the page 
	 * @return : String
	 * @author : yaksha
	 */
	public String goTohomeThenClickOnSignInButtOnValidateTitleOfTheSignInPage() throws Exception {
		try {
			commonEvents.click(homeIcon);
			commonEvents.click(signInButton);
			String titleOfThePage = driver.getTitle();
			System.out.println("Title of this Page:"+titleOfThePage);
			return titleOfThePage;
		}catch(Exception e) {
			throw e;
		}
	}
	
	
	/**@Test2
	 * about this method goBackToIndexPageclickonSkipSignInButtonAndValidateTheRegisterPageTitle() 
	 * @param : null
	 * @description :Going back to the index page then click on the signIn button and validate the page title.
	 * @return : String
	 * @author : yaksha
	 */
	public String goBackToIndexPageclickonSkipSignInButtonAndValidateTheRegisterPageTitle() throws Exception {
		try {
			driver.navigate().back();
		    commonEvents.click(skipSignInButton);
		    String titleOfThePage = driver.getTitle();
			System.out.println("Title of this Page:"+titleOfThePage);
			return titleOfThePage;
		}catch(Exception e) {
			throw e;
		}
	}
	
	
	/**@Test3
	 * about this method thenFillTheRegisterFormAndClickOnRefreshButton() 
	 * @param : Map<String, String>
	 * @description :Fill all the fields and click on refresh button
	 * @return : boolean
	 * @author : yaksha
	 */
		public boolean thenFillTheRegisterFormAndClickOnRefreshButton(Map<String, String> expectedData) throws Exception {
			try {
				commonEvents.click(registerNavigationMenu);
			    commonEvents.sendKeys(firstNameTextbox,expectedData.get("firstName"));	
			    commonEvents.sendKeys(lastNameTextbox,expectedData.get("lastName"));	
				commonEvents.sendKeys(addressInputAreabox,expectedData.get("adds"));	
				commonEvents.sendKeys(emailAddressTextbox,expectedData.get("emaiI"));	
				commonEvents.sendKeys(phoneNumberTextbox,expectedData.get("phoneNo"));

			}catch(Exception e) {
				throw e;
			}
			return true;		
	}

	/**@Test4.1
	 * about this method fillTheForms() 
	 * @param : Map<String, String>
	 * @description : fill emailAddsPhoneNumberTextbox then enter data in passwordTextbox and click on login button
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public boolean fillTheForms(Map<String, String> expectedData) throws Exception {
		try {
			commonEvents.sendKeys(firstNameTextbox,expectedData.get("firstName"));	
			commonEvents.sendKeys(lastNameTextbox,expectedData.get("lastName"));
			commonEvents.sendKeys(addressInputAreabox,expectedData.get("adds"));
			commonEvents.sendKeys(emailAddressTextbox,expectedData.get("emaiI"));
			commonEvents.sendKeys(phoneNumberTextbox,expectedData.get("phoneNo"));
			commonEvents.click(maleRadioButton);
			commonEvents.click(MoviesCheckBox);
			commonEvents.selectByVisibleText(skillsDropdown, expectedData.get("skills") );
			commonEvents.selectByVisibleText(selectYear, expectedData.get("year") );
			commonEvents.selectByVisibleText(selectMonth, expectedData.get("month") );
			commonEvents.selectByVisibleText(selectDate, expectedData.get("day") );
			commonEvents.sendKeys(password,expectedData.get("password"));	
			commonEvents.sendKeys(confirmPassword,expectedData.get("confirmPassword"));
		}catch(Exception e) {
			throw e;
		}
		return true;
	}



	/**@Test4.2
	 * about this method VerifyThatClickingOnRefreshButtonItsRefreshingAllTheEnteredDataInAllTheFields() 
	 * @param : null
	 * @description : it will click on refresh button after fill the form then check each fields is empty or not
	 * @return : Boolean
	 * @author : Yaksha
	 */
	public Boolean VerifyThatClickingOnRefreshButtonItsRefreshingAllTheEnteredDataInAllTheFields() throws Exception {
		try {
			// TODO Auto-generated method stub
			commonEvents.click(refreshButton);
			if(commonEvents.isEmpty(firstNameTextbox)&&
					commonEvents.isEmpty(lastNameTextbox)&&
					commonEvents.isEmpty(addressInputAreabox)&&
					commonEvents.isEmpty(emailAddressTextbox)&& 
					commonEvents.isEmpty(phoneNumberTextbox)
					) {
				return true;
			}

		}catch(Exception e) {
			throw e;
		}
		return false;
	}

	/** @test5
	 * about this method verifyTitleOfNewTab() 
	 * @param : null
	 * @description : here control go to the new Tab and get the title  of the new tab page,
	 * @return : title of string type
	 * @author : Yaksha
	 */
	public String verifyTitleOfNewTab() throws Exception {
		commonEvents.click(switchToNavigationMenu);
		commonEvents.click(window);
		commonEvents.click(clickLink);
		try {
			String mainWindowHandle = driver.getWindowHandle();
			Set<String> allWindowHandles = driver.getWindowHandles();
			for (String handle : allWindowHandles) {
				if (!handle.equals(mainWindowHandle)) {
					driver.switchTo().window(handle);	
					break;   
				}
			}
			String currentPageTitle	=  driver.getTitle();
			System.out.println("Title of the New tab Page : " + currentPageTitle );
			driver.close();
			driver.switchTo().window(mainWindowHandle);
			return currentPageTitle;    
		}catch(Exception e) {
			throw e;
		}

	}

	/** @test6
	 * about this method verifyTitleOfNewWindows() 
	 * @param : null
	 * @description : here control goes to the new window and get the title  of the new window page,
	 * @return : title of string type
	 * @author : Yaksha
	 */
	public String verifyTitleOfNewWindows() throws Exception {
		commonEvents.click(switchToNavigationMenu);
		commonEvents.click(window);
		commonEvents.click(openNewSeparateWindowLink);
		commonEvents.click(newWindowclickLink);
		try {
			String mainWindowHandle = driver.getWindowHandle();
			Set<String> allWindowHandles = driver.getWindowHandles();
			for (String handle : allWindowHandles) {
				if (!handle.equals(mainWindowHandle)) {
					driver.switchTo().window(handle);
					break;
				}
			}
			String currentPageTitle	=  driver.getTitle();
			System.out.println("Title of the New Windows Page : " + currentPageTitle );
			driver.close();
			driver.switchTo().window(mainWindowHandle);
			return currentPageTitle;        
		}catch(Exception e) {
			throw e;
		}
	}

	/** @test7
	 * about this method verifyTitleOfMultipleWindows() 
	 * @param : null
	 * @description : here control goes to the new window and get the title  of the new window page,
	 * @return : title of string type
	 * @author : Yaksha
	 */
	public String verifyTitleOfMultipleWindows() throws Exception {
		commonEvents.click(switchToNavigationMenu);
		commonEvents.click(window);
		commonEvents.click(openMultipleSeparateWindowLink);
		commonEvents.click(newMultipleWindowclickLink);
		try {
			String mainWindowHandle = driver.getWindowHandle();
			Set<String> allWindowHandles = driver.getWindowHandles();
			for (String handle : allWindowHandles) {
				if (!handle.equals(mainWindowHandle)) {
					driver.switchTo().window(handle);
					break;
				}
			}
			String currentPageTitle	=  driver.getTitle();
			System.out.println("Title of the Multiple windows Page : " + currentPageTitle );
			driver.close();
			driver.switchTo().window(mainWindowHandle);
			return currentPageTitle;        
		}catch(Exception e) {
			throw e;
		}
	}
	
	/**@Test8
	 * about this method gotoInteractionTabclickOnDragandDropThenClickOnStaticThenValidateTitleOfThePage() 
	 * @param :null
	 * @description :go to Interaction Tab click On Drag and Drop Then Click On Static Then Validate Title Of The Page
	 * @return : String
	 * @author : yaksha
	 */	
	
	public String gotoInteractionTabclickOnDragandDropThenClickOnStaticThenValidateTitleOfThePage() throws Exception {
		try {
			commonEvents.click(interactioNavigationMenu);
			commonEvents.click(dragAndDrop);
			commonEvents.click(staticButton);
			String title=driver.getTitle();		
			return title;
		}catch(Exception e) {
			throw e;
		}
	}
	
	

	/**@Test9
	 * about this method selecttheSeleniumLogoAndPerformDragAndDropOperation() 
	 * @param :null
	 * @description :Select the selenium logo and perform drag and drop operation
	 * @return : boolean
	 * @author : yaksha
	 */	
	
	public boolean selecttheSeleniumLogoAndPerformDragAndDropOperation() throws Exception {
		try {
	          commonEvents.dragAndDrop(sourceLocationseleniumLogo,
					targetLocationseleniumLogo,
                    "sourceElementName",
                    "targetElementName",
                    "pageName");
			Thread.sleep(5000);
		}catch(Exception e) {
			throw e;
		}
		return true;
	}

	/** @test10
	 * about this method verifyTextofAnyToggleActionInsideOfAccordionListMenu() 
	 * @param : null
	 * @description : here get the text from CollapsibleGroup pannnel body of Widget Menu of Accordion list ,
	 * @return : title of string type
	 * @author : Yaksha
	 */
	public String verifyTextofAnyToggleActionInsideOfAccordionListMenu() throws Exception {

		try {
			commonEvents.click(widgetsMenu);
			commonEvents.click(accordionList);
			commonEvents.click(accordionListToggle);
			String textOfPannelTwoBody = commonEvents.getText(accordionListTogglePannel2Text);
			return textOfPannelTwoBody;        
		}catch(Exception e) {
			throw e;
		}
	}

	/** @test11
	 * about this method verifyAutoCompleteTextBoxIsPresentOrNotAndPassThevalue() 
	 * @param : Map<String, String> expectedData
	 * @description : here get the text from CollapsibleGroup pannnel body of Widget Menu of Accordion list ,
	 * @return : true
	 * @author : Yaksha
	 */
	public boolean verifyAutoCompleteTextBoxIsPresentOrNotAndPassThevalue(Map<String, String> expectedData) throws Exception {
		try {
			commonEvents.click(widgetsMenu);
			commonEvents.click(autoCompleteLink);
			if(commonEvents.isDisplayed(autoCompleteTextBox)) {
				commonEvents.sendKeys(autoCompleteTextBox,expectedData.get("autoCompleteTextBoxValue"));	
			}
			return true;
		}catch(Exception e) {
			throw e;
		}
	}


}
