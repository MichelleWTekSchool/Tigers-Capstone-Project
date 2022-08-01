package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;

public class HomePageStepDefinition extends Base {
	
	HomePageObject homePage = new HomePageObject ();
	
	@When ("User click on Currency")
	public void user_click_on_currency( ) {
		homePage.clickOnCurrencyDropdown();
		logger.info("Currency dropdown was clicked successfully");
	}
	
	@When ("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.selectCurrencyFromDropdown();
		logger.info("Currency was selected successfully");
		
	}
	
	@Then ("currency value should change to Euro")
	public void currency_value_should_change_to_euro () {
		homePage.verifyCurrencyEuro();
		logger.info("Currency is validated successfully");
		
	}
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart(){
		homePage.clickOnshoppingCart();
		logger.info("user clicked on shopping cart");
	}
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		Assert.assertTrue(homePage.isShoppingCartEmptyMessageDisplayed());
		logger.info("Shopping Cart empty message is displayed");
	}
}
