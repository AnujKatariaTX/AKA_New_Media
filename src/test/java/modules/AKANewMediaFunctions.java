package modules;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageobjects.BaseClass;
//import pageobjects.AKANewMediaLocators;
import utilities.KeywordUtil;

public class AKANewMediaFunctions extends BaseClass {
	
	

	public AKANewMediaFunctions(WebDriver driver) {
		super(driver);
	}

	
	static Class thisClass = AKANewMediaFunctions.class;
	
	//Summary page Tables
	static By check = By.xpath("//p[@class='MainTitle']");
	static By list = By.xpath("//div[@id='ctl00_content_ucDonationReview_divAmount']/table/tbody/tr[3]/td/table/tbody/tr/td[2]");
	static By tablelist2 = By.xpath("//div[@id='ctl00_content_ucDonationReview_divProfile']/table/tbody/tr[2]/td/table/tbody/tr/td[2]");
	static By tablelist3 = By.xpath("//div[@id='ctl00_content_ucDonationReview_ucPayment_divPaymentCardDetails']/table/tbody/tr/td[2]");
	static By tablelist4=By.xpath("//div[@id='ctl00_content_ucDonationReview_ucTribute_pnlTribute']/div/div/table/tbody/tr/td[2]");
	static By tablelist5=By.xpath("//div[@id='ctl00_content_ucDonationReview_ucCards_pnlCards']/div/table/tbody/tr[2]/td");
	
	//Home page Elements
	static By processPaymentButton = By.id("ctl00_content_ucDonationReview_btnContinue");
	static By donateButton = By.xpath("//a[contains(@href,'/Donation/Event/DonationType')]");
	static By transactionNumber = By.xpath("//*[@id='ctl00_content_ucEnd_lblPaymentStatus']/span[2]/b[2]");
	static By transactionNumberScenario2 = By.xpath("//*[@id='ctl00_content_ucEnd_lblPaymentStatus']/span[2]/span[1]");
	static By continueInLast = By.id("ctl00_content_ucEnd_btnContinue");
	
