package step.definition;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LoginPageObjects;
import utilities.WebDriverUtility;

public class LoginSteps extends Base {

	LoginPageObjects login = new LoginPageObjects();
	LoginPageObjects loginPageObj = new LoginPageObjects();

	@Given("user is on test environment homepage")
	public void user_is_on_test_environment_homepage() {

		String actualPageTitle = loginPageObj.getPageTitle();
		System.out.println(actualPageTitle);
		logger.info("Retail page is opened");
	}

	@When("user click on myaccount button")
	public void user_click_on_myaccount_button() {
		loginPageObj.clickOnMyAccountButton();
		logger.info("User click on My Account");
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		loginPageObj.clickOnLoginButton();
		logger.info("User click on Login");
		WebDriverUtility.wait(3000);
		WebDriverUtility.screenShot();
	}

	@Then("user enter username and password")
	public void user_enter_username_and_password() {
		loginPageObj.enterUserName();
		logger.info("User enter email address");
		loginPageObj.enterPassword();
		logger.info("User enter password");
		WebDriverUtility.screenShot();
	}

	@Then("user click on login button to login to the page")
	public void user_click_on_login_button_to_login_to_the_page() {
		loginPageObj.clickOnLoginButtonMain();
		logger.info("User click on Login button");
	}

	@Then("user enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) {
		loginPageObj.enterUserNameWithParam(string);
		loginPageObj.enterPasswordWithParam(string2);
	}

}
