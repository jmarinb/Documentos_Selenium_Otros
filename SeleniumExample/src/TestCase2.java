import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) {

		//Crear el objeto del driver para el navegador de firefox

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\1463387\\Documents\\tools\\geckodriver-v0.19.1-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.com");

		System.out.println(driver.getTitle());
	}

}
