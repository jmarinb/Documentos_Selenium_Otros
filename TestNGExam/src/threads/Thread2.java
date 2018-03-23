package threads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Thread2 {
	
	@Test 
	public void Threadmethod2()
	{
		 System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\1463387\\Documents\\tools\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.google.com.mx");
		 driver.findElement(By.id("lst-ib")).sendKeys("carros ferrari");
		 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]")).click();
		 
		 
		 
	}

}
