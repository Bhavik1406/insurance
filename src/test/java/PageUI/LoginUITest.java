package PageUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginUITest {
	
	WebDriver driver;
	
	By uname = By.cssSelector(".form-control");
	By pass = By.id("user_password");
	By click = By.xpath("//button[@type = 'submit']");
	
	
	public LoginUITest(WebDriver driver){
		
		this.driver=driver;
	}
	
	public void username(String name){
		
		driver.findElement(uname).sendKeys(name);
		
	}
	public void password(String inputpass){
		
		driver.findElement(pass).sendKeys(inputpass);
		
	}
	
	public void button(){
		
		driver.findElement(click).click();
	}
}
