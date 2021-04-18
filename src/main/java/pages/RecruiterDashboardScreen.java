package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import mainUtilities.projectSpecific;

public class RecruiterDashboardScreen extends projectSpecific{
	
	public RecruiterDashboardScreen recruiter_quick_search() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[contains(text(),'Quick Search')]")).click();
		sleep(2000);
		return this;
		
	}
	
	
	public RecruiterDashboardScreen recruiter_enter_email_to_search() throws InterruptedException
	{

		driver.findElement(By.xpath("//*[@placeholder='Quick Search for Candidate']")).sendKeys(text);
		sleep(2000);
		
		return this;
	}
	
	public RecruiterDashboardScreen recruiter_click_search()
	{
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		return this;
	}
	
	public void recruiter_verifying_quick_search()
	{
		boolean displayed = driver.findElement(By.xpath("//*[text()='Add Track: ']")).isDisplayed();
		Assert.assertTrue(displayed, "Recruiter dashboard quick view search is verified");
	}
	

}
