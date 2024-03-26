package pages;


import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class FormManagement_L1_Pages extends StartupPage 
{
	public SoftAssert softAssert;
	/*
	 * WebElemet Declaration
	 */	
	By pageTitleText = By.xpath("//title[contains(text() , 'Register')]"); 
	By switchToNavigationMenu = By.xpath("//a[contains(text() , 'SwitchTo')]"); 
	By alertPopup = By.xpath("//a[contains(text() , 'Alerts')]"); 
	By buttonToDisplayAnAlertBox = By.xpath("//button[contains(text() , 'click the button to display an  alert box:')]"); 
	By registerNavigationMenu = By.xpath("//a[contains(text() , 'Register')]"); 
	By firstNameTextbox = By.xpath("//input[@placeholder='First Name']"); 
	By lastNameTextbox = By.xpath("//input[@placeholder='Last Name']"); 
	By addressInputAreabox = By.xpath("//textarea[@ng-model='Adress']"); 
	By emailAddressTextbox = By.xpath("//input[@type='email']"); 
	By phoneNumberTextbox = By.xpath("//input[@type='tel']"); 
	By maleRadioButton = By.xpath("//input[@value='Male']"); 
	By feMaleRadioButton = By.xpath("//input[@value='FeMale']"); 
	By cricketCheckBox = By.xpath("//input[@value='Cricket']"); 
	By moviesCheckBox = By.xpath("//input[@value='Movies']"); 
	By hockeyCheckBox = By.xpath("//input[@value='Hockey']"); 
	By languageDropdown = By.xpath("//div[@id='msdd']"); 
	By selectEnglish = By.xpath("//a[contains(text(), 'English')]"); 
	By selectHindi = By.xpath("//a[contains(text(), 'Hindi')]"); 
	By skillsDropdown = By.xpath("//select[@id='Skills']"); 
	By countryDropdown = By.xpath("//select[@id='countries']"); 
	By clickOnCountryDropdown = By.xpath("//span[@role='combobox']"); 
	By selectCountryAustralia = By.xpath("//li[contains(text(), 'Australia')]"); 
	By selectCountryBangladesh = By.xpath("//li[contains(text(), 'Bangladesh')]"); 
	By selectCountryDenmark = By.xpath("//li[contains(text(), 'Denmark')]"); 
	By selectCountryHongKong = By.xpath("//li[contains(text(), 'Hong Kong')]"); 
	By selectCountryIndia = By.xpath("//li[contains(text(), 'India')]"); 
	By selectCountryJapan = By.xpath("//li[contains(text(), 'Japan')]"); 
	By selectCountryNetherlands = By.xpath("//li[contains(text(), 'Netherlands')]"); 
	By selectCountryNewZealand = By.xpath("//li[contains(text(), 'New Zealand')]"); 
	By selectCountrySouthAfrica = By.xpath("//li[contains(text(), 'South Africa')]"); 
	By selectCountryUnitedStatesOfAmerica = By.xpath("//li[contains(text(), 'United States of America')]"); 
	By selectYear = By.xpath("//select[@placeholder='Year']");
	By selectMonth = By.xpath("//select[@placeholder='Month']"); 
	By selectDate = By.xpath("//select[@placeholder='Day']"); 
	By password = By.xpath("//input[@id='firstpassword']");
	By confirmPassword = By.xpath("//input[@id='secondpassword']");
	By submitButton = By.xpath("//button[@id='submitbtn']");
	By refreshButton = By.xpath("//button[@value='Refresh']");
	By chooseFile = By.xpath("//input[@id='imagesrc']/..");
	By uploadImageFileName = By.xpath("//input[@id='imagesrc']");




	/*
	 * Getting the page name
	 */	
	String pageName = this.getClass().getSimpleName();


	/*
	 * constructor Initialization
	 */	
	public FormManagement_L1_Pages(WebDriver driver) 
	{
		super(driver);
	}	


	/**@Test1
	 * about this method validateTitleOfHomePage() 
	 * @param : null
	 * @description : get the title of the home page and validate
	 * @return : String
	 * @author : Yaksha
	 */
	public String validateTitleOfHomePage() throws Exception {
		String titleOfTheHomePage = "";
		try {
			titleOfTheHomePage = commonEvents.getTitle();
			System.out.println("Title of the HomePage:"+titleOfTheHomePage);
		}catch(Exception e) {
			throw e;
		}	
		return titleOfTheHomePage;
	}
	/**@Test2
	 * about this method clickOnSwitchToAlertandValidateTitlePage() 
	 * @param : null
	 * @description : click on the switch to alert and validate the title of this page
	 * @return : String
	 * @author : Yaksha
	 */
	public String  clickOnSwitchToAlertandValidateTitlePage() throws Exception {
		String titleOfThePage = "";
		try {
			commonEvents.click(switchToNavigationMenu);
			commonEvents.click(alertPopup);
			titleOfThePage = commonEvents.getTitle();
			System.out.println("Title of the alert page:"+titleOfThePage);
		}catch(Exception e) {
			throw e;
		}
		return titleOfThePage;
	}

	/**@Test3
	 * about this method handleAlertsPopupValidateAnAlertsPopup() 
	 * @param : null
	 * @description : click on the ButtonToDisplayAnAlertBox then control switch in to alert popup and get the alert message and validate
	 * @return : String
	 * @author : Yaksha
	 */

	public String handleAlertsPopupValidateAnAlertsPopup() throws Exception {
		String alertPopUpMessage = "";
		try {
			commonEvents.click(buttonToDisplayAnAlertBox);
			Alert alert = driver.switchTo().alert();
			Thread.sleep(5000);
			alertPopUpMessage =alert.getText();
			System.out.println("Alert popup Message: " + alertPopUpMessage );
			driver.switchTo().alert().accept();
		}catch(Exception e) {
			throw e;
		}
		return alertPopUpMessage;
	}

	/**@Test4
	 * about this method clickOnRegisterLinkandFillTheForms() 
	 * @param : Map<String, String>
	 * @description : Click on the register and fill data in all fields
	 * @return : boolean
	 * @author : Yaksha
	 */

	public boolean clickOnRegisterLinkandFillTheForms(Map<String, String> expectedData) throws Exception {
		Boolean isFilled = false;
		try {
			commonEvents.click(registerNavigationMenu);
			commonEvents.sendKeys(firstNameTextbox,expectedData.get("firstName"));	
			commonEvents.sendKeys(lastNameTextbox,expectedData.get("lastName"));	
			commonEvents.sendKeys(addressInputAreabox,expectedData.get("adds"));	
			commonEvents.sendKeys(emailAddressTextbox,expectedData.get("emaiI"));	
			commonEvents.sendKeys(phoneNumberTextbox,expectedData.get("phoneNo"));
			Thread.sleep(4000);
			commonEvents.click(maleRadioButton);
			commonEvents.click(cricketCheckBox);
			commonEvents.click(moviesCheckBox);
			commonEvents.click(hockeyCheckBox);
			commonEvents.click(languageDropdown);
			commonEvents.click(selectEnglish);
			commonEvents.click(selectHindi);
			commonEvents.selectByVisibleText(skillsDropdown, "Java");
			commonEvents.selectByVisibleText(countryDropdown, "Select Country");
			commonEvents.click(clickOnCountryDropdown);
			commonEvents.click(selectCountryIndia);
			commonEvents.selectByValue(selectYear, "1996");
			commonEvents.selectByVisibleText(selectMonth, "June");
			commonEvents.selectByValue(selectDate, "25");  
			commonEvents.sendKeys(password,expectedData.get("password"));
			commonEvents.sendKeys(confirmPassword,expectedData.get("confirmPassword"));	

			if(commonEvents.getAttribute(firstNameTextbox, "value").equals(expectedData.get("firstName"))) {
				isFilled = true;
			}
		}catch(Exception e) {
			throw e;
		}
		return isFilled; 
	}
	/**@Test5
	 * about this method clickOnSelectCountryAndSelectEachCountry() 
	 * @param : null
	 * @description : refresh the page and click and country drop down and select all the country from the drop down
	 * @return : boolean
	 * @author : Yaksha
	 */

	public boolean clickOnSelectCountryAndSelectEachCountry() throws Exception {
		Boolean isFilled = false;
		try {
			commonEvents.refreshPage();
			Thread.sleep(3000);
			commonEvents.click(clickOnCountryDropdown);
			commonEvents.click(selectCountryAustralia); 

			commonEvents.click(clickOnCountryDropdown);
			commonEvents.click(selectCountryBangladesh); 

			commonEvents.click(clickOnCountryDropdown);
			commonEvents.click(selectCountryDenmark);

			commonEvents.click(clickOnCountryDropdown);
			commonEvents.click(selectCountryHongKong);

			commonEvents.click(clickOnCountryDropdown);
			commonEvents.click(selectCountryIndia);

			commonEvents.click(clickOnCountryDropdown);
			commonEvents.click(selectCountryJapan);

			commonEvents.click(clickOnCountryDropdown);
			commonEvents.click(selectCountryNetherlands);

			commonEvents.click(clickOnCountryDropdown);
			commonEvents.click(selectCountryNewZealand);

			commonEvents.click(clickOnCountryDropdown);
			commonEvents.click(selectCountrySouthAfrica);

			commonEvents.click(clickOnCountryDropdown);
			commonEvents.click(selectCountryUnitedStatesOfAmerica); 

			if(commonEvents.isDisplayed(clickOnCountryDropdown)) {
				isFilled = true;
			}
		}catch(Exception e) {
			throw e;
		}
		return isFilled;
	}
	/**@Test6
	 * about this method selectEachCountryOneByOneFromCountryDrpdownAndValidate() 
	 * @param : null
	 * @description : refresh the page and click on country dropdown then select Australia and get the value and validate it 
	 * @return : String
	 * @author : Yaksha
	 */

	public String selectAustraliaInCountryDrpdownAndValidate() throws Exception {
		String getCountryNameFromCountryDropdown = "";
		try {			
			commonEvents.click(refreshButton);			 
			commonEvents.click(clickOnCountryDropdown);
			commonEvents.click(selectCountryAustralia);		 
			getCountryNameFromCountryDropdown = commonEvents.getText(clickOnCountryDropdown);
			System.out.println("Fetch the selected Country Name "+ getCountryNameFromCountryDropdown);	
		}catch(Exception e) {
			throw e;
		}
		return getCountryNameFromCountryDropdown;
	}
	/**@Test7
	 * about this method checkUncheckCheckBoxAndValidateThatCheckBox() 
	 * @param : null
	 * @description : check all the check boxes and validate hockey check box is selected or not
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean checkUncheckCheckBoxAndValidateThatCheckBox() throws Exception {
		Boolean isHockeyCheckBoxSelected =false;
		try {
			commonEvents.click(cricketCheckBox);
			commonEvents.click(cricketCheckBox);
			commonEvents.click(moviesCheckBox);
			commonEvents.click(moviesCheckBox);
			commonEvents.click(hockeyCheckBox);
			commonEvents.click(hockeyCheckBox);
			commonEvents.click(cricketCheckBox);
			commonEvents.click(moviesCheckBox);
			commonEvents.click(hockeyCheckBox);
			WebElement clickOnHockeyCheckBox = commonEvents.findElement(hockeyCheckBox);
			if(clickOnHockeyCheckBox.isSelected()) {
				isHockeyCheckBoxSelected = true;
			}

		}catch(Exception e) {
			throw e;
		}
		return isHockeyCheckBoxSelected;
	}

	/**@Test8
	 * about this method selecteachRadioButtonvalidateEachRadioButtonoptionShouldBeSelectableAttime() 
	 * @param : null
	 * @description :  select each Radio Button validate Each Radio Button option Should Be selectable At time
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean selectRadioButtonvalidateRadioButtonOptionIsSelectable() throws Exception {
		Boolean isFemaleRadioButtonSelected =false;
		try {
			commonEvents.click(maleRadioButton);
			WebElement maleRadioButtonWebElement = commonEvents.findElement(maleRadioButton);
			maleRadioButtonWebElement.isSelected();
			Thread.sleep(2000);
			commonEvents.click(feMaleRadioButton);
			WebElement femaleRadioButtonWebElement = commonEvents.findElement(feMaleRadioButton);
			if(femaleRadioButtonWebElement.isSelected()) {
				isFemaleRadioButtonSelected = true;
			}
			Thread.sleep(2000);

		}catch(Exception e) {
			throw e;
		}
		return isFemaleRadioButtonSelected;
	}

	/**@Test9
	 * about this method selectYearMonthDate() 
	 * @param : null
	 * @description : select year,month and date in the dropdown using select class
	 * @return : return true if select year dropdown is present, else false
	 * @author : Yaksha
	 */

	public boolean selectYearMonthDate() throws Exception {
		Boolean isYeardropdownSelected =false;
		try {

			WebElement selectYeardropdown = commonEvents.findElement(selectYear);
			Select selectYear = new Select(selectYeardropdown);
			selectYear.selectByValue("1996");
			selectYeardropdown.isSelected();
			WebElement selectMonthdropdown = commonEvents.findElement(selectMonth);
			Select selectMonth = new Select(selectMonthdropdown);
			selectMonth.selectByVisibleText("June");
			selectMonthdropdown.isSelected();
			WebElement selectDatedropdown = commonEvents.findElement(selectDate);
			Select selectDate = new Select(selectDatedropdown);
			selectDate.selectByValue("25");	
			if(selectDatedropdown.isDisplayed()&& selectMonthdropdown.isDisplayed() &&   selectYeardropdown.isDisplayed()) {
				isYeardropdownSelected = true;
			}
		}catch(Exception e) {
			throw e;
		}
		return isYeardropdownSelected;
	}

	/**@Test10
	 * about this method clickOnChooseFilUploadButtonAndUploadImage() 
	 * @param : String
	 * @description : click on choose file button and upload the image
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean clickOnChooseFilUploadButtonAndUploadImage(String pathOfTheFile) throws Exception {
		boolean isUploaded = false;
		try {
			Thread.sleep(5000);
			commonEvents.sendKeys(uploadImageFileName, pathOfTheFile);
			Thread.sleep(8000); //waiting for the image to display by name
			isUploaded = true;
		}catch(Exception e) {
			throw e;
		}
		return isUploaded;
	}


	/**@Test11
	 * about this method filltheDetailsAndClickOnTheSubmitButton() 
	 * @param : Map<String, String>
	 * @description :click on the register and fill first name text field,lastNameTextbox,,emailAddressTextbox and then click on submit button
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean filltheDetailsAndClickOnTheSubmitButton(Map<String, String> expectedData) throws Exception {
		Boolean isFilled = false;
		try {
			commonEvents.click(registerNavigationMenu);
			commonEvents.sendKeys(firstNameTextbox,expectedData.get("firstName"));	
			commonEvents.sendKeys(lastNameTextbox,expectedData.get("lastName"));	
			commonEvents.sendKeys(addressInputAreabox,expectedData.get("adds"));	
			commonEvents.sendKeys(emailAddressTextbox,expectedData.get("emaiI"));
			Thread.sleep(5000);
			commonEvents.jsClick(submitButton);
			if(commonEvents.getAttribute(firstNameTextbox, "value").equals(expectedData.get("firstName"))) {
				isFilled = true;
			}

		}catch(Exception e) {
			throw e;
		}
		return isFilled;
	}

}