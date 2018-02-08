/**
 * 
 */
package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author renuka
 * Mantion all browser
 */
public class BrowserFactory {

	public  WebDriver browser(WebDriver driver,String Browsername , String url){

		if(Browsername.equalsIgnoreCase("Firefox")){

			System.setProperty("webdriver.gecko.driver","/Bhavik/Automation/geckodriver");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(Browsername.equalsIgnoreCase("Chrome")){

			System.setProperty("webdriver.chrome.driver", "/Bhavik/Automation/chromedriver");
			//driver = new ChromeDriver();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--kiosk");
			driver = new ChromeDriver(chromeOptions);
		}
		driver.get(url);
		return driver;
	}
}




