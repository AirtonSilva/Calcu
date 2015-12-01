import java.rmi.Naming; 

public class CalculadoraServidor {
	
	public CalculadoraServidor() {
	   
	   try { 
    	
    	Airton_Calculator calc = new CalculadoraImpl(); 
        Naming.rebind("rmi://jaca.ime.usp.br:1099/ CalculatorService", calc);

	   }
	   
	   catch (Exception e) {
    	
		   System.out.println("O erro foi: "+ e);
	   
	   }

   } 

   public static void main(String args[]) {
	   
	   new CalculadoraServidor();

   }

 }
