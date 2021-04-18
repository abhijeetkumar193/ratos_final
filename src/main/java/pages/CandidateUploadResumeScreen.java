package pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;

import mainUtilities.projectSpecific;

public class CandidateUploadResumeScreen extends projectSpecific{

	public void candidate_uploading_resume() throws FileNotFoundException, IOException, InterruptedException
	{
		sleep(2000);
		driver.findElement(By.xpath("(//*[@name='upload'])[1]")).sendKeys(getPropertyValue("resume_path_1"));	
		//driver.findElement(By.xpath("//*[@name='upload']")).sendKeys(getPropertyValue("resume_path_2"));
		sleep(1000);
	}
	
	public void candidate_resume_upload_button() throws InterruptedException
	{
		sleep(2000);
		driver.findElement(By.xpath("//*[text()=' Upload ']")).click();
		sleep(15000);
		
	}
	
	

}
