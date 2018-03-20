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
import utilities.ExcelDataUtil;
import utilities.GlobalUtil;
import utilities.KeywordUtil;

public class AKANewMedia_Scenario2 extends KeywordUtil {

	protected List<String[]> errLogs = new ArrayList<>();
	static boolean isRun;
	static boolean check = true;
	static boolean status = true;
	static String expected = "NA";
	static String actual = "NA";
	static String logStep;
	static int rows = 0;

	@SuppressWarnings("rawtypes")
	static Class thisClass = AKANewMedia_Scenario2.class;
	static String testCaseID = thisClass.getSimpleName();

	public WebDriver driver;
	public static HashMap<String, String> dataMap = new HashMap<String, String>();

	@Given("^Read \"([^\"]*)\" from second Excel file$")
	public void read_from_second_Excel_file(String arg1) throws Throwable {
		try {
			dataMap = ExcelDataUtil.getTestDataWithTestCaseID("AKANewMedia_TestData2", arg1);
		} catch (Exception e) {
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	@Given("^I open akaraisin website$")
	public void i_open_akaraisin_website() throws Throwable 
	{
		navigateToUrl(GlobalUtil.getCommonSettings().getUrl());
	}

	@When("^I click on donate now button$")
	public void i_click_on_donate_now_button() throws Throwable 
	{
		try
		{
			AKANewMediaFunctions.navigateToTheDonationPage();
		}
		 catch (Exception e) {
				GlobalUtil.ErrorMsg = e.getMessage();
				Assert.fail(e.getMessage());
			}

	}

	@When("^I select the tribute in honour option and continue$")
	public void i_select_the_tribute_in_honour_option_and_continue() throws Throwable {
		try
		{
		AKANewMediaFunctions.tributeInHonourOption();
		}
		catch (Exception e) {
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@When("^I fill the mandatory details in the prompt$")
	public void i_fill_the_mandatory_details_in_the_prompt() throws Throwable {
		try
		{
		AKANewMediaFunctions.fillInTheSecondaryMandatoryFields(dataMap);
		}
		catch (Exception e) {
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@When("^I fill tribute in-honour page$")
	public void i_fill_tribute_in_honour_page() throws Throwable {
		try
		{
		AKANewMediaFunctions.iFillTributeInHonourPage(dataMap);
		}
		catch (Exception e) {
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@When("^I add the receipients$")
	public void i_add_the_receipients() throws Throwable {
		try
		{
		AKANewMediaFunctions.iAddTheRecipients(dataMap);
		}
		catch (Exception e) {
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}

	}

	@Then("^I verify the details$")
	public void i_verify_the_details() throws Throwable {
		try
		{
		AKANewMediaFunctions.iVerifyTheDetails(dataMap);
		}
		catch (Exception e) {
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
		
	}

	@Then("^I verify the transaction code is visible$")
	public void i_verify_the_transaction_code_is_visible() throws Throwable {
		try
		{
		AKANewMediaFunctions.iVerifyTheTransactionCodeIsVisible();
		}
		catch (Exception e) {
			GlobalUtil.ErrorMsg = e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

}
