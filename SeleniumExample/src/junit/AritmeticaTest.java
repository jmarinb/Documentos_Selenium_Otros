package junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AritmeticaTest {
	
	private int primerNumero;
	private int segundoNumero;
	private int valorExperado;
	private  Aritmetica aritmetica;
	
	public AritmeticaTest(int primerNumero, int segundoNumero, int valorExperado) {
		
		this.primerNumero = primerNumero;
		this.segundoNumero = segundoNumero;
		this.valorExperado = valorExperado;
	}
	
	@Before
	public  void iniciar()
	{
		aritmetica = new Aritmetica();
	}
	
	@Parameterized.Parameters
	public static Collection  datos_entrada()
	{
		return Arrays.asList(new Object[][] {{1,2,3},{4,5,9},{10,20,30},{500,250,750},{50,20,70}});
	}
	
	@Test
	public void testing_suma()
	{
		System.out.println("la suma de los numeros es: "+valorExperado);
		assertEquals(valorExperado,aritmetica.suma(primerNumero, segundoNumero));
	}
	

}
