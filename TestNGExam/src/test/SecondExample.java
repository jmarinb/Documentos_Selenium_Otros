package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SecondExample {
	
		@Test 
		public void demo1()
		{
			System.out.println("que onda");
		}
		
		@BeforeMethod
		public void beforemetodoDemo()
		{
			System.out.println("siempre antes de cada metodo en la clase 2");
		}
		
		@AfterMethod
		public void aftermetodoDemo()
		{
			System.out.println("siempre despues de cada metodo en la clase 2");
		}

		
		@Test(groups= {"smoke"})
		public void demo2()
		{
			System.out.println("Adios mundo");
		}
		
		
		@BeforeSuite
		public void beforeSuiteDemo()
		{
			System.out.println("yo soy el primero de todos aqui empezamos");
		}
		
		
		@AfterSuite
		public void AfterSuiteDemo()
		{
			System.out.println("yo soy el ultimo de todos las ejecuciones bye ");
		}
}
