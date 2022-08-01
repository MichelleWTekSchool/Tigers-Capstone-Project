package stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.DesktopsPageObject;
import utilities.WebDriverUtility;

public class DesktopsStepDef extends Base {
	DesktopsPageObject desktopPage = new DesktopsPageObject();
	//syntax("exact words of step from scenario)
	//public void nameOfTheMethod() { }
	
	@When ("User click on Desktops tab")
	//Underscore is an option too: public void user_click_on_Desktops_tab() {
	public void userClickOnDesktopsTab() {
		WebDriverUtility.hardWait();
		desktopPage.clickonDesktopsTab();
		logger.info("user clicked on Desktops tab");
		WebDriverUtility.takeScreenShot();//there already is a screenshot option in Utility
		
	}
	
	@And ("User clicked on Show all desktops")
	public void userCLickOnShowAllDesktops() {
		WebDriverUtility.hardWait();
		desktopPage.clickOnShowAllDesktops();
		logger.info("User clicked on Show all desktops");
		
	}
	
	@Then("User should see all items are present in Desktop page")
	public void UserShouldSeeAllItemsArePresentInDesktopPage() {
		List<WebElement> desktopsElements = desktopPage.desktopsItems();
		for(WebElement element: desktopsElements ) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title") + "is present");//this came from website what was unique xpath
		}
		
		WebDriverUtility.takeScreenShot();
		WebDriverUtility.hardWait();
		
		/*
		//*Step 1 store element in list
		//*Step 2 Iterate through the list
		//*step 3 We need to writwe an assertion to 
		//validate each element (index) is present
		//
		*/
	}
		@When ("User click ADD TO CART option on HP LP3065 item")
		public void user_click_add_to_cart_option_on_hp_lp3065item() {
			desktopPage.clickOnHPLP3065Item();
			logger.info("user clicked Add to Cart Option");
		}
		
		@When ("User select quantity {string}")
		public void user_select_quantity(String string) {	
			desktopPage.selectQuantity(string);
			logger.info("User selected quantity " + string);
		
		}
		
		@When("User click add to Cart button")
		public void user_click_add_to_cart_button() {
			desktopPage.clickOnAddToCartButton();
			logger.info("User clicked add to cart button");
		}
		
		@Then("User should see a message {string}") 
		public void user_should_see_a_message(String expectedSuccessMessage) {
			Assert.assertEquals(desktopPage.successMessage(),expectedSuccessMessage);
			Assert.assertTrue(desktopPage.isSuccessMessagePresent());
			logger.info(expectedSuccessMessage + " equals to " + desktopPage.successMessage());
			WebDriverUtility.takeScreenShot();
			WebDriverUtility.hardWait();
}
		
		
		@When("User click on Canon EOS 5D item")
		public void user_click_on_canon_eos_5d_item() {
		desktopPage.clickOnCanonEOS5DCamera();
		}
		
		@When("User click on write a review link")
		public void user_click_on_write_a_review_link() {
		desktopPage.clickOnReviewLink();
		}
		
		@When("User fill the review information with below information")
		public void user_fill_the_review_information_with_the_below_information(DataTable dataTable) {
		List<Map<String, String>> reviewInformation = dataTable.asMaps(String.class, String.class);
		desktopPage.enterYourName(reviewInformation.get(0).get("yourName"));
		desktopPage.enterYourReview(reviewInformation.get(0).get("yourReview"));
		desktopPage.selectRating(reviewInformation.get(0).get("Rating"));
		WebDriverUtility.hardWait();
		}
		
		@When("User click on Continue Button")
		public void user_click_on_continue_button() {
		desktopPage.clickOnContinueButton();
		
		}

		@Then("User should see a message with {string}")
		public void user_shouls_see_a_Message_with_(String string) {
		System.out.println(desktopPage.reviewText() +" from print" );
}
}













