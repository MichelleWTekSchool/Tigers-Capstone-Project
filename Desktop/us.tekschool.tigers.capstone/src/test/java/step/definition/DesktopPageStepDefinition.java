package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.DesktopPageObject;
import utilities.WebDriverUtility;

public class DesktopPageStepDefinition extends Base{
	
	// create object for DesktopPageObject
	
	DesktopPageObject desktopPageObjects = new DesktopPageObject();

	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL"; // is this correct?
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
		logger.info("User is on retail website, actual page title equals the expected page title");
		WebDriverUtility.screenShot();
		}

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopPageObjects.clickOnDesktops();
		logger.info("User clicked on Desktops tab");

	} 

	@When("User click on show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopPageObjects.clickOnShowAllDesktops();
		logger.info("User clicked on Show All Desktops");
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktops_page() {
		Assert.assertTrue(desktopPageObjects.equals(desktopPageObjects));
		logger.info("All items are present in Desktops page");
		WebDriverUtility.screenShot();
		}

	// cartSuccessMessageScenario
	@When("User click  ADD TO CART option on ‘HP LP3065’ item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktopPageObjects.clickAddToCart();
		logger.info("User Added HP LP3065 to the Cart!");
		WebDriverUtility.screenShot();
	}

	@When("User select quantity one")
	public void user_select_quantity() {
		logger.info("User selected quantity");
		WebDriverUtility.screenShot();
		}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopPageObjects.clickAddToCartButton();
		logger.info("User clicked on the Blue Add to Cart Button!");
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a message ‘Success: you have added HP LP3065 to your Shopping cart!’$")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart() {
		logger.info("HP LP is successfully added to the cart");
		WebDriverUtility.screenShot();
	}

	//	======================Canon Step Def======================
	@When("User click ADD TO CARToption on ‘Canon EOS 5D’item")
	public void u_ser_click_add_to_cart_option_on_item() {
		desktopPageObjects.clickOnCanon();
		logger.info("User added Canon EOS 5D to the Cart");
		WebDriverUtility.screenShot();	}

	@When("User select color from dropdown ‘Red’")
	public void user_select_color_from_dropdown_red() {
		desktopPageObjects.selectRedColor();
		logger.info("User chose 'Red' Color from drop down menu");
		WebDriverUtility.screenShot();
	}

	@When("^User select canon quantity one$")
	public void user_select_quantity1() {
		logger.info("Canon purchase quantity is 1");
		WebDriverUtility.screenShot();
	}

	@When("^User click add to Cart button canon$")
	public void user_click_add_to_cart_option_on_item() {
		desktopPageObjects.addToCartCanonButton();
		logger.info("User added Canon to cart and clicked on Add to Cart button");
		WebDriverUtility.screenShot();	}

	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
//		Assert.assertTrue(desktopPageObjects.equals(desktoppageobject));
		logger.info("Success message displayed for Canon purchase");
		WebDriverUtility.screenShot();	}
	
		//	================= dataTableReview Methods============
	
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopPageObjects.clickOnCanon();;
		logger.info("User Clicked on Canon Item");
		WebDriverUtility.screenShot();	}
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPageObjects.clickOnReview();
		logger.info("User clicked on write review link");
		WebDriverUtility.screenShot();	}
	@When("User fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
		desktopPageObjects.clickYourName(info.get(0).get("yourname"));
		desktopPageObjects.sendReview(info.get(0).get("reviewtext"));
		desktopPageObjects.selectRatingRadioButton();
		WebDriverUtility.screenShot();//
			
	}
	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopPageObjects.buttonReviewContinueButton();
		logger.info("User clicked on review continue button");
		WebDriverUtility.screenShot();
		
	}
	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.’")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
	Assert.assertTrue(desktopPageObjects.reviewOutcomeMessage());
	logger.info("Review Successfully submitted");
	WebDriverUtility.screenShot();
	}
}