	// Method of Payment Elements
	static By generalDonationButton = By.id("ctl00_content_ucDonationType_rbGeneral");
	static By inHonourDonationButton = By.id("ctl00_content_ucDonationType_rbInHonour");
	static By inMemoryDonationButton = By.id("ctl00_content_ucDonationType_rbInMemory");
	static By submit = By.className("FormButton");
	// General Donation Page Elements
	static By oneTimeDonationButton = By.xpath("//a[@id='ctl00_contentAmount_ucAmount_btnOneTimeDonation']");
	static By recurringDonation = By.id("ctl00_contentAmount_ucAmount_btnRepeatingDonation");
	static By donationAmount = By.xpath("//*[@id='ctl00_contentAmount_ucAmount_rdoDonationAmount']/label[5]");
	static By coverAdminFee = By.id("ctl00_contentAmount_ucAmount_chkCoverAdminFee");
	static By fundAllocationType = By.id("ctl00_contentAmount_ucAmount_radComboBoxFundType_Input");
	static By individualUserType = By.id("ctl00_contentContactInformation_ucProfile_rdoIsCompany_0");
	static By companyUserType = By.id("ctl00_contentContactInformation_ucProfile_rdoIsCompany_1");
	static By title = By.id("ctl00_contentContactInformation_ucProfile_ddlTitle");
	static By firstName = By.xpath("//*[contains(@id,'ctl00_contentContactInformation_ucProfile_txtFirstName')]");
	static By middleName = By.id("ctl00_contentContactInformation_ucProfile_txtMiddleName");
	static By lastName = By.xpath("//*[contains(@id,'ctl00_contentContactInformation_ucProfile_txtLastName')]");
	static By emailDropdownType = By.xpath("//select[@id='ctl00_contentContactInformation_ucProfile_ddlEmailType']");
	static By emailAddressText = By.id("ctl00_contentContactInformation_ucProfile_txtEmailAddress");
	static By confirmEmailAddressText = By.id("ctl00_contentContactInformation_ucProfile_txtEmailAddressRepeat");
	static By companyName = By.id("ctl00_contentContactInformation_ucProfile_txtCompanyName");
	static By addressDropdownType = By.id("ctl00_contentContactInformation_ucProfile_ddlAddressType");
	static By countryDropdown = By.id("ctl00_contentContactInformation_ucProfile_ddlCountry");
	static By addressLine1 = By.id("ctl00_contentContactInformation_ucProfile_txtAddressLine1");
	static By addressLine2 = By.id("ctl00_contentContactInformation_ucProfile_txtAddressLine2");
	static By city = By.id("ctl00_contentContactInformation_ucProfile_txtCity");
	static By stateDropdown = By.id("ctl00_contentContactInformation_ucProfile_ddlProvince");
	static By zipCode = By.id("ctl00_contentContactInformation_ucProfile_txtPostalCode");
	static By phoneDropdown = By.id("ctl00_contentContactInformation_ucProfile_ddlPhoneType");
	static By phoneNumberText = By.id("ctl00_contentContactInformation_ucProfile_txtPhone");
	static By phoneExtension = By.id("ctl00_contentContactInformation_ucProfile_txtExt");
	static By genderDropdown = By.id("ctl00_contentContactInformation_ucProfile_ddlGender");
	static By dayDropdownType = By.id("ctl00_contentContactInformation_ucProfile_dateOfBirth_lstDay");
	static By monthDropdownType = By.id("ctl00_contentContactInformation_ucProfile_dateOfBirth_lstMonth");
	static By yearDropdownType = By.id("ctl00_contentContactInformation_ucProfile_dateOfBirth_lstYear");
	static By languageDropdownType = By.id("ctl00_contentContactInformation_ucProfile_ddlPrefCorrLanguage");
	static By receiveCommunicationCheckbox = By.id("ctl00_contentContactInformation_ucProfile_chkOptOut");
	static By mailingCheckbox = By.id("ctl00_contentContactInformation_ucProfile_chkOptOutToShare");
	static By creditCardRadioButton = By.id("ctl00_contentPaymentInformation_ucPayment_rdoCreditCard");
	static By paypalRadioButton = By.id("ctl00_contentPaymentInformation_ucPayment_rdoPayPal");
	static By cardNumberText = By.xpath("//*[@id='txtCardNumber']");
	static By cardHolderName = By.xpath("//*[@aria-labelledby='lblCardHolder' and contains(@id,'ctl00_contentPaymentInformation_ucPayment_ucCardPayment_txtCardHolder')]");
	static By expirationMonthDropdownType = By.id("ctl00_contentPaymentInformation_ucPayment_ucCardPayment_ddlExpirationMonth");
	static By expirationYearDropdownType = By.id("ctl00_contentPaymentInformation_ucPayment_ucCardPayment_ddlExpirationYear");
	static By continueButton = By.id("ctl00_contentSurvey_btnContinue");
	static By previousButton = By.id("ctl00_contentSurvey_btnPrevious");
	static By editButton = By.id("ctl00_content_ucDonationReview_ucPayment_btnEdit");
	static By verifytable1 = By.xpath("//div[@id='ctl00_content_ucDonationReview_divAmount']/table/tbody/tr[3]/td/table/tbody/tr");

	// Second Scenario
	static By frequency = By.xpath("//*[@id='ctl00_contentAmount_ucAmount_ddlDonationFrequency']");
	static By month = By.xpath("//*[@id='ctl00_contentAmount_ucAmount_lstStartMonth']");
	static By day = By.id("ctl00_contentAmount_ucAmount_lstStartDay");
	static By year = By.id("ctl00_contentAmount_ucAmount_lstStartYear");
	static By numberOfTimes = By.id("ctl00_contentAmount_ucAmount_rdoSpecificNumberOfTimes");
	static By numberOfTimesText = By.id("ctl00_contentAmount_ucAmount_txtDonateCount");
	static By honourFirstName = By.id("ctl00_contentTributee_ucTributeInHonour_txtFirstName");
	static By honourlastName = By.id("ctl00_contentTributee_ucTributeInHonour_txtLastName");
	static By ecardType = By.id("ctl00_contentCardType_ucCardType_lstCardType_0");
	static By honourContinueButton = By.id("ctl00_contentCardType_ucCardType_btnContinue");
	
