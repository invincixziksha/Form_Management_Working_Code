

package testcases;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import coreUtilities.testutils.ApiHelper;
import coreUtilities.utils.FileOperations;
import pages.FormManagement_L2_Pages;
import pages.StartupPage;
import testBase.AppTestBase;
import testdata.LocatorsFactory;

public class FormManagement_L2_Testcases extends AppTestBase {

	Map<String, String> configData;
	Map<String, String> loginCredentials;
	String expectedDataFilePath = testDataFilePath+"expected_data.json";
	StartupPage startupPage;
	FormManagement_L2_Pages RegisterPageInstance;
	LocatorsFactory LocatorsFactoryInstance = new LocatorsFactory(driver);


	@Parameters({"browser", "environment"})
	@BeforeClass(alwaysRun = true)
	public void initBrowser(String browser, String environment) throws Exception {
		configData = new FileOperations().readJson(config_filePath, environment);
		configData.put("url", configData.get("url").replaceAll("[\\\\]", ""));
		configData.put("browser", browser);

		boolean isValidUrl = new ApiHelper().isValidUrl(configData.get("url"));
		Assert.assertTrue(isValidUrl, configData.get("url")+" might be Server down at this moment. Please try after sometime.");
		initialize(configData);
		startupPage = new StartupPage(driver);
	}

