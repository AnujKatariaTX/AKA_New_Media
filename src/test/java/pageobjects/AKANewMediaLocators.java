//package pageobjects;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.openqa.selenium.support.ui.Select;
//
//import cucumber.api.java.eo.Se;
//import utilities.GlobalUtil;
//import utilities.KeywordUtil;
//
//public class AKANewMediaLocators extends BaseClass
//{
//	
//	public AKANewMediaLocators(WebDriver driver) 
//	{
//		super(driver);
//	}
//
//
//	// Homepage Elements
//	 public static By DonateButton= By.xpath("//a[contains(@href,'/Donation/Event/DonationType')]");
//	
//	// Method of Payment Elements
//	 static By GeneralDonationButton= By.id("ctl00_content_ucDonationType_rbGeneral");
//	 static By InHonourDonationButton= By.id("ctl00_content_ucDonationType_rbInHonour");
//	 static By InMemoryDonationButton= By.id("ctl00_content_ucDonationType_rbInMemory");
//	 static By Submit= By.className("FormButton");
//	
//	
//	// General Donation Page Elements
//	 static By OneTimeDonationButton= By.id("ctl00_contentAmount_ucAmount_btnOneTimeDonation");
//	 static By RecurringDonation= By.id("ctl00_contentAmount_ucAmount_btnRepeatingDonation");
//	 static By DonationAmount= By.xpath("//*[@id='ctl00_contentAmount_ucAmount_rdoDonationAmount']/label[5]");
//	 static By CoverAdminFee= By.id("ctl00_contentAmount_ucAmount_chkCoverAdminFee");
//	 static By FundAllocationType= By.id("ctl00_contentAmount_ucAmount_radComboBoxFundType_Input");
//	 static By IndividualUserType= By.id("ctl00_contentContactInformation_ucProfile_rdoIsCompany_0");
//	 static By CompanyUserType= By.id("ctl00_contentContactInformation_ucProfile_rdoIsCompany_1");
//	 static By Title= By.id("ctl00_contentContactInformation_ucProfile_ddlTitle");
//	 static By FirstName= By.xpath("//*[contains(@id,'ctl00_contentContactInformation_ucProfile_txtFirstName')]");
//	 static By LastName= By.xpath("//*[contains(@id,'ctl00_contentContactInformation_ucProfile_txtLastName')]");
//	 static By EmailDropdownType= By.id("ctl00_contentContactInformation_ucProfile_ddlEmailType");
//	 static By EmailAddressText= By.id("ctl00_contentContactInformation_ucProfile_txtEmailAddress");
//	 static By ConfirmEmailAddressText= By.id("ctl00_contentContactInformation_ucProfile_txtEmailAddressRepeat");
//	 static By CompanyName= By.id("ctl00_contentContactInformation_ucProfile_txtCompanyName");
//	 static By AddressDropdownType= By.id("ctl00_contentContactInformation_ucProfile_ddlAddressType");
//	 static By CountryDropdown= By.id("ctl00_contentContactInformation_ucProfile_ddlCountry");
//	 static By AddressLine1= By.id("ctl00_contentContactInformation_ucProfile_txtAddressLine1");
//	 static By AddressLine2= By.id("ctl00_contentContactInformation_ucProfile_txtAddressLine2");
//	 static By City= By.id("ctl00_contentContactInformation_ucProfile_txtCity");
//	 static By StateDropdown= By.id("ctl00_contentContactInformation_ucProfile_ddlProvince");
//	 static By ZipCode= By.id("ctl00_contentContactInformation_ucProfile_txtPostalCode");
//	 static By PhoneDropdown= By.id("ctl00_contentContactInformation_ucProfile_ddlPhoneType");
//	 static By PhoneNumberText= By.id("ctl00_contentContactInformation_ucProfile_txtPhone");
//	 static By PhoneExtension= By.id("ctl00_contentContactInformation_ucProfile_txtExt");
//	 static By GenderDropdown= By.id("ctl00_contentContactInformation_ucProfile_ddlGender");
//	 static By DayDropdownType= By.id("ctl00_contentContactInformation_ucProfile_dateOfBirth_lstDay");
//	 static By MonthDropdownType= By.id("ctl00_contentContactInformation_ucProfile_dateOfBirth_lstMonth");
//	 static By YearDropdownType= By.id("ctl00_contentContactInformation_ucProfile_dateOfBirth_lstYear");
//	 static By LanguageDropdownType= By.id("ctl00_contentContactInformation_ucProfile_ddlPrefCorrLanguage");
//	 static By ReceiveCommunicationCheckbox= By.id("ctl00_contentContactInformation_ucProfile_chkOptOut");
//	 static By MailingCheckbox= By.id("ctl00_contentContactInformation_ucProfile_chkOptOutToShare");
//	 static By CreditCardRadioButton= By.id("ctl00_contentPaymentInformation_ucPayment_rdoCreditCard");
//	 static By PaypalRadioButton= By.id("ctl00_contentPaymentInformation_ucPayment_rdoPayPal");
//	 static By CardNumberText= By.xpath("//*[@id='txtCardNumber']");
//	 static By CardHolderName= By.xpath("//*[@aria-labelledby='lblCardHolder' and contains(@id,'ctl00_contentPaymentInformation_ucPayment_ucCardPayment_txtCardHolder')]");
//	 static By ExpirationMonthDropdownType= By.id("ctl00_contentPaymentInformation_ucPayment_ucCardPayment_ddlExpirationMonth");
//	 static By ExpirationYearDropdownType= By.id("ctl00_contentPaymentInformation_ucPayment_ucCardPayment_ddlExpirationYear");
//	 static By ContinueButton= By.id("ctl00_contentSurvey_btnContinue");
//	 static By PreviousButton= By.id("ctl00_contentSurvey_btnPrevious");
//		
//}
