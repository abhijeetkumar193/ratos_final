package pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;

import mainUtilities.projectSpecific;

public class DeletedUserScreen  extends projectSpecific{
	
	public void user_finding_deleted_user() throws FileNotFoundException, IOException, InterruptedException
	{
		sleep(2000);
		boolean displayed = driver.findElement(By.xpath("//*[contains(text(),'"+getPropertyValue("user_email")+"')]")).isDisplayed();
		if(displayed==true)
		{
			System.out.println("deleted user is present in teh deleted user screens");
		}
		else
		{
			System.out.println("deleted user is not present in the deleted user screen");
		}
		
	}

}