	static By cardFirstNAme = By.id("ctl00_content_ucCardDetail_ucECardDetail_ucRecipients_txtFirstName");
	static By cardLastNAme = By.id("ctl00_content_ucCardDetail_ucECardDetail_ucRecipients_txtLastName");
	static By cardEmailID = By.id("ctl00_content_ucCardDetail_ucECardDetail_ucRecipients_txtEmail");
	static By addButton = By.id("ctl00_content_ucCardDetail_ucECardDetail_ucRecipients_btnAddRecipient");
	static By template1 = By.id("ctl00_content_ucCardDetail_ucECardDetail_ucTemplates_repCards_ctl01_imgPreview");
	static By template1PopUp = By.xpath("//*[@id='ecard-contents']/table/tbody/tr/td[1]/img");
	static By template1Close = By.xpath("//a[@id='fancybox-close']");
	static By templateScroller = By.xpath("//*[@id='ecard_scroller']/a[2]/img");
	static By template6 = By.id("ctl00_content_ucCardDetail_ucECardDetail_ucTemplates_repCards_ctl06_rdoCard");
	static By colorDropDown = By.xpath("//*[@id='ctl00_content_ucCardDetail_ucECardDetail_ucTemplates_clrText_label']/a");
	static By selectColor = By.xpath("//*[@id='ctl00_content_ucCardDetail_ucECardDetail_ucTemplates_clrText_webPalette']/ul/li[9]/a/span");
	static By sampleMessage = By.id("ctl00_content_ucCardDetail_ucECardDetail_ucPersonalization_ddlPersonalizedMessage");
	static By textFrame = By.xpath("//body[contains(text(),'Test message 2')]");
	static By notifyOption = By.id("ctl00_content_ucCardDetail_ucECardDetail_ucOptions_chkNotifyOpened");
	static By continuebuttonStep2 = By.id("ctl00_content_ucCardDetail_btnContinue");
	static By TextMessageBody = By.xpath("/html/body");
	
	static List<String> targetList;
	static PrintStream ps;
	



	public static void navigateToTheDonationPage() throws Throwable 
	{
		KeywordUtil.click(donateButton, "Click on Donate Button");
	}

	public static void selectTheGeneralDonationType() throws Throwable {
		KeywordUtil.click(generalDonationButton, "Click on General Donation button");
		KeywordUtil.click(submit, "Click on Continue Button");
		KeywordUtil.click(oneTimeDonationButton, "Choose one Time Donation");
		KeywordUtil.delay(1000);
	}

	public static void fillInTheMandatoryFields(HashMap<String, String> dataMap) throws Throwable {

		KeywordUtil.delay(2000);
		KeywordUtil.click(donationAmount,"Select the Donation Amount");
		KeywordUtil.delay(1000);
		//KeywordUtil.click(coverAdminFee);
		
		KeywordUtil.selectByIndex(title, 1,"Select the title");
		KeywordUtil.inputTextToWebElement(firstName, dataMap.get("FirstName"),"Enter First Name");
		// KeywordUtil.inputTextToWebElement(MiddleName,"M" ,"Enter Middle Name");
		KeywordUtil.inputTextToWebElement(lastName, dataMap.get("LastName"),"Enter Last Name");
		// KeywordUtil.selectByIndex(EmailDropdownType, 2,);
		KeywordUtil.inputTextToWebElement(emailAddressText, dataMap.get("Email"),"Enter Email Address ");
		KeywordUtil.inputTextToWebElement(confirmEmailAddressText, dataMap.get("ConfirmEmail"),"Enter the Email Address Again");
		// KeywordUtil.inputTextToWebElement(CompanyName,dataMap.get("OrganizationName"));
		KeywordUtil.selectByIndex(addressDropdownType, 1,"Select the Address Dropdown");
		// KeywordUtil.selectByIndex(CountryDropdown, "Canada");
		KeywordUtil.inputTextToWebElement(addressLine1, dataMap.get("Address"),"Enter the Address in Line 1");
		KeywordUtil.inputTextToWebElement(city, dataMap.get("City"),"Enter the City Name");
		KeywordUtil.selectByVisibleText(stateDropdown, dataMap.get("State"),"Enter the State Name");
		KeywordUtil.inputText(zipCode, dataMap.get("Zip"),"Enter the Zip Code");
		KeywordUtil.inputText(cardNumberText, dataMap.get("CreditCardNumber"),"Enter the Card Number");
		KeywordUtil.inputText(cardHolderName, dataMap.get("CardHoldersName"),"Enter the Card Holder's Name");
		KeywordUtil.selectByValue(expirationMonthDropdownType, dataMap.get("ExpirationMonth"),"Enter the Expiration Month for the Card");
		KeywordUtil.selectByValue(expirationYearDropdownType, dataMap.get("ExpirationYear"),"Enter the Expiration Year for the month");
		KeywordUtil.click(continueButton,"Click on Continue button");
		KeywordUtil.delay(2000);
	}