	@Test(priority = 1, groups = {"sanity"}, description="Go to home, then click on Sign-In button and validate the title of the Sign-In page")
	public void goTohomeThenClickOnSignInButtOnValidateTitleOfTheSignInPage() throws Exception {
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "LoginPage_Title");
		Assert.assertEquals(RegisterPageInstance.goTohomeThenClickOnSignInButtOnValidateTitleOfTheSignInPage(), expectedData.get("pageTitle"));
		Assert.assertTrue(LocatorsFactoryInstance.emailTextFieldIsPresent(driver).isDisplayed(), "Email text field is not present in the current page, Please check manually");
	}	

	@Test(priority = 2, groups = {"sanity"}, description="go back to index page and click on Skip signIn button and validate the Register page title.")
	public void goBackToIndexPageclickonSkipSignInButtonAndValidateTheRegisterPageTitle() throws Exception {
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "HomePage_Title");
		Assert.assertEquals(RegisterPageInstance.goBackToIndexPageclickonSkipSignInButtonAndValidateTheRegisterPageTitle(), expectedData.get("pageTitle"));
		Assert.assertTrue(LocatorsFactoryInstance.firstNameTextboxIsPresent(driver).isDisplayed(), "First name text field is not present in the current page, Please check manually");
	}	

	@Test(priority = 3, groups = {"sanity"}, description="Then fill the register form and click on Refresh button")
	public void thenFillTheRegisterFormAndClickOnRefreshButton() throws Exception {
		softAssert = new SoftAssert();		
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "userdetails");
		Assert.assertTrue(RegisterPageInstance.thenFillTheRegisterFormAndClickOnRefreshButton(expectedData), "Register button is not present, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.firstNameTextboxIsPresent(driver).isDisplayed(), "first name text field is not present in the current page, Please check manually");

	}	

	@Test(priority = 4, groups = {"sanity"}, description="Verify that clicking on refresh button its refreshing all the entered data in all the fields")
	public void VerifyThatClickingOnRefreshButtonItsRefreshingAllTheEnteredDataInAllTheFields() throws Exception {
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		Map<String, String> expectedData1 = new FileOperations().readJson(expectedDataFilePath, "userdetails");
		RegisterPageInstance.fillTheForms(expectedData1);
		//		Assert.assertTrue(RegisterPageInstance.VerifyThatClickingOnRefreshButtonItsRefreshingAllTheEnteredDataInAllTheFields(), "Any of the elememt is not empty, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.refreshButton(driver).isDisplayed(), "login button is not present in the current page, Please check manually");
	}  

	@Test(priority = 5, groups = {"sanity"}, description="Go to SwitchTo Tab clickOn Window and then click on Click and validate the title of new tab page")
	public void verifyTitleOfNewTab() throws Exception {
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "newTab_Title");
		Assert.assertEquals(RegisterPageInstance.verifyTitleOfNewTab(), expectedData.get("pageTitle"));
		Assert.assertTrue(LocatorsFactoryInstance.logoIcon(driver).isDisplayed(), "logo IconLink WebElement is not present in the current page, Please check manually");
	}

	@Test(priority = 6, groups = {"sanity"}, description="Go to SwitchTo Tab clickOn Window and then click on Open new separate window and click and validate the title of new windows page")
	public void verifyTitleOfNewWindows() throws Exception {
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "newWindow_Title");
		Assert.assertEquals(RegisterPageInstance.verifyTitleOfNewWindows(), expectedData.get("pageTitle"));
		Assert.assertTrue(LocatorsFactoryInstance.logoIcon(driver).isDisplayed(), "logo IconLink WebElement is not present in the current page, Please check manually");
	}

	@Test(priority = 7, groups = {"sanity"}, description="Go to SwitchTo Tab clickOn Window and then click on Open separate multiple window and click")
	public void verifyTitleOfMultipleWindows() throws Exception {
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "newMultipleWindow_Title");
		Assert.assertEquals(RegisterPageInstance.verifyTitleOfMultipleWindows(), expectedData.get("pageTitle"));
		Assert.assertTrue(LocatorsFactoryInstance.logoIcon(driver).isDisplayed(), "logo IconLink WebElement is not present in the current page, Please check manually");
	}

	@Test(priority = 8, groups = {"sanity"}, description="Go to Interaction clickOn Drag and Drop and click on static validate the title of the Drag and Drop page.")
	public void gotoInteractionTabclickOnDragandDropThenClickOnStaticThenValidateTitleOfThePage() throws Exception {
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		String expectedDataFilePath = testDataFilePath+"expected_data.json";
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "DragAndDropPage_Title");
		Assert.assertEquals(RegisterPageInstance.gotoInteractionTabclickOnDragandDropThenClickOnStaticThenValidateTitleOfThePage(), expectedData.get("pageTitle"));
		Assert.assertTrue(LocatorsFactoryInstance.getswitchToNavigationMenu(driver).isDisplayed(), "Switch to navigate menu  is not present in the current page, Please check manually");
	}	
	@Test(priority = 9, groups = {"sanity"}, description="Select the selenium logo and perform Drag and Drop operation")
	public void selecttheSeleniumLogoAndPerformDragAndDropOperation() throws Exception {
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		Assert.assertTrue(RegisterPageInstance.selecttheSeleniumLogoAndPerformDragAndDropOperation(), "Drag and drop failed, please check manually");	
		Assert.assertTrue(LocatorsFactoryInstance.getswitchToNavigationMenu(driver).isDisplayed(), "Switch to navigate menu is not present in the current page, Please check manually");
	}	


	@Test(priority = 10, groups = {"sanity"}, description="Go to Widget Tab clickOn Accordio and Select Any Groups And Fetch the Data")
	public void verifyTextofAnyToggleActionInsideOfAccordionListMenu() throws Exception {
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "PannelMessage");
		Assert.assertTrue(RegisterPageInstance.verifyTextofAnyToggleActionInsideOfAccordionListMenu().contains(expectedData.get("PanneBodyTwoMessage")), "Error message is not matching, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.CollapsibleGroup3(driver).isDisplayed(), "CollapsibleGroup3 is not present in the current page, Please check manually");
	}

	@Test(priority = 11, groups = {"sanity"}, description="Go to Widget Tab clickOn Auto complete and verify the auto complete textbox is present or not then pass the value")
	public void verifyAutoCompleteTextBoxIsPresentOrNotAndPassThevalue() throws Exception {
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		Map<String, String> expectedData1 = new FileOperations().readJson(expectedDataFilePath, "autoCompleteTextBox");
		Assert.assertTrue(RegisterPageInstance.verifyAutoCompleteTextBoxIsPresentOrNotAndPassThevalue(expectedData1), "Auto complet elememt is not present, please check manually");
		Assert.assertTrue(LocatorsFactoryInstance.autoCompleteTextBox(driver).isDisplayed(), "autoCompleteTextBox is not present in the current page, Please check manually");
	}


	@AfterClass(alwaysRun = true)
	public void tearDown() {
		System.out.println("before closing the browser");
		browserTearDown();
	}

	@AfterMethod
	public void retryIfTestFails() throws Exception {
		startupPage.navigateToUrl(configData.get("url"));
	}
}
