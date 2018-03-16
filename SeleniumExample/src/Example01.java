import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example01 {

	public static void main(String[] args) {
		

		//ultimatix_login();
		udemy_login();


	}



	static void ultimatix_login()

	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\1463387\\Documents\\tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://auth.ultimatix.net/utxLogin");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.id("USER")).sendKeys("1463387");
		driver.findElement(By.id("PASSWORD")).sendKeys("Maryn1993*");
		driver.findElement(By.id("login_button")).click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();	
	}
	/*-------------------------------------------------------------------------------------------*/

	static void udemy_login()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\1463387\\Documents\\tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);   // implicito 
		
		WebDriverWait d = new WebDriverWait(driver,5);			//explicito

		driver.get("https://www.udemy.com/");

		
		/*try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div[1]/div[4]/div[4]/require-auth/div")));
		driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[1]/div[2]/div[1]/div[4]/div[4]/require-auth/div")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"id_email\"]")).sendKeys("rub_ca@hotmail.com");
		driver.findElement(By.id("id_password")).sendKeys("holajulioxd");
		driver.findElement(By.id("submit-id-submit")).click();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//*[@id=\"es\"]/div[1]/div[2]/div[1]/div[4]/div[2]/div/div[1]/a")).click();

		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();	
	}
}
