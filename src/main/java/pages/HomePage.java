package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainUtilities.projectSpecific;

public class HomePage extends projectSpecific {
	public JobScreen getJobsXpath() throws InterruptedException
	{
		System.out.println("before clicking on the jobs screen");
		sleep(3000);
		driver.findElement(By.xpath("//*[@href='#/jobs']")).click();
		System.out.println("After clicking on the jobs screen");
		sleep(10000);
		
		return new JobScreen();
	}
	
	
	
	public UserManagement Admin_click() throws InterruptedException
	{
		System.out.println("home screen");
		WebElement findElement = driver.findElement(By.xpath("//*[text()=' Admin ']"));
		moveToElenentAction(findElement);
		sleep(3000);
		moveToElenentAction(driver.findElement(By.xpath("//*[@href='#/user-management']")));
		sleep(3000);
		return new UserManagement();
		
		
	}
	
	public CandidateScreen Admin_Candidate_database_click() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[contains(text(),'Candidate Data')]")).click();
		sleep(2000);
		return new CandidateScreen();
		
	}
	
	public RecruiterDashboardScreen Admin_Recruiter_dashboard_click() throws InterruptedException
	{
		sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Recruiter Dashboard')]")).click();
		sleep(2000);
		return new RecruiterDashboardScreen();
	}

}
