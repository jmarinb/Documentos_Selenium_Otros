package threads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Thread3 {
	
	@Test 
	public void Threadmethod2()
	{
		 System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\1463387\\Documents\\tools\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.mitelcel.com/mitelcel/login");
		 driver.findElement(By.id("username")).sendKeys("3312476025");
		 driver.findElement(By.id("pass")).sendKeys("holamundoloco");
		 driver.findElement(By.xpath("//*[@id=\"btn-login\"]")).click();
	}

}
