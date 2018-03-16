import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase3 {

	public static void main(String[] args) {

		//Crear el objeto del driver para el navegador de explorer Edge

		System.setProperty("webdriver.ie.driver", "C:\\Users\\1463387\\Documents\\tools\\MicrosoftWebDriver.exe");

		WebDriver driver = new InternetExplorerDriver();

		driver.get("https://www.google.com");

		System.out.println(driver.getTitle());
	}

}
