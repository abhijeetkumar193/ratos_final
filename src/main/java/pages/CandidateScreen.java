package pages;

import org.openqa.selenium.By;

import mainUtilities.projectSpecific;

public class CandidateScreen extends projectSpecific {
	
	public CandidateUploadResumeScreen candidate_create_button() throws InterruptedException
	{
		sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'Create')])[1]")).click();
		return new CandidateUploadResumeScreen();
	}
	
	public RecruiterDashboardScreen candidate_copying_email() throws InterruptedException
	{
		sleep(2000);
		text= driver.findElement(By.xpath("//*[@class='table table-striped']//tr[1]/td[5]")).getText();
		return new RecruiterDashboardScreen();
	}
	

	
	
}