	public static void verifyTheDetailsFilled(HashMap<String, String> dataMap) throws Throwable {
		KeywordUtil.delay(5000);
		String str = KeywordUtil.getElementText(check);
		Assert.assertEquals(str, "Review & Process Payment");

		targetList = new ArrayList<>(dataMap.values());
		Collections.sort(targetList);
		verifyZone2();
		KeywordUtil.click(editButton,"Click on Edit Button");
		KeywordUtil.delay(2000);
		KeywordUtil.inputTextToWebElement(companyName, dataMap.get("OrganizationName"),"Enter the Company Name");
		KeywordUtil.delay(1000);
		KeywordUtil.inputText(cardNumberText, dataMap.get("CreditCardNumber"),"Enter the Card Number");
		KeywordUtil.inputText(cardHolderName, dataMap.get("CardHoldersName"),"Enter the Card Holder's Name");
		KeywordUtil.selectByValue(expirationMonthDropdownType, dataMap.get("ExpirationMonth"),"Enter the Expiration Month for the Card");
		KeywordUtil.selectByValue(expirationYearDropdownType, dataMap.get("ExpirationYear"),"Enter the Expiration Year for the month");
		KeywordUtil.click(continueButton,"Click on Continue Button");
		KeywordUtil.delay(2000);
		verifyZone2();
	}

	public static void verifyTheTransactionNumber() throws Throwable {
		KeywordUtil.click(processPaymentButton,"Click on Process Payment Button");
		KeywordUtil.delay(2000);
		KeywordUtil.isWebElementVisible(transactionNumber,"Transcation number of First Scenario");
		System.out.println("Transaction Number Dispalyed as : " + KeywordUtil.getElementText(transactionNumber));
		KeywordUtil.click(continueInLast,"Click on Continue Button");
		KeywordUtil.delay(3000);

	}
	
	public static void iVerifyTheTransactionCodeIsVisible() throws Throwable {
		KeywordUtil.delay(2000);
		KeywordUtil.isWebElementVisible(transactionNumberScenario2,"Transcation number of Second Scenario");
		System.out.println("Transaction Number Dispalyed as : " + KeywordUtil.getElementText(transactionNumberScenario2));
		KeywordUtil.click(continueInLast,"Click on Continue Button");
		KeywordUtil.delay(3000);
	}

	public static void fillInTheSecondaryMandatoryFields(HashMap<String, String> dataMap) throws Exception {

		KeywordUtil.delay(2000);
		KeywordUtil.selectByValue(frequency, "MONTHLY","Select the Frequency Value ");
		KeywordUtil.click(donationAmount,"Click on Donation Amount");
		KeywordUtil.delay(2000);
		KeywordUtil.selectByIndex(month,2,"Select the Month Value");
		KeywordUtil.delay(1000);
		KeywordUtil.selectByIndex(day,1,"Select the Day Value ");
		KeywordUtil.delay(1000);
		KeywordUtil.selectByIndex(year,0,"Select the Year Value ");
		KeywordUtil.delay(2000);
		KeywordUtil.click(numberOfTimes,"Click on Number of Times To Donate Amount");
		KeywordUtil.delay(3000);
		KeywordUtil.inputTextToWebElement(numberOfTimesText,dataMap.get("NumberOfTimes"),"Enter the Number of Times the Donation to be Made");
		KeywordUtil.delay(2000);
		//KeywordUtil.pressTabKey(numberOfTimesText);
		KeywordUtil.inputText(fundAllocationType,dataMap.get("fundAllocation"),"Enter the Fund Allocation Type");
		KeywordUtil.pressTabKey(fundAllocationType);
		KeywordUtil.selectByIndex(title, 1,"Select the title");
		KeywordUtil.inputTextToWebElement(firstName, dataMap.get("FirstName"),"Enter First Name");
		// KeywordUtil.inputTextToWebElement(MiddleName,"M" ,"Enter Middle Name");
		KeywordUtil.inputTextToWebElement(lastName, dataMap.get("LastName"),"Enter Last Name");
		// KeywordUtil.selectByIndex(EmailDropdownType, 2,);
		KeywordUtil.inputTextToWebElement(emailAddressText, dataMap.get("Email"),"Enter Email Address ");
		KeywordUtil.inputTextToWebElement(confirmEmailAddressText, dataMap.get("ConfirmEmail"),"Enter the Email Address Again");
		// KeywordUtil.inputTextToWebElement(CompanyName,dataMap.get("OrganizationName"));
		KeywordUtil.selectByIndex(addressDropdownType, 1,"Select the Address Dropdown");
		// KeywordUtil.selectByIndex(CountryDropdown, "Canada");
		KeywordUtil.inputTextToWebElement(addressLine1, dataMap.get("Address"),"Enter the Address in Line 1");
		KeywordUtil.inputTextToWebElement(city, dataMap.get("City"),"Enter the City Name");
		KeywordUtil.selectByVisibleText(stateDropdown, dataMap.get("State"),"Enter the State Name");
		KeywordUtil.inputTextToWebElement(zipCode, dataMap.get("Zip"),"Enter the Zip Code");
		KeywordUtil.delay(1000);
		KeywordUtil.inputText(cardNumberText, dataMap.get("CreditCardNumber"),"Enter the Card Number");
		KeywordUtil.inputTextToWebElement(cardHolderName, dataMap.get("CardHoldersName"),"Enter the Card Holder's Name");
		KeywordUtil.selectByValue(expirationMonthDropdownType, dataMap.get("ExpirationMonth"),"Enter the Expiration Month for the Card");
		KeywordUtil.selectByValue(expirationYearDropdownType, dataMap.get("ExpirationYear"),"Enter the Expiration Year for the month");
		KeywordUtil.click(continueButton,"Click on Continue button");
		KeywordUtil.delay(2000);

	}
	
	
	public static void iVerifyTheDetails(HashMap<String, String> dataMap) throws Throwable {
		
		targetList = new ArrayList<>(dataMap.values());
		Collections.sort(targetList);
		verifyZone();
		KeywordUtil.click(processPaymentButton,"Click on Process Payment Button");
		KeywordUtil.delay(1000);
		
	}

