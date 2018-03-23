package threads;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Thread1 {
	
	@Test 
	public void Threadmethod()
	{
		 System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\1463387\\Documents\\tools\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.udemy.com/");
	}
	
	
	
	
	
	

}
