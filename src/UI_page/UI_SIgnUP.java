package UI_page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UI_SIgnUP {

	WebDriver driver;

	public  UI_SIgnUP(WebDriver driver){

		this.driver = driver;
	}
	/* ####### User Details ######## */
	By ufname = By.id("user_first_name");
	By ulname = By.id("user_last_name");
	By uemail = By.id("user_email");
	By ucno = By.id("user_contact_number");
	By upass = By.id("user_signup_password");
	By ucpass = By.id("user_password_confirmation");
	By uadd = By.id("user_address");
	By ucity = By.id("user_city");
	By ucode = By.id("user_zipcode");
	By check = By.id("tc");
	By next = By.xpath("//*[@href = '#next']");

	/* ####### Select Carriers ######## */
	By carrier = By.xpath(".//*[@id='user_user_companies_attributes_0_company_id_2']");

	/* ####### Select Products ######## */
	By product1 = By.id("p_checked_3");
	By product2 = By.id("p_checked_4");
	
	/* ####### Agency Details ######## */
	By aname = By.id("user_agencies_attributes_0_name");
	By acname = By.id("user_agencies_attributes_0_contact_name");
	By aemail = By.id("user_agencies_attributes_0_email_to");
	By anumber = By.id("user_agencies_attributes_0_contact_number");
	
	/* ####### Payment Details ######## */
	By cardholdername = By.id("subscription_card_holder_name");
	By cardnumber = By.id("subscription_card_number");
	By cvv = By.id("subscription_cvc_number");
	By discountcode = By.id("discount");
	By apply = By.xpath(".//*[@id='apply']");
	

	/* ####### User Details ######## */
	public void name(String fname, String lname){

		driver.findElement(ufname).sendKeys(fname);
		driver.findElement(ulname).sendKeys(lname);	
	}

	public void emailid(String mail){

		driver.findElement(uemail).sendKeys(mail);
	}

	public void number(String contact){

		driver.findElement(ucno).sendKeys(contact);
	}

	public void password(String pass, String cpass){

		driver.findElement(upass).sendKeys(pass);
		driver.findElement(ucpass).sendKeys(cpass);
	}

	public void address(String add, String city){

		driver.findElement(uadd).sendKeys(add);
		driver.findElement(ucity).sendKeys(city);
	}

	public void zipcode(String code){

		driver.findElement(ucode).sendKeys(code);
	}

	public void checkbox(){

		driver.findElement(check).click();
	}

	public void nextbutton(){

		driver.findElement(next).click();
	}

	/* ####### Select Carriers ######## */
	public void selectcarriers(){

		driver.findElement(carrier).click();
	}
	
	/* ####### Select Products ######## */
	public void selectproducts(){

		driver.findElement(product1).click();
		driver.findElement(product2).click();
	}
	
	/* ####### Agency Details ######## */
	public void addagency(String agencyname, String acontact, String emailto, String agencynumber){
		
		driver.findElement(aname).sendKeys(agencyname);
		driver.findElement(acname).sendKeys(acontact);
		driver.findElement(aemail).sendKeys(emailto);
		driver.findElement(anumber).sendKeys(agencynumber);
	}
	
	/* ####### Agency Details ######## */
	public void holdername(String hname){
		
		driver.findElement(cardholdername).sendKeys(hname);
	}
	public void cnumber(String card){
		
		driver.findElement(cardnumber).sendKeys(card);
	}
	public void cvvno(String cnumber){
		
		driver.findElement(cvv).sendKeys(cnumber);
	}
	public void applycode(String dcode){
		
		driver.findElement(discountcode).sendKeys(dcode);
	}
	public void clickapplybutton(){
		
		driver.findElement(apply).click();
	}
	
	
	
}
