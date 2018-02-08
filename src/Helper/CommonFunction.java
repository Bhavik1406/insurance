package Helper;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonFunction {
	
	public static void TakeScreenShot(WebDriver driver , String ScreenShotName) throws Exception{

		TakesScreenshot ts = (TakesScreenshot)driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File path = new File("./Screenshot/"+ScreenShotName+".png");

		FileUtils.copyFile(source, path);
		
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
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);

		Robot robot = new Robot();

		// Cmd + Tab is needed since it launches a Java app and the browser looses focus

		robot.keyPress(KeyEvent.VK_META);

		robot.keyPress(KeyEvent.VK_TAB);

		robot.keyRelease(KeyEvent.VK_META);

		robot.keyRelease(KeyEvent.VK_TAB);

		robot.delay(500);

		//Open Goto window

		robot.keyPress(KeyEvent.VK_META);

		robot.keyPress(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_G);

		robot.keyRelease(KeyEvent.VK_META);

		robot.keyRelease(KeyEvent.VK_SHIFT);

		robot.keyRelease(KeyEvent.VK_G);

		//Paste the clipboard value

		robot.keyPress(KeyEvent.VK_META);

		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_META);

		robot.keyRelease(KeyEvent.VK_V);

		//Press Enter key to close the Goto window and Upload window

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

		robot.delay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

} 


