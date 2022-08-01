package page.objects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class RetailPageObject extends Base {

	private static final CharSequence MichelleW = null;

//	private static final WebElement editAffiliateUserInformation = null;

	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement clickOnAccount;

	public void clickOnAccount() {
		clickOnAccount.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement clickOnLogin;

	public void clickOnLogin() {
		clickOnLogin.click();
	}

	@FindBy(xpath = "//2022schoolwork@gmail.com']")
	private WebElement emailAddress;

	public void emailAddress() {
		emailAddress.sendKeys("2022schoolwork@gmail.com");
	}

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password;

	public void password() {
		password.sendKeys("Cleagirl123");
	}

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;

	public void loginButton() {
		loginButton.click();
	}

	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerAffiliateAccount;

	public void registerAffiliateAccount() {
		registerAffiliateAccount.click();
	}

	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement company;

	public void company() {
		company.clear();
		company.sendKeys("TekSchool");
	}

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement website;

	public void website() {
		website.clear();
		website.sendKeys("www.facebook.com");
	}

	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxID;

	public void taxID() {
		taxID.clear();
	}

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement paymentMethod;

	public void paymentMethod() {
		paymentMethod.click();
	}

	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement chequePayeeName;

	public void chequePayeeName() {
		chequePayeeName.clear();
		chequePayeeName.sendKeys("Homeira");
	}

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueButton;

	public void continueButton() {
		continueButton.click();
	}

	@FindBy(xpath = "//a[text()= 'Edit your affiliate information']")
	private WebElement editAffiliateInformation;

	public void editAffiliateInformation() {
		editAffiliateInformation.click();
	}

	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransfareRadioButton;

	public void bankTransfareRadioButton() {
		bankTransfareRadioButton.click();
	}

	@FindBy(xpath = "//input[@name='bank_name']")
	private WebElement bankName;

	public void bankName(String bank) {
		bankName.clear();
		bankName.sendKeys("BOA");

	}

	@FindBy(xpath = "//input[@name='bank_branch_number']")
	private WebElement abaNumber;

	public void abaNumber(String accountNumber) {
		abaNumber.click();

	}

	@FindBy(xpath = "//input[@name='bank_swift_code']")
	private WebElement swiftCode;

	public void swiftCode(String sCode) {
		swiftCode.click();

	}

	@FindBy(xpath = "//input[@name='bank_account_name']")
	private WebElement accountName;

	public void accountName(String acctName) {
		accountName.click();
	}

	@FindBy(xpath = "//input[@name='bank_account_number']")
	private WebElement accountNumber;

	public void bankAccountNumberAffiliate(String acctNumber) {

	}

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButtonAffiliate;

	public void continueButtonAffiliate() {
		continueButtonAffiliate.click();
	}

	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement editYourAccountInformation;

	public void editYourAccountInformation() {
		editYourAccountInformation.click();
	}

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstName;

	public void firstName(String ftName) {
		firstName.clear();
	}

	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;

	public void lastName(String ltName) {
		lastName.clear();
	}

	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;

	public void email(String aemail) {
		email.clear();
	}

	@FindBy(xpath = "//input[@name='telephone']")
	private WebElement telephone;

	public void telephone(String ttelephone) {
		telephone.clear();
		WebDriverUtility.enterValue(telephone, ttelephone);
	}

	@FindBy(xpath = "//input[@id='input-cheque']")
	private WebElement ChequePayeeNameTextBox;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement agreeCheckBox;

	public void clickAgreeCheckBox() {
		agreeCheckBox.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButtonAffiliateUser;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageAffiliateUserCreated;

	public void verifyAffiliateAccSuccessMessage() {
		String expectedMssg = "Success: Your account has been successfully updated.";
		String actualMessage = successMessageAffiliateUserCreated.getText();
		try {
			Assert.assertEquals(expectedMssg, actualMessage);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FindBy(xpath = "//a[text()='Edit Account']")
	private WebElement editAccountInformationLink;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement inputFirstName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement inputLastName;
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement inputEmail;
	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement inputTelePhone;
	@FindBy(xpath = "//*[@id='account-account']/div[1]")
	private WebElement successMessageEditAccountInfo;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButtonEditAccount;
	private WebElement paymentMethodRadioButtonPayPal;
	private WebElement inputPayPalEmailAccount;
	private WebElement inputBranchNumber;
	private WebElement inputSWIFTCode;

	private WebElement inputAccountNumber;
	private WebElement inputAccountName;
	private WebElement inputBankName;
	private WebElement login;
	private WebElement myAccountText;

	public void clickOnMyAccount() {
		clickOnAccount.click();
	}

	public void clickOnLogin1() {
		login.click();
	}

	public void enterEmailAndPassword(String emailValue, String passwordValue) {
		email.sendKeys(emailValue);
		password.sendKeys(passwordValue);

	}

	public void clickOnLoginButton() {
		loginButton.click();

	}

	public boolean myAccountTextIsPresent() {
		if (myAccountText.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	public void continueButtonEditAccount() {
		continueButtonEditAccount.click();
	}
	// ==================== Affiliate User Methods ================

	public void clickOnRegisterAsAffiliateAccountLink() {
		registerAffiliateAccount.click();
	}

	public void enterCompanyName(String companyName) {
		company.sendKeys(companyName);
	}

	public void enterwebsite(String websiteName) {
		website.sendKeys(websiteName);
	}

	public void enterTaxID(String tax) {
		taxID.sendKeys("223344");
	}

	public void selectPaymentMethod(String paymentmethod) {
		ChequePayeeNameTextBox.sendKeys(paymentmethod);
	}

	public void clickOnContinueButtonAffiliateUser() {
		continueButtonAffiliateUser.click();
	}

	public boolean successMessageAffiliateUserCreatedIsDisplayed() {
		if (successMessageAffiliateUserCreated.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

	// ============== edit affiliate methods=========
	public void clickOnEditAffiliateInformatinLink() {
		editAffiliateInformation.click();
	}

	public void selectPaymentMethodBankTransfer() {
		if (paymentMethodRadioButtonPayPal.isDisplayed()) {
			paymentMethodRadioButtonPayPal.click();

		}
	}

	public void enterBankInformation(String bankName, String abaNumber, String swiftCode, String accountName,
			String accountNumber) {

		WebDriverUtility.scrollToElementAction(accountName);

		if (inputBankName.isDisplayed() && inputBankName.isEnabled()) {
			inputBankName.clear();
			inputBankName.sendKeys(bankName);
		}
		inputBranchNumber.clear();
		inputBranchNumber.sendKeys(abaNumber);
		inputSWIFTCode.clear();
		inputSWIFTCode.sendKeys(swiftCode);
		inputAccountName.clear();
		inputAccountName.click();
		inputAccountName.sendKeys(accountName);

		inputAccountNumber.click();
		inputAccountNumber.clear();
		inputAccountNumber.sendKeys(accountNumber);
	}

	// next two methods in this scenario are repeated.

//		=============== edit account info methods ====== 
	public void clickOnEditAccountInfoLink() {
		editAccountInformationLink.click();
	}

	public void editFirstName(String firstName) throws InterruptedException {
		Thread.sleep(1000);
		inputFirstName.click();
		Thread.sleep(1000);
		inputFirstName.clear();
		Thread.sleep(1000);
		inputFirstName.sendKeys(firstName);
	}
	public void editLastName(String lastName) throws InterruptedException {
		Thread.sleep(1000);
		inputLastName.click();
		Thread.sleep(1000);
		inputLastName.clear();
		Thread.sleep(1000);
		inputLastName.sendKeys(lastName);
	}
	public void editEmail(String email) throws InterruptedException {
		Thread.sleep(1000);
		inputEmail.click();
		Thread.sleep(1000);
		inputEmail.clear();
		Thread.sleep(1000);
		inputEmail.sendKeys(email);
	}
	public void editTelephone(String telePhone) throws InterruptedException {
		Thread.sleep(1000);
		inputTelePhone.clear();
		Thread.sleep(1000);
		inputTelePhone.sendKeys(telePhone);
		Thread.sleep(1000);
	}

	// clickOnContinueButtonMethod is already present. same xpath

	public boolean isEditAccountInfoSuccessMessagePresent() {
		// String actualSuccessMessage = successMessageEditAccountInfo.getText();
		// String expectedSuccessMessage = " Success: Your account has been successfully
		// updated.";
		// if (actualSuccessMessage.equals(expectedSuccessMessage)) {
		// return true;
		// } else {
		// return false;
		// }
		if (successMessageEditAccountInfo.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}
}
