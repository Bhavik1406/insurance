package Login_Page;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import Helper.CommonFunctionTest;
import PageUI.LoginUITest;

public class LoginScreenTest {


	WebDriver driver;

	@Test
	public void setup(){

		System.setProperty("webdriver.gecko.driver","/Bhavik/Automation/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
	}
}	




