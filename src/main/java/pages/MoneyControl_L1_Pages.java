package pages;


import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class MoneyControl_L1_Pages extends StartupPage 
{
	public SoftAssert softAssert;
	/*
	 * WebElemet Declaration
	 */	


	/*
	 * Getting the page name
	 */	
	String pageName = this.getClass().getSimpleName();


	/*
	 * constructor Initialization
	 */	
	public MoneyControl_L1_Pages(WebDriver driver) 
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
}