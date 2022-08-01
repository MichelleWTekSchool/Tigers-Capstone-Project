package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");//may not need .exe; not how it is svaed
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://facebook.com/");
	
	driver.close();//video 53 min 20
}
}
