package SignUppage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Helper.BrowserFactory;
import UI_page.UI_SIgnUP;

public class Signup {
	WebDriver driver;

	@BeforeClass
	public void setup(){
		
		BrowserFactory bf = new BrowserFactory();
		driver = bf.browser(driver, "Firefox", "https://demo.virtualinsurancetools.com/users/sign_up");
	}
	
	@Test(priority =1)
	public void signupdetail() throws InterruptedException{
		Thread.sleep(5000);
		
		/* ******* User Details ******** */
		UI_SIgnUP signup = new UI_SIgnUP(driver);
		signup.name("Maria", "Dell");
		signup.emailid("maria@yopmail.com");
		signup.number("3265256542");
		signup.password("testing", "testing");
		signup.address("Test Address", "hartford");
		WebElement stateddl = driver.findElement(By.id("user_state"));
		Select state = new Select(stateddl);
		state.selectByValue("7");
		signup.zipcode("06120");
		signup.checkbox();
		signup.nextbutton();
		
		/* ******* Select Carriers ******** */
		Thread.sleep(5000);
		signup.selectcarriers();
		signup.nextbutton();
		
		/* ******* Select Products ******** */
		Thread.sleep(5000);
		signup.selectproducts();
		signup.nextbutton();
		
		/* ******* Agency Detail ******** */
		Thread.sleep(5000);
		signup.addagency("Maria Agency", "Maria Dell", "maria1@yopmail.com", "3265256325");
		signup.nextbutton();
		
		/* ******* Payment Detail ******** */
		Thread.sleep(5000);
		signup.holdername("Maria Dell");
		signup.cvvno("4111111111111111");
		WebElement date = driver.findElement(By.id("subscription_expiry_month"));
		Select expirymonth = new Select(date);
		expirymonth.selectByValue("4");

		WebElement year = driver.findElement(By.id("subscription_expiry_year"));
		Select expiryyear = new Select(year);
		expiryyear.selectByValue("2022");
		signup.cvvno("123");
		signup.applycode("VIT100");
		signup.clickapplybutton();
		
	}
}