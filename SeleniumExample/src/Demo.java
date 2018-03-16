import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\1463387\\Documents\\tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());		//valida si estas colocado en el correcto url
		
		//System.out.println(driver.getPageSource()); //muestra todo los recursos de la pagina
		
		driver.get("https://www.yahoo.com");
		//driver.navigate().back(); //regresa a la pagina anterior
		//driver.navigate().forward();//
		
		
	}

}
