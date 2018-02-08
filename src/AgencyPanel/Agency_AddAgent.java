package AgencyPanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Helper.ReadExcel;
import UI_page.UI_AddAgent;

public class Agency_AddAgent{
	WebDriver driver;

	@Test(priority = 1)
	public void login() throws InterruptedException{

		Agency_Login login = new Agency_Login();
		driver = login.agencylogin(driver,"jecob@yopmail.com", "testing");
	}
	@Test(priority = 2)
	public void test() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class = 'sidebar-content']/div/div/ul/li[7]")).click();
		Thread.sleep(5000);
		ReadExcel re = new ReadExcel("/Bhavik/Automation/Works/VirtualInsurance/DataFile/Agent1.xls");
		int row = re.getrowcount(0);
		for(int i =1 ;i<row; i++){

			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[@href = '/company_admin/agents/new']")).click();

			String fname = re.getdataString(0, i, 0);
			String lname = re.getdataString(0, i, 1);
			String phone = re.getdataNumeric(0, i, 2);
			String email = re.getdataString(0, i, 3);
			String pass = re.getdataString(0, i, 4);
			String cpass = re.getdataString(0, i, 5);

			Thread.sleep(5000);
//			driver.findElement(By.id("user_first_name")).sendKeys(fname);
//			driver.findElement(By.id("user_last_name")).sendKeys(lname);
//			driver.findElement(By.id("user_contact_number")).sendKeys(phone);
//			driver.findElement(By.id("user_email")).sendKeys(email);
//			driver.findElement(By.id("user_new_password")).sendKeys(pass);
//			driver.findElement(By.id("user_password_confirmation")).sendKeys(cpass);
//			driver.findElement(By.name("commit")).click();
			
			UI_AddAgent addagent = new UI_AddAgent(driver);
			
			addagent.name(fname, lname);
			addagent.phonenumber(phone);
			addagent.email(email);
			addagent.pass(pass, cpass);
			addagent.click();
			Thread.sleep(5000);
	
		}
	}
	
}
