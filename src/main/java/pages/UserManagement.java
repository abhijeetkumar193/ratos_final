package pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import mainUtilities.projectSpecific;

public class UserManagement extends projectSpecific {

	public CreateUserPage user_management_create_button() throws InterruptedException{
		
		sleep(2000);
		driver.findElement(By.xpath("//*[text()='Create']")).click();
		sleep(2000);
		return new CreateUserPage();
	}
	
	public UserManagement user_management_verify_title() throws InterruptedException
	{
		String title = driver.getTitle();
		Assert.assertEquals(title, "User Management - Ratos App");
		sleep(3000);
		return this;
	}
	
	public UserManagement User_clicking_on_three_dots() throws InterruptedException
	{
		driver.findElement(By.xpath("(//*[@id='dropdownActionButton'])[1]")).click();
		sleep(1000);
		return this;
	}
	
	public UserManagement user_clicking_on_delete() throws InterruptedException
	{
		driver.findElement(By.xpath("(//*[text()='Delete'])[1]")).click();
		sleep(3000);
		AlerthandlingOK();
		return this;
		
		
	}
	
	public UserManagement user_search() throws FileNotFoundException, IOException, InterruptedException
	{
		sleep(2000);
		driver.findElement(By.xpath("//*[@name='search']")).sendKeys(getPropertyValue("first_name"));
		sleep(4000);
		
		
		boolean displayed = driver.findElement(By.xpath("//*[contains(text(),'"+getPropertyValue("first_name")+"')]")).isDisplayed();
		sleep(4000);
		Assert.assertTrue(displayed, "searched element is present");
		return this;
		
	}
	
	
	public UserEditScreen user_edit() throws InterruptedException
	{
		sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Edit')]")).click();
		return new UserEditScreen();
	}
	
	
	public DeletedUserScreen user_clicking_deleted_user() throws InterruptedException
	{
		sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Deleted Users')]")).click();
		return new DeletedUserScreen();
	}

	
	
	
	
	
}
