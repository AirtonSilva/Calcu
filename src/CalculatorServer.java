import java.rmi.Naming; 

public class CalculatorServer {
	
	public CalculatorServer() {
	   
	   try { 
    	
    	Airton_Calculator calc = new CalculatorImpl(); 
        Naming.rebind("rmi://jaca.ime.usp.br:1099/ CalculatorService", calc);

	   }
	   
	   catch (Exception e) {
    	
		   System.out.println("O erro foi: "+ e);
	   
	   }

   } 

   public static void main(String args[]) {
	   
	   new CalculatorServer();

   }

 }
