package pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;

import mainUtilities.projectSpecific;

public class LoginPage extends projectSpecific{
	
	
	
	public void getEmailXpath() throws InterruptedException, FileNotFoundException, IOException
	{
		System.out.println("before email xpath");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(getPropertyValue("email"));
		
		sleep(1000);
	}
	
	public void getPasswordXpath() throws InterruptedException, FileNotFoundException, IOException
	{
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(getPropertyValue("password"));
		sleep(1000);
	}

	public HomePage getSignInButtonXpath() throws InterruptedException
	{
		 driver.findElement(By.xpath("//*[@type='submit']")).click();
			sleep(3000);
		 return new HomePage();
		
	}
}
