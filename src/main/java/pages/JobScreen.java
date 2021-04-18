package pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;

import mainUtilities.projectSpecific;

public class JobScreen extends projectSpecific{
	
	
	public CreateJobsScreen createJobButtonClick() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[text()='Create Job']")).click();
		sleep(5000);
		
		return new CreateJobsScreen();
	}
	
	public void verifyScreenTitle() throws InterruptedException
	{
		String title = driver.getTitle();
		
		sleep(10000);
		Assert.assertEquals(title, "Jobs - Ratos App");
		
	}
	
	public JobScreen clickingThreeDits() throws InterruptedException
	{
		System.out.println("now clicking on the three dots");
		driver.findElement(By.xpath("//*[@id='dropdownActionButton']")).click();
		System.out.println("after clicking on the three dots");
		sleep(2000);
		return this;
	}
	
	public JobsViewScreen  jobs_view_screen() throws InterruptedException
	{
		moveToElenentAction(driver.findElement(By.xpath("//*[text()='View']")));
		sleep(5000);
		return new JobsViewScreen();
	}
	
	public JobsEditScreen jobs_Edit() throws InterruptedException, IOException
	{
		
		
		moveToElenentAction(driver.findElement(By.xpath("//*[text()='Edit']")));
		sleep(5000);
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		return new JobsEditScreen();
	}
	
	public JobScreen jobs_delete() throws InterruptedException, IOException
	{
		moveToElenentAction(driver.findElement(By.xpath("//*[text()='Delete']")));
		
		sleep(5000);
		/*Alert alert= driver.switchTo().alert();
		alert.accept();*/
		AlerthandlingOK();
		sleep(5000);
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		String title = driver.getTitle();
		Assert.assertEquals(title, "Jobs - Ratos App");
		return new JobScreen();
	}
	
	

}
