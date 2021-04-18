package pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import mainUtilities.projectSpecific;


public class CreateJobsScreen extends projectSpecific{
	
	public CreateJobsScreen jobPriority() throws InterruptedException
	{
		
		driver.findElement(By.xpath("(//*[@class='ng-arrow-wrapper'])[1]")).click();
		sleep(2000);
		
		WebElement findElement = driver.findElement(By.xpath("//*[text()='High']"));
		moveToElenentAction(findElement);
		sleep(200);
		
		return this;
	}
	public void jobType() throws InterruptedException
	{
		driver.findElement(By.xpath("(//*[@class='ng-arrow-wrapper'])[3]")).click();
		sleep(3000);
		
		WebElement findElement = driver.findElement(By.xpath("//*[text()='Full Time']"));
		moveToElenentAction(findElement);
		sleep(5000);
		
	}
	
	public CreateJobsScreen noOfOpenings() throws FileNotFoundException, IOException
	{
		driver.findElement(By.xpath("//*[@id='no_of_openings']")).sendKeys(getPropertyValue("no_of_opening"));
		return this;
	}
	
	
	public CreateJobsScreen projectDuration() throws FileNotFoundException, IOException
	{
		driver.findElement(By.xpath("//*[@id='project_duration']")).sendKeys(getPropertyValue("project_duration"));
		return this;
	}
	
	public CreateJobsScreen jobLocation() throws InterruptedException
	{
		sleep(3000);
		//driver.findElement(By.xpath("(//*[@class='ng-arrow-wrapper'])[5]")).click();
		
		//sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ng-arrow-wrapper'])[5]")).click();
		System.out.println("clicked on the drop down symbol");
		sleep(5000);
		driver.findElement(By.xpath("(//*[@class='ng-input'])[5]/input")).sendKeys("Boston, GA");
		System.out.println("enetred the text in the box as boston");
		sleep(10000);
		moveToElenentAction(driver.findElement(By.xpath("//*[text()='Boston, GA']")));
		sleep(5000);
		return this;
	}
	
	public CreateJobsScreen jobTitle() throws InterruptedException, FileNotFoundException, IOException
	{
		sleep(3000);
		driver.findElement(By.id("job_title")).sendKeys(getPropertyValue("job_title"));
		sleep(3000);
		return this;
	}
	
	public CreateJobsScreen jobDescription() throws InterruptedException, FileNotFoundException, IOException
	{
		sleep(3000);
		driver.findElement(By.xpath("//*[@formcontrolname='job_description']")).sendKeys(getPropertyValue("job_description"));
		sleep(3000);
		return this;
	
	}
	
	public CreateJobsScreen recruiter() throws InterruptedException
	{
		driver.findElement(By.xpath("(//*[@class='ng-arrow-wrapper'])[16]")).click();
		sleep(2000);
		moveToElenentAction(driver.findElement(By.xpath("(//*[@class='ng-option-label'])[1]")));
		return this;
	}
	
	
	public JobScreen clickSubmit() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[text()=' Submit Job ']")).click();
		sleep(15000);
		
		
		return new JobScreen();
	}
	
	
	
	
	
}
