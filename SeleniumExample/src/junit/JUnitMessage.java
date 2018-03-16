package junit;

//ejercicio complemento para checar el funcionamiento de @Test(Expected)

public class JUnitMessage {
	private String message;

	public JUnitMessage(String message) {
		this.message = message;
	}

	public void printMessage(){

		System.out.println(message); 
		int divide=1/0;

	}

	public String printHiMessage(){ 

		message="Hi!" + message;

		System.out.println(message);

		return message;
	}


}
