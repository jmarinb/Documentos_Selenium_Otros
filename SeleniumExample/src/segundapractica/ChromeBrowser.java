package segundapractica;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\1463387\\Documents\\tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mitelcel.com/mitelcel/login");// url del navegador
		driver.findElement(By.id("username")).sendKeys("3312456987");
		driver.findElement(By.id("pass")).sendKeys("holamundo");
		driver.findElement(By.linkText("Olvidé mi contraseña")).click();

	}

}
