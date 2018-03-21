package test;

import org.testng.annotations.Test;

public class CuartoEjemplo {
	
	
	@Test
	public void LoginHomeCarLoan()
	{
		System.out.println("login Home web");
	}
	

	@Test
	public void MovilLoginHomeCarLoan()
	{
		System.out.println("movil Home login bye");
	}
	
	
	@Test(groups= {"smoke"})
	public void LoginAPIHomeCarLoan()
	{
		System.out.println("API login Home comienza");
	}

}
