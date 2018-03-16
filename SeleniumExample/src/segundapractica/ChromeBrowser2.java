package segundapractica;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser2 {
	
	//------------------------		busqueda de elementos utilizando xpath--------------------------------------
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\1463387\\Documents\\tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mitelcel.com/mitelcel/login");// url del navegador
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("3312476023");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("holamundo");
		driver.findElement(By.xpath("//*[@id='btn-login']")).click();
		
	}

}
