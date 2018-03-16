package junit;

import org.junit.After;
//import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstExampleJunit {
	
	WebDriver driver = new ChromeDriver();
	WebDriverWait d = new WebDriverWait(driver,5);
	
	@BeforeClass
	public static void create_login()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\1463387\\Documents\\tools\\chromedriver_win32\\chromedriver.exe");
		
	}
	
	
	@After
	public void close__login()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	
	
	@Test
	public void test_ultimatix_login()
	{
		driver.get("https://auth.ultimatix.net/utxLogin");
		driver.findElement(By.id("USER")).sendKeys("1463387");
		driver.findElement(By.id("PASSWORD")).sendKeys("Maryn1993*");
		driver.findElement(By.id("login_button")).click();
		
		
	}
	
	@Test 
	public void test_udemy_login()
	{
		driver.get("https://www.udemy.com/");
		
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div[1]/div[4]/div[4]/require-auth/div")));
		driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div[1]/div[4]/div[4]/require-auth/div")).click();
		
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\'id_email\']")));
		driver.findElement(By.xpath("//*[@id=\"id_email\"]")).sendKeys("rub_ca@hotmail.com");
		
		driver.findElement(By.id("id_password")).sendKeys("holajulioxd");
		driver.findElement(By.id("submit-id-submit")).click();
	}
	
	
	
	

}
