package pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import mainUtilities.projectSpecific;

public class CreateUserPage extends projectSpecific{
	
	public CreateUserPage create_user_firstname() throws FileNotFoundException, IOException
	{
		driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys(getPropertyValue("first_name"));
		return this;
	}
	
	public CreateUserPage create_user_lastname() throws FileNotFoundException, IOException
	{
		driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys(getPropertyValue("last_name"));
		return this;
	}
	
	public CreateUserPage create_user_email() throws FileNotFoundException, IOException
	{
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys(getPropertyValue("user_email"));
		return this;
	}
	
	public CreateUserPage create_user_contact() throws FileNotFoundException, IOException, InterruptedException
	{
		
		driver.findElement(By.xpath("//*[@name='phone_number']")).sendKeys(getPropertyValue("contact"),Keys.TAB);
		sleep(3000);
		
		return this;
	}
	
	
	public CreateUserPage clicking_accessGroup_drop_down_arrow() throws InterruptedException
	{
		sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ng-arrow-wrapper'])[3]")).click();
		sleep(3000);
		moveToElenentAction(driver.findElement(By.xpath("//*[text()='Recruiter (Default)']")));
		sleep(2000);
		return this;
		
	}
	
	public CreateUserPage clicking_designation_drop_down_arrow() throws InterruptedException
	{
		sleep(3000);
		driver.findElement(By.xpath("(//*[@class='ng-arrow-wrapper'])[5]")).click();
		sleep(3000);
		moveToElenentAction(driver.findElement(By.xpath("//*[text()='Staffing Recruiter']")));
		sleep(2000);
		return this;
		
	}
	
	public CreateUserPage user_uploading_image() throws InterruptedException, FileNotFoundException, IOException
	{
		WebElement findElement = driver.findElement(By.xpath("(//*[@id='inputGroupFile04'])[2]"));
		findElement.sendKeys(getPropertyValue("image_path"));
		//findElement.sendKeys("/Ratos/Files/l1.jpg");
		sleep(3000);
		return this;
	}
	
	public CreateUserPage user_uploading_file() throws InterruptedException, FileNotFoundException, IOException
	{
		//driver.findElement(By.xpath("(//*[@id='inputGroupFile04'])[1]")).sendKeys("/Ratos/Files/Carlo_Arakian_s_Resume.docx");
		driver.findElement(By.xpath("(//*[@id='inputGroupFile04'])[1]")).sendKeys(getPropertyValue("file_path"));
		sleep(3000);
		return this;
	}
	
	
	public UserManagement user_click_createButton() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//*[text()=' Create User ']")).click();
		sleep(5000);
		return new UserManagement();
	}
	
	public CreateUserPage user_date_of_joining() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@formcontrolname='dob']")).sendKeys(Keys.SPACE);
		driver.findElement(By.xpath("//*[@formcontrolname='dob']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//*[@formcontrolname='dob']")).sendKeys(Keys.ENTER);
		
		return this;
	}
	
	
	

}