	public static void iFillTributeInHonourPage(HashMap<String, String> dataMap) throws Throwable {
		KeywordUtil.inputText(honourFirstName, dataMap.get("HonourFirstName"),"Enter the First Name for whom the Donation is to be made");
		KeywordUtil.inputText(honourlastName, dataMap.get("HonourlastName"),"Enter the Last Name for whom the Donation is to be made");
		KeywordUtil.click(ecardType,"Click on Ecard Type");
		KeywordUtil.click(honourContinueButton,"Click on Continue Button ");

	}

	public static void iAddTheRecipients(HashMap<String, String> dataMap) throws Throwable {
		System.out.println("count of frames  " + KeywordUtil.countOfFrames());

		KeywordUtil.inputText(cardFirstNAme, dataMap.get("CardFirstNAme"),"Enter the Recepient's First Name");
		KeywordUtil.inputText(cardLastNAme, dataMap.get("CardLastNAme"),"Enter the Recepient's Last Name");
		KeywordUtil.inputText(cardEmailID, dataMap.get("CardEmailID"),"Enter the Recepient's Email");
		KeywordUtil.click(addButton,"Click on Add Button");
		KeywordUtil.click(template1,"Click on Template 1");
		KeywordUtil.delay(3000);
		KeywordUtil.clickJS(template1Close);
		//KeywordUtil.verifyDisplayAndEnable(template1PopUp,"Verify the Template Pop-Up");
		
		//KeywordUtil.click(template1Close,"Click on Close Button for the Template Pop-Up");
		KeywordUtil.delay(2000);
		KeywordUtil.click(templateScroller,"Click for Scrolling for the Templates");
		KeywordUtil.delay(2000);
		KeywordUtil.click(templateScroller,"Click for Scrolling for the Templates");
		KeywordUtil.delay(3000);
		KeywordUtil.click(template6,"Click on Template 6");
		KeywordUtil.delay(3000);
		KeywordUtil.click(colorDropDown,"Click on Color Dropdown");
		KeywordUtil.delay(3000);
		KeywordUtil.click(selectColor,"Click on Specific Color");
		KeywordUtil.selectByValue(sampleMessage, "694","Selecting the Text Message dropdown");
		KeywordUtil.delay(1000);
		KeywordUtil.switchToFrameByID(0);	
		KeywordUtil.delay(1000);
		KeywordUtil.inputAfterText(textFrame,dataMap.get("SampleMessage"), "Changing focus to Text Message Body");
		KeywordUtil.delay(2000);
		KeywordUtil.switchToDefault();
		KeywordUtil.delay(1000);
		KeywordUtil.click(notifyOption,"Click on Notify Button");
		KeywordUtil.click(continuebuttonStep2,"Click on Continue Button");

	}

