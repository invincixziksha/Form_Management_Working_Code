package pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class DemoRegisterPages extends StartupPage 
{
	public SoftAssert softAssert;
	//WebElemet Declaration
	By switchToNavigationMenu = By.xpath("//a[contains(text() , 'SwitchTo')]"); 
	By Alerts = By.xpath("//a[contains(text() , 'Alerts')]"); 
	By ButtonToDisplayAnAlertBox = By.xpath("//button[contains(text() , 'click the button to display an  alert box:')]"); 
	By RegisterNavigationMenu = By.xpath("//a[contains(text() , 'Register')]"); 
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
	
	
	//Getting the page name
	String pageName = this.getClass().getSimpleName();
	

	//constructor Initialization
	public DemoRegisterPages(WebDriver driver) 
	{
		super(driver);
//		commonEvents.waitTillElementLocated(switchToNavigationMenu, 120)
//		.waitTillElementVisible(switchToNavigationMenu, 30);
		
//		commonEvents.waitTillElementLocated(Alerts, 120)
//		.waitTillElementVisible(Alerts, 30);

	}	
	
	
	
	//Utilization
	public DemoRegisterPages validateTitleOfHomePage() throws Exception {
		try {
			softAssert = new SoftAssert();
			
			driver.getTitle();
			String titlePagePageName = driver.getTitle();
			
			String ExpectedErrorMessage = "Register" ; 
			
			softAssert.assertEquals(titlePagePageName, ExpectedErrorMessage, 
			"entered text is not matching please check manually");	
//			
			System.out.println("Actual Title of the Current Page : " + titlePagePageName);
			System.out.println("Expected Title of the Current Page : " + ExpectedErrorMessage);
			System.out.println("User Successfully Navigate to the Register Page ");
			
			
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages clickOnswitchToNavigationMenu() throws Exception {
		try {
			 commonEvents.click(switchToNavigationMenu);
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages clickOnRegisterNavigationMenu() throws Exception {
		try {
			 commonEvents.click(RegisterNavigationMenu);
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages clickOnAlerts() throws Exception {
		try {
			 commonEvents.click(Alerts);
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages validateTitleOfAlertsPage() throws Exception {
		try {
			softAssert = new SoftAssert();
			
			driver.getTitle();
			String titlePagePageName = driver.getTitle();
			
			String ExpectedErrorMessage = "Alerts" ; 
			
			System.out.println("Actual Title of the Current Page : " + titlePagePageName);
			System.out.println("Expected Title of the Current Page : " + ExpectedErrorMessage);
			
			softAssert.assertEquals(titlePagePageName, ExpectedErrorMessage, 
			"entered text is not matching please check manually");	
			
			System.out.println("Control is navigated to new page (User Successfully Navigate to the Alerts Page) and Validate the Title of the Alerts Page ");
			Thread.sleep(5000);	
			
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages clickOnButtonToDisplayAnAlertBox() throws Exception {
		try {
			 commonEvents.click(ButtonToDisplayAnAlertBox);
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages handleAlertPopup() throws Exception {
		try {
			softAssert = new SoftAssert();
			 Alert alert = driver.switchTo().alert();
			 String actualAlertPopUpMessage =alert.getText();
			 System.out.println("Actual Alert popup Message: " + actualAlertPopUpMessage );
			 String ExpectedAlertMessage = "I am an alert box!";
			 System.out.println("Expected Alert popup massege: " + ExpectedAlertMessage );
			 softAssert.assertEquals(actualAlertPopUpMessage, ExpectedAlertMessage, 
						"Popup Message is not matching, please check manually");	
	         alert.accept(); // To accept the alert
//				 alert.dismiss(); // To dismiss the alert
	         System.out.println("alert popup is shown (Validated PopUp Message" );
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages fillRegisterForm(Map<String, String> expectedData) throws Exception {
		try {
			Thread.sleep(5000);
			commonEvents.sendKeys(firstNameTextbox,expectedData.get("firstName"));	
			commonEvents.sendKeys(lastNameTextbox,expectedData.get("lastName"));
			commonEvents.sendKeys(addressInputAreabox, "Trisulia-Cuttack, Odisha -754006");	
			commonEvents.sendKeys(emailAddressTextbox, "nayaksurya50@gmail.com");	
			commonEvents.sendKeys(phoneNumberTextbox, "9124564060");
			commonEvents.click(maleRadioButton);
			commonEvents.click(CricketCheckBox);
			commonEvents.click(MoviesCheckBox);
			commonEvents.click(HockeyCheckBox);
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
		    commonEvents.sendKeys(password, "Surya@123456");				
			commonEvents.sendKeys(confirmPassword, "Surya@123456");			
			commonEvents.click(submitButton);
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages fillAndValidateTheRegisterForm() throws Exception {
		try {
			commonEvents.sendKeys(firstNameTextbox, "Surya");	
			commonEvents.sendKeys(lastNameTextbox, "Prakash");	
			commonEvents.sendKeys(addressInputAreabox, "Trisulia-Cuttack, Odisha -754006");	
			commonEvents.sendKeys(emailAddressTextbox, "nayaksurya50@gmail.com");
			commonEvents.sendKeys(phoneNumberTextbox, "9124564060");
			commonEvents.click(maleRadioButton);
			commonEvents.click(CricketCheckBox);
			commonEvents.click(MoviesCheckBox);
			commonEvents.click(HockeyCheckBox);
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
		    commonEvents.sendKeys(password, "Surya@123456");
			commonEvents.sendKeys(confirmPassword, "Surya@123456");	
			commonEvents.clear(phoneNumberTextbox);
			commonEvents.click(submitButton);
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}

	public DemoRegisterPages clickOnSelectCountryDropdownAndSelectEachCountryOneByOne() throws Exception {
		try {
			 commonEvents.click(refreshButton); 
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
			 
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	

	public DemoRegisterPages selectEachCountryOneByOneFromCountryDrpdownAndValidate() throws Exception {
		try {
			softAssert = new SoftAssert();
			
			 commonEvents.click(refreshButton);
			 
			 commonEvents.click(clickOnCountryDropdown);
			 commonEvents.click(selectCountryAustralia);
			 
			 String getCountryNameFromCountryDropdown = commonEvents.getText(clickOnCountryDropdown);
			 System.out.println("Fetch the selected Country Name "+ getCountryNameFromCountryDropdown);
//			 Reporter.log("Fetch the selected Country Name :"+ getCountryNameFromCountryDropdown);
			 
			 String ExpectedCountryName = "Australia" ;
			 System.out.println("Expected Country Name : "+ ExpectedCountryName);
			 
			 softAssert.assertEquals(getCountryNameFromCountryDropdown, ExpectedCountryName, 
						"Selected Country is not matching, please check manually");	
			 
			 Reporter.log("Selected country Validated");
						
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
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages checkAndUncheckEachHobbyCheckBox() throws Exception {
		try {
			commonEvents.click(CricketCheckBox);
			commonEvents.click(CricketCheckBox);
			commonEvents.click(MoviesCheckBox);
			commonEvents.click(MoviesCheckBox);
			commonEvents.click(HockeyCheckBox);
			commonEvents.click(HockeyCheckBox);
			commonEvents.click(CricketCheckBox);
			commonEvents.click(MoviesCheckBox);
			commonEvents.click(HockeyCheckBox);
			
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages validateCheckBoxesRespondingCorrectllyToUserInterAction_AllowingSelectionAndDeselection() throws Exception {
		try {
			commonEvents.click(refreshButton);
			
			WebElement clickOnCricketCheckBox = driver.findElement(By.xpath("//input[@value='Cricket']"));
			WebElement clickOnMoviesCheckBox = driver.findElement(By.xpath("//input[@value='Movies']"));
			WebElement clickOnHockeyCheckBox = driver.findElement(By.xpath("//input[@value='Hockey']"));
			
			//for check the each checkboxes
			clickOnCricketCheckBox.click();
			Thread.sleep(2000);
			clickOnMoviesCheckBox.click();
			Thread.sleep(2000);
			clickOnHockeyCheckBox.click();
			Thread.sleep(2000);
			
			//for Un- check the each checkboxes
			clickOnCricketCheckBox.click();
			Thread.sleep(2000);
			clickOnMoviesCheckBox.click();
			Thread.sleep(2000);
			clickOnHockeyCheckBox.click();
			Thread.sleep(2000);
			
			 // Verify that checkboxes are initially unchecked
	        if (!clickOnCricketCheckBox.isSelected() && !clickOnMoviesCheckBox.isSelected() && !clickOnHockeyCheckBox.isSelected()) {
	            System.out.println("Checkboxes are initially unchecked.");
	        } else {
	            System.out.println("Checkboxes are not initially unchecked.");
	        }
	        Thread.sleep(2000);
	        
	        // Click on each checkbox to select it and verify that it becomes checked
	        clickOnCricketCheckBox.click();
	        if (clickOnCricketCheckBox.isSelected()) {
	            System.out.println("Cricket checkbox is selected.");
	        } else {
	            System.out.println("Cricket checkbox is not selected.");
	        }
	        Thread.sleep(2000);

	        clickOnMoviesCheckBox.click();
	        if (clickOnMoviesCheckBox.isSelected()) {
	            System.out.println("Movies checkbox is selected.");
	        } else {
	            System.out.println("Movies checkbox is not selected.");
	        }
	        Thread.sleep(2000);

	        clickOnHockeyCheckBox.click();
	        if (clickOnHockeyCheckBox.isSelected()) {
	            System.out.println("Hockey checkbox is selected.");
	        } else {
	            System.out.println("Hockey checkbox is not selected.");
	        }
	        Thread.sleep(2000);

	        // Click on each checkbox again to deselect it and verify that it becomes unchecked
	        clickOnCricketCheckBox.click();
	        if (!clickOnCricketCheckBox.isSelected()) {
	            System.out.println("Cricket checkbox is deselected.");
	        } else {
	            System.out.println("Cricket checkbox is still selected.");
	        }
	        Thread.sleep(2000);

	        clickOnMoviesCheckBox.click();
	        if (!clickOnMoviesCheckBox.isSelected()) {
	            System.out.println("Movies checkbox is deselected.");
	        } else {
	            System.out.println("Movies checkbox is still selected.");
	        }
	        Thread.sleep(2000);

	        clickOnHockeyCheckBox.click();
	        if (!clickOnHockeyCheckBox.isSelected()) {
	            System.out.println("Hockey checkbox is deselected.");
	        } else {
	            System.out.println("Hockey checkbox is still selected.");
	        }
	        Thread.sleep(2000);

			
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages selectEachRadioButton() throws Exception {
		try {
			commonEvents.click(maleRadioButton);
			Thread.sleep(2000);
			commonEvents.click(feMaleRadioButton);
			Thread.sleep(2000);
			
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages validateEachRadioButtonoptionShouldBeSelectableAttime() throws Exception {
		try {
			WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='Male']"));
			WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='FeMale']"));
			
			 	// Verify that both radio buttons are initially unchecked
	        if (!maleRadioButton.isSelected() && !femaleRadioButton.isSelected()) {
	            System.out.println("Both radio buttons are initially unchecked.");
	        } else {
	            System.out.println("Both radio buttons are not initially unchecked.");
	        }
	        
	       // Click on the male radio button
	        maleRadioButton.click();

	        // Verify that the male radio button is selected and the female is not
	        if (maleRadioButton.isSelected() && !femaleRadioButton.isSelected()) {
	            System.out.println("Male radio button is selected and Female radio button is not selected.");
	        } else {
	            System.out.println("Male radio button is not selected or Female radio button is selected.");
	        }

	        // Click on the female radio button
	        femaleRadioButton.click();

	        // Verify that the female radio button is selected and the male is not
	        if (femaleRadioButton.isSelected() && !maleRadioButton.isSelected()) {
	            System.out.println("Female radio button is selected and Male radio button is not selected.");
	        } else {
	            System.out.println("Female radio button is not selected or Male radio button is selected.");
	        }

			
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages validatePasswordFieldForScenarioOneBySendingDifferentValues(String data) throws Exception {
		try {
			commonEvents.clear(password);	
			commonEvents.clear(confirmPassword);	
			
			commonEvents.sendKeys(password,data);
			commonEvents.sendKeys(confirmPassword,data);
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages validatePasswordFieldForScenarioTwoBySendingDifferentValues(String data1, String data2) throws Exception {
		try {
			commonEvents.clear(password);	
			commonEvents.clear(confirmPassword);	
			
			commonEvents.sendKeys(password,data1);
			commonEvents.sendKeys(confirmPassword,data2);
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages validatePasswordFieldForScenarioThreeBySendingDifferentValues(String data) throws Exception {
		try {
			commonEvents.clear(password);	
			commonEvents.clear(confirmPassword);	
			
			commonEvents.sendKeys(password,data);
			commonEvents.sendKeys(confirmPassword,data);
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages selectYearMonthDate() throws Exception {
		try {
			
			WebElement selectYeardropdown = driver.findElement(By.xpath("//select[@placeholder='Year']"));
			Select select3 = new Select(selectYeardropdown);
			select3.selectByValue("1950");
			Thread.sleep(2000);
			select3.selectByValue("1960");
			Thread.sleep(2000);
			select3.selectByValue("1970");
			Thread.sleep(2000);
			select3.selectByValue("1980");
			Thread.sleep(2000);
			select3.selectByValue("1990");
			Thread.sleep(2000);
			select3.selectByValue("2000");
			Thread.sleep(2000);
			select3.selectByValue("1996");
			Thread.sleep(2000);
	
			
			WebElement selectMonthdropdown = driver.findElement(By.xpath("//select[@placeholder='Month']"));
			Select select4 = new Select(selectMonthdropdown);
			select4.selectByVisibleText("June");
			Thread.sleep(2000);
			select4.selectByVisibleText("August");
			Thread.sleep(2000);
			select4.selectByVisibleText("November");
			Thread.sleep(2000);
			select4.selectByVisibleText("March");
			Thread.sleep(2000);
			select4.selectByVisibleText("October");
			Thread.sleep(2000);
			select4.selectByVisibleText("May");
			Thread.sleep(2000);
			select4.selectByVisibleText("December");
			Thread.sleep(2000);
			select4.selectByVisibleText("April");
			Thread.sleep(2000);
			select4.selectByVisibleText("January");
			Thread.sleep(2000);
			select4.selectByVisibleText("July");
			Thread.sleep(2000);
			select4.selectByVisibleText("September");
			Thread.sleep(2000);
			select4.selectByVisibleText("February");
			Thread.sleep(2000);
			
			
			WebElement selectDatedropdown = driver.findElement(By.xpath("//select[@placeholder='Day']"));
			Select select5 = new Select(selectDatedropdown);
		    select5.selectByValue("25");	
		    Thread.sleep(2000);
		    select5.selectByValue("20");	
		    Thread.sleep(2000);
		    select5.selectByValue("5");	
		    Thread.sleep(2000);
		    select5.selectByValue("1");	
		    Thread.sleep(2000);
		    select5.selectByValue("9");	
		    Thread.sleep(2000);
		    select5.selectByValue("10");	
		    Thread.sleep(2000);
		    select5.selectByValue("29");	
		    Thread.sleep(2000);
		    select5.selectByValue("14");	
		    Thread.sleep(2000);
			
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages validateAccurateSelectableYearMonthDate() throws Exception {
		try {
			
			softAssert = new SoftAssert();
			
			WebElement selectYeardropdown = driver.findElement(By.xpath("//select[@placeholder='Year']"));
			Select selectYear = new Select(selectYeardropdown);
			selectYear.selectByValue("1950");
			Thread.sleep(2000);
			
			String ExpectedYear = "1950";
			softAssert.assertEquals(selectYear.getFirstSelectedOption().getText(), ExpectedYear, 
					"Selected Year is not matching please check manually");	
			
			System.out.println("Actual Selected Year : " + selectYear.getFirstSelectedOption().getText());
			System.out.println("Expected Year : " + ExpectedYear);
			System.out.println("Selected Year are captured accurately. ");
			Thread.sleep(5000);	
			
			
			WebElement selectMonthdropdown = driver.findElement(By.xpath("//select[@placeholder='Month']"));
			Select selectMonth = new Select(selectMonthdropdown);
			selectMonth.selectByVisibleText("June");
			Thread.sleep(2000);
			
			String ExpectedMonth = "June";
			softAssert.assertEquals(selectMonth.getFirstSelectedOption().getText(), ExpectedMonth, 
					"Selected Month is not matching please check manually");	
			
			System.out.println("Actual Selected Month : " + selectMonth.getFirstSelectedOption().getText());
			System.out.println("Expected Month : " + ExpectedMonth);
			System.out.println("Selected Month are captured accurately. ");
			Thread.sleep(5000);	
			
			WebElement selectDatedropdown = driver.findElement(By.xpath("//select[@placeholder='Day']"));
			Select selectDate = new Select(selectDatedropdown);
			selectDate.selectByValue("25");	
			Thread.sleep(2000);
			
			String ExpectedDate = "25";
			softAssert.assertEquals(selectDate.getFirstSelectedOption().getText(), ExpectedDate, 
					"Selected Date is not matching please check manually");	
			
			System.out.println("Actual Selected Date : " + selectDate.getFirstSelectedOption().getText());
			System.out.println("Expected Date : " + ExpectedDate);
			System.out.println("Selected Date  are captured accurately. ");
			Thread.sleep(5000);	
			
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public DemoRegisterPages clickOnChooseFilUploadButton() throws Exception {
		try {
			 commonEvents.click(chooseFile);
			 Thread.sleep(2000);
			 
			 StringSelection filePath = new StringSelection("D:\\AUTOMATION PROJECT FRAMEWORK\\Document\\invincixLogo.png");
				Thread.sleep(2000);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
				
				Robot robot = new Robot();
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_V);
				Thread.sleep(2000);
				robot.keyRelease(KeyEvent.VK_CONTROL);
				robot.keyRelease(KeyEvent.VK_V);
				
				robot.keyPress(KeyEvent.VK_TAB);
				Thread.sleep(2000);
				robot.keyPress(KeyEvent.VK_TAB);
				Thread.sleep(2000);
				robot.keyRelease(KeyEvent.VK_TAB);
				
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				
				commonEvents.getTagName(chooseFile);
				System.out.println("Choose file TagName :" + commonEvents.getTagName(chooseFile) );
				
				String uploadImageName = commonEvents.getText(chooseFile);
				System.out.println("Choose file TextName :" + uploadImageName );
				
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	
	public String getUploadImageName() throws Exception {
		try {
//			softAssert = new SoftAssert();
//			System.out.println("Uploaded Image Name : " + commonEvents.getText(uploadImageFileName));
//			
//			String ExpectedUploadedImageName = "invincixLogo.png";
//			softAssert.assertEquals(commonEvents.getText(uploadImageFileName), ExpectedUploadedImageName, 
//					"Selected Date is not matching please check manually");	
			softAssert = new SoftAssert();
			WebElement actualUploadedImageElement = driver.findElement(By.xpath("//input[@id='imagesrc']"));
			String actualUploadedImageText = actualUploadedImageElement.getText();
			System.out.println("Actual upload Image Name : " + actualUploadedImageText );
			
			String ExpectedUploadedImageName = "invincixLogo.png";
			System.out.println("Expected upload Image Name : " + ExpectedUploadedImageName );
			
			softAssert.assertEquals(actualUploadedImageText, ExpectedUploadedImageName, 
					"Selected Date is not matching please check manually");	
			
		}catch(Exception e) {
			throw e;
		}
		return pageName;
	}
	
	public DemoRegisterPages validateMandetoryField() throws Exception {
		try {
			// Create an instance of Actions class
            //Actions actions = new Actions(driver);
            
         // Perform mouse hover action on the field
            WebElement phoneNumberTextbox = driver.findElement(By.xpath("//input[@type='tel']"));
            
           // actions.moveToElement(phoneNumberTextbox).perform();
            
         // Locate the tooltip message element and capture the text
//            WebElement elementWithTooltip = driver.findElement(By.className("tooltip"));
//            String ErrorMessageText = tooltip.getText();
            String tooltipText = phoneNumberTextbox.getAttribute("title");
            System.out.println("Error message: " + tooltipText);
            
            
		}catch(Exception e) {
			throw e;
		}
		return new DemoRegisterPages(driver);
	}
	

}
