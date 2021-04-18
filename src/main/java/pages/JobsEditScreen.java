package pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import mainUtilities.projectSpecific;

public class JobsEditScreen extends projectSpecific{

	public JobsEditScreen jobs_update_client_bill_rate() throws FileNotFoundException, IOException, InterruptedException
		{
			driver.findElement(By.xpath("//*[@id='client_bill_rate']")).clear();
			driver.findElement(By.xpath("//*[@id='client_bill_rate']")).sendKeys(getPropertyValue("client_bill_rate"));
			sleep(3000);
			return this;
			
		
	}
	
	public void jobs_update_button() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[text()=' Update ']")).click();
		sleep(5000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Jobs - Ratos App");
		
		sleep(5000);
	}
	
}
