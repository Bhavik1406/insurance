package AgencyPanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Helper.BrowserFactory;

public class Agency_Login {
	//WebDriver driver;
	
	  @Test
	  public WebDriver agencylogin(WebDriver driver,String username, String Password) throws InterruptedException {
		  BrowserFactory bf = new BrowserFactory();
		  //driver = bf.browser(driver, "Firefox", "https://virtualinsurancetools.com/");
		  driver = bf.browser(driver, "Firefox", "https://demo.virtualinsurancetools.com/");
		  Thread.sleep(5000);
		  driver.findElement(By.id("open_drawer")).click();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath(".//*[@id='content']/div/ul/li[5]/a")).click();
		  Thread.sleep(5000);
		  //driver.findElement(By.xpath("//div[@class = 'actions signin_btn text-right']/a[2]")).click();
		  driver.findElement(By.id("user_email")).sendKeys(username);
		  driver.findElement(By.id("user_password")).sendKeys(Password);
		  driver.findElement(By.className("log_in_button")).click();
		return driver;
		  
	  }
}
