package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility extends Utils{
	
			public static WebDriver driver;
			public static void getBrowser(String browserName, String url) {
				//we created a switch class so that we can handle and open different browsers as per our need and if browser name 
				//is misspelled or browser is not available in any of the cases of our switch statement, then chrome browser will be launched
				switch (browserName) {
				case "chrome":
					//by using webdriver manager, we don't have to worry about the version of our chromedriver is the same as the 
					//chrome browser
					WebDriverManager.chromedriver().setup();
					//we are using the reference to WebDriver interface and we create object of ChromeDriver();
					driver = new ChromeDriver();
					//we are using the reference to WebDriver and call the method get(); which will allow us to launch the url
					driver.get(url);
					break;
				case "firefox":
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					driver.get(url);
					break;
				case "edge":
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					driver.get(url);
					break;
				default:
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
					driver.get(url);
				}
			
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
			}
		
			public static void hardWait(int timeUnit) {
				try {
					Thread.sleep(timeUnit);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		
			public static void tearDown() {
				driver.close();
				driver.quit();
			}
			public static void clickOnRadioButton(WebElement element) {
				try {
					if(element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {
						element.click();
					}else {
					System.out.println("One of the conditions did not return expected velue");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			public static boolean checkStatusOfRadioButton(WebElement element) {
				try {
					if(element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {
						System.out.println("Radio button isDisplayed, isEnabled, and notSelected");
					}else {
						System.out.println("Checking status of Radio button/check box failed!!!");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				return true;	
				}
				
				public static void clickWithJSE(WebElement element) {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].click();", element);
				}

				// How we can give border to an element on webpage
				public static void highlightelementRedBorder(WebElement element) {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].style.border='2px solid red'", element);
				}

				// How we can highlight an element background
				public static void highlightelementBackground(WebElement element) {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].style.background='yellow'", element);
				}

				// What if we want to do both/above with same method?
				// give border and highlith
				public static void highlightelementBorderAndBackground(WebElement element) {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
				}

				// How we can scroll down the page with JSExecutor
				public static void scrolldownPage() {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					// from (0, 1000), you can modify the 100 field and scroll down the page as per
					// your testing needs
					js.executeScript("window.scrollBy(0, 1000)");
					// scroll all the way down the page
//					js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				}

				// how to sendkeys with JSExecutor
				public static void sendKeys(WebElement element, String value) {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].value='" + value + "'", element);
				}

				/**
				 * This method will select the value from static Dropdown by visible value
				 */
				public static void selectByVisibleText(WebElement element, String text) {
					Select select = new Select(element);
					select.selectByVisibleText(text);
				}

				/**
				 * This method will select value from static Dropdown by index
				 */
				public static void selectByIndex(WebElement element, int index) {
					Select select = new Select(element);
					select.selectByIndex(index);
				}

				/**
				 * This method will select value from static dropdown by value
				 */
				public static void selectByValue(WebElement element, String value) {
					Select select = new Select(element);
					select.selectByValue(value);
				}

				/**
				 * This method accepts alerts
				 */
				public static void acceptAlert() {
					driver.switchTo().alert().accept();
				}

				public static void dismissAlert() {
					driver.switchTo().alert().dismiss();
				}

				/**
				 * This method will switch webdriver from parent window to child
				 */
				public static void switchToWindow() {
					Set<String> WindowsHandles = driver.getWindowHandles();
					Iterator<String> it = WindowsHandles.iterator();
					String window = it.next();
					driver.switchTo().window(window);
				}

				/**
				 * This method will return text of element
				 */
				public static String getText(WebElement ele) {
					String ElementText = ele.getText();
					return ElementText;
				}

				/**
				 * This method will drag and drop using Actions class
				 */
				public static void dragAndDrop(WebElement sourceElement, WebElement targetElement) {
					Actions action = new Actions(driver);
					action.dragAndDrop(sourceElement, targetElement).perform();

				}
				
				public static boolean isELementDisplayed(WebElement element) {
					if (element.isDisplayed())
						return true;
						else
							return false;
				}
				
				public static void moveToElement(WebElement element) {
					Actions action = new Actions(driver);
					action.moveToElement(element).perform();
					
				}
				
				public static void hardWait() {
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
}
				 public static void takeScreenShot() { //not sure what I did or if this resolved the issue

				        String location = System.getProperty("user.dir") + "\\output\\screenshots\\";
				        String screenShotFileName = screenShotName() + ".png";

				        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

				        try {
				            FileUtils.copyFile(file, new File(location + screenShotFileName));
				        } catch (IOException e) {
				            e.printStackTrace();
				            System.out.println("Exception in execution");
				        }		
				 }}
