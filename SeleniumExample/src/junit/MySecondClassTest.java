package junit;

 
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySecondClassTest {

	@Test
	public void mySecondMethod()
	{
		System.out.println("Hola soy el segundo metodo de la segunda clasee");

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\1463387\\Documents\\tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
	}

	@Test		
	public void createAndSetName() {					
		Value v1 = new Value();					

		v1.setValor("Y");					

		String expected = "Y";					
		String actual = v1.getValor();					

		Assert.assertEquals(expected, actual);					
		System.out.println("Suite Test 1 is successful " + actual);							
	}	



}
