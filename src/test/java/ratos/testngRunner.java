package ratos;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import mainUtilities.projectSpecific;
import pages.CandidateScreen;
import pages.CandidateUploadResumeScreen;
import pages.CreateJobsScreen;
import pages.CreateUserPage;
import pages.DeletedUserScreen;
import pages.HomePage;
import pages.JobScreen;
import pages.JobsEditScreen;
import pages.JobsViewScreen;
import pages.LoginPage;
import pages.RecruiterDashboardScreen;
import pages.UserEditScreen;
import pages.UserManagement;

public class testngRunner extends projectSpecific{
	
	
	LoginPage login=new LoginPage();;
	HomePage homepage= new  HomePage();
	CreateJobsScreen createjobs= new CreateJobsScreen();
	JobScreen  jobscreen= new JobScreen();
	JobsViewScreen jobs_view_screen = new JobsViewScreen();
	JobsEditScreen jobsEdit = new JobsEditScreen();
	UserManagement user_management= new UserManagement();
	CreateUserPage create_user= new CreateUserPage();
	UserEditScreen user_edit= new UserEditScreen();
	DeletedUserScreen deleted_user= new DeletedUserScreen();
	CandidateScreen candidate_screen= new CandidateScreen();
	CandidateUploadResumeScreen candidate_uplaoding= new CandidateUploadResumeScreen();
	RecruiterDashboardScreen recruiter_dashboard= new RecruiterDashboardScreen();
	
	
	@BeforeMethod
	public void getUrl() throws InterruptedException, FileNotFoundException, IOException
	{

		System.out.println(getPropertyValue("email"));
		driver.get(getPropertyValue("login_url"));
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		System.out.println("url is opened");
		driver.manage().window().maximize();
		sleep(1000);
		System.out.println("window is maximimised");
	}
	

	@Test
	public void TC_01_login_and_create_jobs() throws InterruptedException, FileNotFoundException, IOException
	{
	
		login.getEmailXpath();
		login.getPasswordXpath();
		login.getSignInButtonXpath();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		sleep(3000);
		homepage.getJobsXpath();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		jobscreen.createJobButtonClick();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		createjobs.jobPriority();
		createjobs.jobType();
		createjobs.jobLocation();
		createjobs.jobDescription();
		createjobs.jobTitle();
		createjobs.noOfOpenings();
		createjobs.projectDuration();
		createjobs.recruiter();
		createjobs.clickSubmit();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		
		jobscreen.verifyScreenTitle();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		
	}
	
	@Test
	public void TC_02_View_jobs_screen() throws FileNotFoundException, InterruptedException, IOException
	{
		login.getEmailXpath();
		login.getPasswordXpath();
		login.getSignInButtonXpath();
		sleep(3000);
		homepage.getJobsXpath();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		jobscreen.clickingThreeDits();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		jobscreen.jobs_view_screen();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		jobs_view_screen.verifyJobsViewTitle();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		
		
	}
	@Test
	public void TC_03_jobs_Edit() throws FileNotFoundException, InterruptedException, IOException
	{
		login.getEmailXpath();
		login.getPasswordXpath();
		login.getSignInButtonXpath();
		sleep(3000);
		homepage.getJobsXpath();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		jobscreen.clickingThreeDits();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		jobscreen.jobs_Edit();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		jobsEdit.jobs_update_client_bill_rate();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		jobsEdit.jobs_update_button();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		
		
	}
	
	@Test
	public void TC_04_jobs_Delete() throws FileNotFoundException, InterruptedException, IOException
	{
		login.getEmailXpath();
		login.getPasswordXpath();
		login.getSignInButtonXpath();
		sleep(3000);
		homepage.getJobsXpath();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		jobscreen.clickingThreeDits();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		jobscreen.jobs_delete();
		
	}
	
	
	@Test
	public void TC_05_create_new_user_management() throws InterruptedException, IOException
	{
		login.getEmailXpath();
		login.getPasswordXpath();
		login.getSignInButtonXpath();
		sleep(3000);
		homepage.Admin_click();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		user_management.user_management_create_button();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		String title = driver.getTitle();
		Assert.assertEquals(title, "Manage User Management - Ratos App");
		create_user.create_user_firstname();
		create_user.create_user_lastname();
		create_user.create_user_email();
		create_user.create_user_contact();
		create_user.user_date_of_joining();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		
		create_user.clicking_accessGroup_drop_down_arrow();
		create_user.clicking_designation_drop_down_arrow();
		create_user.user_uploading_image();
		create_user.user_uploading_file();
		//create_user.user_date_of_joining();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		create_user.user_click_createButton();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		Assert.assertEquals(driver.getTitle(), "User Management - Ratos App");
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		
	}
	@Test
	public void TC_06_user_delete() throws InterruptedException, IOException
	{
		
		login.getEmailXpath();
		login.getPasswordXpath();
		login.getSignInButtonXpath();
		sleep(3000);
		homepage.Admin_click();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		user_management.User_clicking_on_three_dots();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		user_management.user_clicking_on_delete();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		boolean b=driver.findElement(By.xpath("//*[text()='Create']")).isDisplayed();
		Assert.assertTrue(b, "screen is loaded");
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		user_management.user_clicking_deleted_user();
		deleted_user.user_finding_deleted_user();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		
		
	}
	
	@Test
	public void TC_07_user_screen_search() throws FileNotFoundException, InterruptedException, IOException
	{
		login.getEmailXpath();
		login.getPasswordXpath();
		login.getSignInButtonXpath();
		sleep(3000);
		homepage.Admin_click();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		user_management.user_search();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
	
		
	}
	
	@Test
	public void TC_08_edit_user() throws FileNotFoundException, InterruptedException, IOException
	{
		
		login.getEmailXpath();
		login.getPasswordXpath();
		login.getSignInButtonXpath();
		sleep(3000);
		homepage.Admin_click();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		user_management.User_clicking_on_three_dots();
		user_management.user_edit();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		user_edit.editing_user();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		user_edit.clicking_update_btton();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		
	
	}
	
	@Test
	public void TC_09_candidate_resume_uploading() throws FileNotFoundException, InterruptedException, IOException
	{
		login.getEmailXpath();
		login.getPasswordXpath();
		login.getSignInButtonXpath();
		sleep(3000);
		homepage.Admin_Candidate_database_click();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		candidate_screen.candidate_create_button();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		candidate_uplaoding.candidate_uploading_resume();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		candidate_uplaoding.candidate_resume_upload_button();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		
	}
	
	@Test
	public void TC_10_Recruiter_search_quick_search() throws FileNotFoundException, InterruptedException, IOException
	{
		login.getEmailXpath();
		login.getPasswordXpath();
		login.getSignInButtonXpath();
		sleep(3000);
		homepage.Admin_Candidate_database_click();
		candidate_screen.candidate_copying_email();
		homepage.Admin_Recruiter_dashboard_click();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		sleep(5000);
		recruiter_dashboard.recruiter_quick_search();
		recruiter_dashboard.recruiter_enter_email_to_search();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		recruiter_dashboard.recruiter_click_search();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		recruiter_dashboard.recruiter_verifying_quick_search();
		TakeScreenshot(new Exception().getStackTrace()[0].getMethodName());
		
		
		
		
		
		
		
	}
	

	@AfterMethod
	public void closeDriver() {
		driver.close();
		
		System.out.println("driver is closed");
		
	} 
	
	
	
}