	public static void tributeInHonourOption() throws Exception {
		KeywordUtil.click(inHonourDonationButton,"Click on InHonour Donation Type");
		KeywordUtil.click(submit,"Click on Continue Button");
		KeywordUtil.click(recurringDonation,"Click on Recurring Donation Type");
		KeywordUtil.delay(1000);
	}

	
	
	
	public static void verifyZone() {
		
		try{
			
			
			 ps= new PrintStream(new File("D:\\Console Outputs\\ConsoleOutput.txt"));
			 System.setOut(ps);

		}catch(Exception e){}
		
		
		String arr3[]= new String[5];
		List<WebElement> list5=KeywordUtil.getListElements(tablelist4,"Get the list of Elements from Summary page of Second Scenario-Table4" );
		
		String arr4[]= new String[5];
		List<WebElement> list6=KeywordUtil.getListElements(tablelist5,"Get the list of Elements from Summary page of Second Scenario-Table5" );
		 
		verifyZone2();

		// Fourth Table Validation

		for (int x = 0; x < list5.size(); x++) {
			arr3[x] = list5.get(x).getText();

			for (int y = 0; y < targetList.size(); y++) {
				if (arr3[x].equals(targetList.get(y))) {
					Assert.assertEquals(targetList.get(y), arr3[x]);
					System.out.println("Fourth table passed :  " + " Data From Excel ->  " + targetList.get(y) + "---- "
							+ " Data From Portal ->  " + arr3[x]);
					break;
				}
			}
		}
		
		// Fifth Table Validation

		for (int x = 1; x < list6.size(); x++) {
			arr4[x] = list6.get(x).getText();

			for (int y = 0; y < targetList.size(); y++) {
				if (arr4[x].equals(targetList.get(y))) {
					Assert.assertEquals(targetList.get(y), arr4[x]);
					System.out.println("  Fifth table passed :  " + " Data From Excel ->  " + targetList.get(y) + "---- "
							+ "  Data From Portal ->  " + arr4[x]);
						break;
				}
			}
		}
		
		
		
	}
public static void verifyZone2() {
		
		try{
			 ps= new PrintStream(new File("D:\\Console Outputs\\ConsoleOutput.txt"));
			 System.setOut(ps);

		}catch(Exception e){}
		
		String arr[] = new String[5];
		List<WebElement> list2 = KeywordUtil.getListElements(list,"Get the list of Elements from Summary page of Table1");

		String arr1[] = new String[15];
		List<WebElement> list3 = KeywordUtil.getListElements(tablelist2,"Get the list of Elements from Summary page of Table2");

		String arr2[] = new String[5];
		List<WebElement> list4 = KeywordUtil.getListElements(tablelist3,"Get the list of Elements from Summary page of Table3");

		for (int x = 0; x < list2.size(); x++) {
			arr[x] = list2.get(x).getText();

			for (int y = 0; y < targetList.size(); y++) {
				if (arr[x].equals(targetList.get(y))) {
					Assert.assertEquals(targetList.get(y), arr[x]);
					
					System.out.println(" First table passed :  " + "  Data From Excel ->  " + targetList.get(y) + "---- "
							+ " Data From Portal -> " + arr[x]);
					break;
				}
			}
		}

		// Second Table Validation
		for (int x = 0; x < list3.size(); x++) {
			arr1[x] = list3.get(x).getText();

			for (int y = 0; y < targetList.size(); y++) 
			{
				if (arr1[x].equals(targetList.get(y))) 
				{
					Assert.assertEquals(targetList.get(y), arr1[x]);
					
					System.out.println("Second table passed :" + "  Data From Excel ->  " + targetList.get(y) + "---- "
							+ " Data From Portal ->  " + arr1[x]);
					break;
				}
			}
		}

		// Third Table Validation
		for (int x = 0; x < list4.size(); x++) {
			arr2[x] = list4.get(x).getText();

			for (int y = 0; y < targetList.size(); y++) {
				if (arr2[x].equals(targetList.get(y))) {
					Assert.assertEquals(targetList.get(y), arr2[x]);
					System.out.println(" Third table passed :  " + " Data From Excel ->  " + targetList.get(y) + "---- "
							+ " Data From Portal ->  " + arr2[x]);
					break;
				}
			}
		}
}
}
