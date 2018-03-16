package junit;

//este test runner lo utilizamos para correr casi todas las practicas aqui en este paquete, correrlo como programa en java

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {

		//corre la clase de test suite con junit
		//Result result = JUnitCore.runClasses(TestJUnit.class);	//corre el test suite con junit
		// Result result = JUnitCore.runClasses(ErrorCollectorExample.class);  //corre el recolector de errores de junit
		Result result = JUnitCore.runClasses(AritmeticaTest.class);  //corre el testing con parametros
		
		for (Failure failure : result.getFailures()) {							

			System.out.println(failure.toString());					
		}		

		System.out.println(result.wasSuccessful());					
	}		

}
