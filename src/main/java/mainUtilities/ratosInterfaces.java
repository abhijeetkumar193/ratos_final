package mainUtilities;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;


public interface ratosInterfaces {
	public WebDriver initialiseDriver();
	public String getPropertyValue(String key) throws FileNotFoundException, IOException;
	
}
