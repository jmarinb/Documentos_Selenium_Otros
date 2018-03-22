package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleTestNGParameters {
	
	
	@Test(dataProvider = "getData")
	public void parametros1(String valor1, String valor2)
	{
		System.out.println("Aqui estan los valores del objeto");
		System.out.println(valor1);
		System.out.println(valor2);
		
	}
	
	
	@Test
	public void parametros2()
	{
		System.out.println("fin del test");
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		//3 tipos de parametros con valores de username y password
		Object[][] data = new Object[3][2];
		
		//1 set
		data [0][0] = "primerusername";
		data [0][1] = "primerpassword";
		//2 set
		data [1][0] = "segundousername";
		data [1][1] = "segundopassword";
		//3 set
		data [2][0] = "tercerusername";
		data [2][1] = "tercerpassword";
		
		return data;
		
	}

}
