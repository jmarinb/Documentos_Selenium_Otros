package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TercerEjemplo {
	
	@Test
	public void LoginCarLoan()
	{
		System.out.println("login web");
	}
	
	@Parameters({"URL"})
	@Test
	public void MovilLoginCarLoan(String urlvalor)
	{
		System.out.println("movil login bye");
		System.out.println(urlvalor);
	}
	
	
	@Test
	public void APILoginCarLoan()
	{
		System.out.println("API login comienza");
	}
	
	
	@Test(groups= {"smoke"})
	public void APILogoutCarLoan()
	{
		System.out.println("API login comienza");
	}
	
	@Test
	public void APICloseCarLoan()
	{
		System.out.println("API login comienza");
	}
}


