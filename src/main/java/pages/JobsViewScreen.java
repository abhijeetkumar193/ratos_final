package pages;

import org.testng.Assert;

import mainUtilities.projectSpecific;

public class JobsViewScreen extends projectSpecific{
	
	public JobsViewScreen verifyJobsViewTitle() throws InterruptedException
	{
		sleep(2000);
		String title = driver.getTitle();
		Assert.assertEquals(title, "View Job - Ratos App");
		return this;
	
	}

}
