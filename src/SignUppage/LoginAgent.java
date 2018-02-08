package SignUppage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Helper.BrowserFactory;

public class LoginAgent {

	WebDriver driver;
	@BeforeClass
	public void loginagent() {

		BrowserFactory bf = new BrowserFactory();
		driver = bf.browser(driver, "Firefox", "https://demo.virtualinsurancetools.com/users/sign_in");

	}

	@Test
	/*CASE- 1. Both User name and Password are entered correctly. 
	Check whether Email field exists or not */
	public void test1(){

		try
		{
			WebElement a1 = driver.findElement(By.id("user_email"));
			System.out.println("---------Emaild exists --------------\n-----------------------");
			a1.sendKeys("jecob@yopmail.com");
		}
		catch(Throwable e)
		{
			System.out.println("Emaild not found: " + e.getMessage());
		}

		try
		{
			WebElement password = driver.findElement(By.id("user_password"));
			System.out.println("----------Passwordd exits ------------\n-----------------------");
			password.sendKeys("testing");
		}
		catch(Throwable e)
		{
			System.out.println("Passwordd not found: " + e.getMessage());
		}

		try
		{
			WebElement button = driver.findElement(By.className("log_in_button"));
			System.out.println("-------Login Button exists----------\n-----------------------");
			//To uncheck the "Check sign in" checkbox
			//WebElement check_stay_sign_in = driver.findElement(By.xpath("//*[@id='PersistentCookie']"));
			//check_stay_sign_in.click();   
			button.click();
		}
		catch(Throwable e)
		{
			System.out.println("Signutton not found: "+ e.getMessage());
		}
	}
	@Test
	//Check if login was proper or not
	public void test2(){
		try
		{
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println(text);
//			WebElement newtext = driver.findElement(By.xpath("//*[@class = 'text-semibold']"));
//			String text = newtext.getText();
			if(text.equals("Subscriptions"))
			{
				System.out.println("----------Sucessfuln -------\n-----------------------");
			}else
			{
				System.out.println("----------Loginure ----------\n-----------------------");
			}
		}
		catch(Throwable e){
			System.out.println("Inbox not found: "+e.getMessage());
		}

	}
}
