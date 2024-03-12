

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

public class FormManagement_L2_Testcases extends AppTestBase {
	
	Map<String, String> configData;
	Map<String, String> loginCredentials;
	String expectedDataFilePath = testDataFilePath+"expected_data.json";
	StartupPage startupPage;
	FormManagement_L2_Pages RegisterPageInstance;
	
	
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
	
	@Test(priority = 1, groups = {"sanity"}, description="Go to SwitchTo Tab clickOn Window and then click on Click")
	public void switchToWindow() throws Exception {
		softAssert = new SoftAssert();		
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		//Note the below todo and method validateTheLoginPage() has to be implemented by the implementor
		softAssert.assertEquals("todo", RegisterPageInstance.goToSwitchToTabCliOnWindowThenClickOnTab());
	}	
	
	@Test(priority = 2, groups = {"sanity"}, description="Go to SwitchTo Tab clickOn Window and then click on Open new separate window and click")
	public void goToSwitchToWindowClickOnOpenNewSeparateWindowAndClick() throws Exception {
		softAssert = new SoftAssert();		
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		//Note the below todo and method validateTheLoginPage() has to be implemented by the implementor
		softAssert.assertEquals("todo", RegisterPageInstance.goToSwitchToWindowClickOnOpenNewSeparateWindowAndClick());
	}	
	
	@Test(priority = 3, groups = {"sanity"}, description="Go to SwitchTo Tab clickOn Window and then click on Open separate multiple window and click")
	public void goToSwitchToWindowClickOnOpenSeparateMultipleWindowAndClick() throws Exception {
		softAssert = new SoftAssert();		
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		//Note the below todo and method validateTheLoginPage() has to be implemented by the implementor
		softAssert.assertEquals("todo", RegisterPageInstance.goToSwitchToWindowClickOnOpenSeparateMultipleWindowAndClick());
	}	
	
	@Test(priority = 4, groups = {"sanity"}, description="Go to SwitchTo Tab clickOn Frame and then pass the value in textbox")
	public void goToSwitchToFrameClickOnClickOnSingleFrameAndPassTheValueInTextbox() throws Exception {
		softAssert = new SoftAssert();		
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		//Note the below todo and method validateTheLoginPage() has to be implemented by the implementor
		softAssert.assertEquals("todo", RegisterPageInstance.goToSwitchToFrameClickOnClickOnSingleFrameAndPassTheValueInTextbox());
	}	
	
	@Test(priority = 5, groups = {"sanity"}, description="Go to SwitchTo Tab clickOn Frame, then clickOn iframeWithANIframe and then pass the value in textbox")
	public void goToSwitchToFrameClickOnClickOniframeWithAnIframeAndPassTheValueInTextbox() throws Exception {
		softAssert = new SoftAssert();		
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		//Note the below todo and method validateTheLoginPage() has to be implemented by the implementor
		softAssert.assertEquals("todo", RegisterPageInstance.goToSwitchToFrameClickOnClickOniframeWithAnIframeAndPassTheValueInTextbox());
	}	
	
	@Test(priority = 6, groups = {"sanity"}, description="Go to Widget Tab clickOn Accordio and Select Any Groups And Fetch the Data")
	public void goToWidgetsTabclickOnAccordioSelectAnyGroupsAndFetchData() throws Exception {
		softAssert = new SoftAssert();		
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		//Note the below todo and method validateTheLoginPage() has to be implemented by the implementor
		softAssert.assertEquals("todo", RegisterPageInstance.goToWidgetsTabclickOnAccordioSelectAnyGroupsAndFetchData());
	}	
	
	@Test(priority = 7, groups = {"sanity"}, description="Go to Widget Tab clickOn Auto complete and pass the value")
	public void goToWidgetsTabclickOnAUtoCompleteAndPassValue() throws Exception {
		softAssert = new SoftAssert();		
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		//Note the below todo and method validateTheLoginPage() has to be implemented by the implementor
		softAssert.assertEquals("todo", RegisterPageInstance.goToWidgetsTabclickOnAUtoCompleteAndPassValue());
	}
	
	@Test(priority = 8, groups = {"sanity"}, description="Go to Widget Tab clickOn slider and perform Maximize and Minimize action")
	public void goToWidgetsTabclickOnSliderAndPerformMaximizeMinimize() throws Exception {
		softAssert = new SoftAssert();		
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		//Note the below todo and method validateTheLoginPage() has to be implemented by the implementor
		softAssert.assertEquals("todo", RegisterPageInstance.goToWidgetsTabclickOnSliderAndPerformMaximizeMinimize());
	}	
	
	@Test(priority = 9, groups = {"sanity"}, description="Go to Interaction Tab clickOn Drag and drop then click on static and perform DragAndDrop Action ")
	public void goToInterActionTabclickOnDragAndDropClickOnStaticAndPerfomDragAndDropAction() throws Exception {
		softAssert = new SoftAssert();		
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		//Note the below todo and method validateTheLoginPage() has to be implemented by the implementor
		softAssert.assertEquals("todo", RegisterPageInstance.goToInterActionTabclickOnDragAndDropClickOnStaticAndPerfomDragAndDropAction());
	}	
	
	@Test(priority = 10, groups = {"sanity"}, description="Go to Interaction Tab clickOn Drag and drop then click on dynamic and perform DragAndDrop Action")
	public void goToInterActionTabclickOnDragAndDropClickOnDynamicAndPerfomDragAndDropAction() throws Exception {
		softAssert = new SoftAssert();		
		RegisterPageInstance = new FormManagement_L2_Pages(driver);
		//Note the below todo and method validateTheLoginPage() has to be implemented by the implementor
		softAssert.assertEquals("todo", RegisterPageInstance.goToInterActionTabclickOnDragAndDropClickOnDynamicAndPerfomDragAndDropAction());
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
