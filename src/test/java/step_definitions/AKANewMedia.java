package step_definitions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import modules.AKANewMediaFunctions;
//import pageobjects.AKANewMediaLocators;
import utilities.ExcelDataUtil;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class AKANewMedia extends KeywordUtil {
	protected List<String[]> errLogs = new ArrayList<>();
	static boolean isRun;
	static boolean check = true;
	static boolean status = true;
	static String expected = "NA";
	static String actual = "NA";
	static String logStep;
	static int rows = 0;


	@SuppressWarnings("rawtypes")
	static Class thisClass = AKANewMedia.class;
	static String testCaseID = thisClass.getSimpleName();

	public WebDriver driver;
	public static HashMap<String, String> dataMap = new HashMap<String, String>();

	@Given("^Read \"([^\"]*)\" from Excel file$")
	public void read_from_Excel_file(String arg1) throws Throwable {

		try {
			
			dataMap = ExcelDataUtil.getTestDataWithTestCaseID("AKANewMedia_TestData", arg1);
			
		} catch (Exception e) {
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Given("^Open AKA New Meia website$")
	public void open_AKA_New_Meia_website() throws Throwable {
		navigateToUrl(GlobalUtil.getCommonSettings().getUrl());
	}

	@When("^Navigate to the Donation page$")
	public void navigate_to_the_Donation_page() throws Throwable 
	{
		try{
		AKANewMediaFunctions.navigateToTheDonationPage();
		}
		catch (Exception e) {
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
		
	}

	@When("^Select the General donation type$")
	public void select_the_General_donation_type() throws Throwable 
	{
		try{
		AKANewMediaFunctions.selectTheGeneralDonationType();
		}
		catch (Exception e) {
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@When("^Fill in the mandatory fields$")
	public void fill_in_the_mandatory_fields() throws Throwable 
	{
		try{
		AKANewMediaFunctions.fillInTheMandatoryFields(dataMap);
		}
		catch (Exception e) {
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Then("^Verify the details filled$")
	public void verify_the_details_filled() throws Throwable
	{
		try{
		AKANewMediaFunctions.verifyTheDetailsFilled(dataMap);
		}
		catch (Exception e) {
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Then("^Verify the transaction number$")
	public void verify_the_transaction_number() throws Throwable 
	{
		try{
		AKANewMediaFunctions.verifyTheTransactionNumber();
		}
		catch (Exception e) {
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

}
