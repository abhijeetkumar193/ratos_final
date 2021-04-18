package pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import mainUtilities.projectSpecific;

public class UserEditScreen extends projectSpecific{
	
public UserEditScreen editing_user() throws FileNotFoundException, IOException, InterruptedException
{
	sleep(1000);
	driver.findElement(By.xpath("//*[@name='last_name']")).clear();
	sleep(1000);
	driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys(getPropertyValue("edit_last_name"));
	return this;
}

public CreateUserPage clicking_update_btton() throws InterruptedException
{
	sleep(1000);
	driver.findElement(By.xpath("//*[contains(text(),' Update User ')]")).click();
	sleep(4000);
	Assert.assertEquals(driver.getTitle(),"User Management - Ratos App");
	return new CreateUserPage();
}
	
}
