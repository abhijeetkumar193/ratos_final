package mainUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import pages.LoginPage;

public class projectSpecific  implements ratosInterfaces{

	public Properties prop;
	public static ChromeDriver driver;
	Alert alert;
	public static String text;
	
	

	public String getPropertyValue(String key) throws FileNotFoundException, IOException {
		prop= new Properties();
		prop.load(new FileInputStream(new File("./Utilities/utilities.properties")));
		return prop.getProperty(key);
		
	}
	
	
	public void sleep(long time) throws InterruptedException
	{
		Thread.sleep(time);
	}
	@BeforeMethod
	public WebDriver initialiseDriver() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();
		System.out.println("driver initialised");
		return driver;
		
	}
	
	public void dropDownselect(WebElement ele, int i)
	{
		Select select= new Select(ele);
		select.selectByIndex(i);
		
	}
	
	public void moveToElenentAction(WebElement xpath)
	{
		Actions action= new Actions(driver);
		action.moveToElement(xpath).click().perform();
		
	}
	
	public void TakeScreenshot(String testcase_name) throws IOException, InterruptedException
	{
		Date date= new Date();
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File scr= driver.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scr, new File("./snaps/"+date.getTimezoneOffset()+"/"+testcase_name+"-"+date.getTime()+" - "+".png"));
		sleep(2000);
	}
	
	public void AlerthandlingOK() throws InterruptedException
	{
		alert=driver.switchTo().alert();
		alert.accept();
		sleep(3000);
	}
	
	

	
	
}
