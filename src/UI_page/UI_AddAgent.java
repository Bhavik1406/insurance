package UI_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UI_AddAgent {

	WebDriver driver;
	public UI_AddAgent(WebDriver driver){

		this.driver = driver;
	}

	By firstname = By.id("user_first_name");
	By lastname = By.id("user_last_name");
	By phone = By.id("user_contact_number");
	By emailid = By.id("user_email");
	By password = By.id("user_new_password");
	By cpassword = By.id("user_password_confirmation");
	By login = By.name("commit");


	public void name(String userfname,String userlname){

		driver.findElement(firstname).sendKeys(userfname);
		driver.findElement(lastname).sendKeys(userlname);
	}
	
	public void phonenumber(String pnumber){
		
		driver.findElement(phone).sendKeys(pnumber);
	}
	public void email(String id){
		
		driver.findElement(emailid).sendKeys(id);
	}
	public void pass(String pass1, String pass2){
		
		driver.findElement(password).sendKeys(pass1);
		driver.findElement(cpassword).sendKeys(pass2);
		
	}
	public void click(){
		
		driver.findElement(login).click();
	}
}


