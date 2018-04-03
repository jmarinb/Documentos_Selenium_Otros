import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SincroniasTestNG {

	@Test
	public void ejemplo1_sincronizacion() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\1463387\\Documents\\tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.expedia.mx");
		driver.findElement(By.id("tab-flight-tab-hp")).click();
		driver.findElement(By.id("flight-type-one-way-label-hp-flight")).click();
		driver.findElement(By.xpath("//*[@id=\"flight-origin-hp-flight\"]")).sendKeys("Guadalajara");
		driver.findElement(By.xpath("//*[@id=\"flight-destination-hp-flight\"]")).sendKeys("Los Angeles");
		driver.findElement(By.id("flight-departing-single-hp-flight")).sendKeys("15/06/2018");
		driver.findElement(By.id("flight-departing-single-hp-flight")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"flight-module-2018-06-15t15:55:00-05:00-coach-gdl-lax-vb-2906_\"]/div/div[1]/div[2]/div/div[2]/button")).click();		
		
		
	}
}
