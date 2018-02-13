package Helper;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonFunctionTest {


	public static void TakeScreenShot(WebDriver driver , String ScreenShotName) throws Exception{

		TakesScreenshot ts = (TakesScreenshot)driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(source, new File("./Screenshot/"+ScreenShotName+".png"));

		System.out.println("Take Screenshot");
	}

	public static void Click_Button(WebDriver driver , String LocaterType , String LocaterValue){

		if(LocaterType.equalsIgnoreCase("Id")){

			By Byid = By.id(LocaterValue);

			WebElement element = driver.findElement(Byid);

			element.click();

		}else if(LocaterType.equalsIgnoreCase("Xpath")){

			By Byxpath=By.xpath(LocaterValue);

			WebElement element1 = driver.findElement(Byxpath);

			element1.click();

		}

	}

	public static void Input_Text(WebDriver driver , String LocaterType , String LocaterValue , String Data){

		if(LocaterType.equalsIgnoreCase("Id")){

			By Byid = By.id(LocaterValue);

			WebElement element2 = driver.findElement(Byid);

			element2.sendKeys(Data);

		}else if(LocaterType.equalsIgnoreCase("Xpath")){

			By Byxpath=By.xpath(LocaterValue);

			WebElement element3 = driver.findElement(Byxpath);

			element3.sendKeys(Data);

		}

	}

	// Select DropDown list value

	public static void selectddlist(WebDriver driver , String LocaterType , String LocaterValue , String text){

		if(LocaterType.equalsIgnoreCase("Id")){

			By Byid = By.id(LocaterValue);
			WebElement select1 = driver.findElement(Byid);

			Select se1 = new Select(select1);
			se1.selectByVisibleText(text);
		}
		else if(LocaterType.equalsIgnoreCase("Xpath")){

			By Byid = By.id(LocaterValue);
			WebElement select2 = driver.findElement(Byid);

			Select se2 = new Select(select2);
			se2.selectByVisibleText(text);

		}


	}

	public static void hightlightElement(WebDriver driver, WebElement element){

		JavascriptExecutor js = (JavascriptExecutor)driver;

		//js.executeScript("arguments[0].setAttribut('style', 'background:yellow; border: 2px solid red');", element);

		js.executeScript("arguments[0].setAttribut('style', 'background:yellow; border: 2px solid red');", element);

		try{

			Thread.sleep(5000);

		}catch(InterruptedException e)
		{
			System.out.println(e.getMessage());
		}		

		js.executeScript("arguments[0].setAttribut('style', 'background:yellow; border: 2px solid red');", element);
	}

	public static void uploadfile(String path) throws Exception{

		//String text = "/Users/renuka/Desktop/Mengo/Mango5.jpeg";
		StringSelection stringSelection = new StringSelection(path);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//		clipboard.setContents(stringSelection, stringSelection);
		
		Robot robot = new Robot();
		
		// Cmd + Tab is needed since it launches a Java app and the browser looses focus

		robot.keyPress(KeyEvent.VK_META);
		
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyRelease(KeyEvent.VK_META);

		robot.keyRelease(KeyEvent.VK_TAB);

		robot.delay(1000);

		//Open Goto window

		robot.keyPress(KeyEvent.VK_META);

		robot.keyPress(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_G);

		robot.keyRelease(KeyEvent.VK_META);

		robot.keyRelease(KeyEvent.VK_SHIFT);

		robot.keyRelease(KeyEvent.VK_G);
		
		robot.delay(1000);

		//Paste the clipboard value

		robot.keyPress(KeyEvent.VK_META);

		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_META);

		robot.keyRelease(KeyEvent.VK_V);
		
		robot.delay(1000);
		//Press Enter key to close the Goto window and Upload window

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

		robot.delay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

//		robot.keyPress(KeyEvent.VK_ENTER);
//
//		robot.keyRelease(KeyEvent.VK_ENTER);


	}
	
} 


