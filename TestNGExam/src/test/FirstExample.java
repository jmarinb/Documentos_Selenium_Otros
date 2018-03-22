package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstExample {
	
		@Test(timeOut=5000)
		public void demo1()
		{
			System.out.println("hola mundo");
			
		}

		
		@Test(groups= {"smoke"})
		public void demo2()
		{
			System.out.println("que pasa aqui todo esta bien?");
		}
		
		
		@BeforeTest
		public void beforeDemo2()
		{
			System.out.println("se va ejecutar primero de todos los metodos de las clases o dentro del test");
		}
		
		@AfterTest
		public void afterDemo2()
		{
			System.out.println("se ejecutara al final de las clases despues de todos los metodos dentro de test ");
		}
}
