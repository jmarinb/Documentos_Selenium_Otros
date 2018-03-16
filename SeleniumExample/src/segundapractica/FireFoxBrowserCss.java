package segundapractica;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireFoxBrowserCss {
	
	//------------------------		busqueda de elementos utilizando CSS--------------------------------------

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\1463387\\Documents\\tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.mitelcel.com/mitelcel/login");// url del navegador
		
		driver.findElement(By.cssSelector("#username.form-control")).sendKeys("3312476025");
		driver.findElement(By.cssSelector("input#pass.form-control")).sendKeys("holatodosfd");
		driver.findElement(By.cssSelector("#btn-login")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"box-msg-error\"]/div/span[2]")).getText());
		
		

	}

}
