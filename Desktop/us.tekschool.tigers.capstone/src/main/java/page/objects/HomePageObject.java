package page.objects;

import java.util.List;

import javax.swing.text.Utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class HomePageObject extends Base{
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currencyButton;
	@FindBy(xpath = "//ul[@class='dropdown-menu']//li[1]")
	private WebElement currencyList;
	@FindBy(xpath = "//form//div//button[@data-toggle='dropdown']//strong")
	private WebElement euroCurrency;
	@FindBy(xpath = "//div[@id='cart']")
	private WebElement shoppingCart;  
		public void clickOnshoppingCart() {
			WebDriverUtility.clickOnElement(shoppingCart);
			
		}
	
	public void clickOnCurrencyDropdown() {
		WebDriverUtility.clickOnElement(currencyButton);
	}
	public void selectCurrencyFromDropdown() {
		List<WebElement> currencyDropdown = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		for (int i = 1; i < currencyDropdown.size(); i++) {
			WebElement currencyList = driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li["+i+"]"));
			String strCurrency = currencyList.getText();
			if(strCurrency.equalsIgnoreCase("$ US Dollar")) {
				WebDriverUtility.clickOnElement(currencyList);
			}else {
				System.out.println("Your currency was not found in the list");
			}
		}
	}
	public void verifyCurrencyEuro() {
		String actualStrEuroCurrency = euroCurrency.getText();
		String expectedStrEuroCurrency = "$";
		Assert.assertEquals(expectedStrEuroCurrency, actualStrEuroCurrency);
	}

	public boolean isShoppingCartEmptyMessageDisplayed() {
		if (shoppingCart.isDisplayed()) {
			return true;
		} else {
			return false; 
		}
	}		
}