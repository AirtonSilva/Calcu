import java.*;
import java.rmi.Naming;

public class CalculatorCliente {
	
	public static void main (String[] args){
		
	try{
		
		Airton_Calculator servidor= (Airton_Calculator) Naming.lookup("rmi://ime.usp.br:2048/ServidorHello");
		
	}
		
	catch(Exception e){ }
	
	}
}
