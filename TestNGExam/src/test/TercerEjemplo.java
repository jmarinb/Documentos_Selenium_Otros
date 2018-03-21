package test;

import org.testng.annotations.Test;

public class TercerEjemplo {
	
	@Test
	public void LoginCarLoan()
	{
		System.out.println("login web");
	}
	

	@Test
	public void MovilLoginCarLoan()
	{
		System.out.println("movil login bye");
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


