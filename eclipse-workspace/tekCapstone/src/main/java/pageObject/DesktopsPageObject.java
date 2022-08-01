package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;
//import utilities.webElement;

public class DesktopsPageObject extends Base {
	
	public DesktopsPageObject() {
		PageFactory.initElements(driver, this);
		
	}
	
	//syntax for storing UI Element in POM class using page factory implementation
	//@Findby(locatorType="Locator")
	//AccessModifier WebElemengt NameofElement
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showallDesktops;
	
	@FindBy(tagName = "img")
	private List <WebElement> items; //driver.FindElements
	
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement hpLP3065;
	
	@FindBy(id = "input-quantity")
	private WebElement quantityInput;
	
	@FindBy(id = "button-cart")
	private WebElement addToCartButton;
	
	@FindBy (xpath = "(//a[text()='HP LP3065'])[3]") //concat method inspect options
	private WebElement HPLPsuccessmessage;
	
	// left off here
	@FindBy (xpath = "(//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DCamera;
	
	@FindBy(xpath = "//a[text()='write a review']")
	private WebElement writeReviewLink;
	
	@FindBy (id = "input-name")
	private WebElement yourNameField;
	
	@FindBy (id = "input-review")
	private WebElement yourReviewField;
	
	@FindBy (xpath = "//input[@type='radio']")
	private List <WebElement> Rating;
	
	@FindBy(id = "button-review")
	private WebElement ReviewContinueButton;
	
	@FindBy(xpath = "//*[@id=\"form-review\"]/div[2]/text()")
	private String reviewSubmissionMessage;
	
	
	public void clickonDesktopsTab() {
		WebDriverUtility.moveToElement(desktops);
		
	}
	//scenario1
	public void clickOnShowAllDesktops() {
		showallDesktops.click();
		
	}
	
	public List<WebElement> desktopsItems() {
		List<WebElement> itemsDesk = items;
		return itemsDesk;
		
	}
	//scenario2
	
	public void clickOnHPLP3065Item() {
		hpLP3065.click();
	}
	
	public void selectQuantity(String quantityValue) {
		quantityInput.clear();
		quantityInput.sendKeys(quantityValue);
		
	}
	
	public void clickOnAddToCartButton() { //this method will click on add to cart bttn once product is ready to add
		addToCartButton.click();
	}
	
	public String successMessage() {//hard code
		String actualResult = "Success: You have added " + HPLPsuccessmessage.getText() + " to your shopping cart!"; //concatonation
		return actualResult; 
	
	}
	
	public boolean isSuccessMessagePresent() {//better way to confirm success message
	if(HPLPsuccessmessage.isDisplayed())
		return true;
	else
		return false;
}
	//scenario3
	
	
	//Scenario 4 camera 5d?
	public void clickOnCanonEOS5DCamera() {
		canonEOS5DCamera.click();
	}
	public void clickOnReviewLink( ) {
		writeReviewLink.click();
	}
	
public void selectRating(String ratingValue) {
	List<WebElement> ratingElements = Rating;
	for(WebElement element: ratingElements) {
		if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
		element.click();
		break;
	}
	}
	}
	public void clickOnContinueButton() {
		ReviewContinueButton.click();

	}
	
	public void enterYourName(String nameValue) {
		yourNameField.sendKeys();
	}
	
	public void enterYourReview(String reviewValue) {
		yourReviewField.sendKeys(reviewValue);
	
	}
	
	public String reviewText() {
		return reviewSubmissionMessage;
	}
}







