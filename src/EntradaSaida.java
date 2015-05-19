import java.lang.*;
import java.util.Scanner;

public class EntradaSaida implements Runnable {

	public EntradaSaida() {
		
	}

	public void run() {
		
		float a = 0, b = 0;

		Processa calc = new Processa ();
		calc.soma(a, b);
		Processa calc1 = new Processa ();
		calc1.diminui(a, b);
		Processa calc2 = new Processa ();
		calc2.divide(a, b);
		Processa calc3 = new Processa ();
		calc3.multiplica(a, b);
		
		

	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		float a, b;
		String op;
		
		System.out.println ("Escolha um valor:\n");
		a = in.nextFloat();
		System.out.println ("Escolha um operador (+ - * /):\n");
		op = in.next();
		System.out.println ("Escolha um valor:\n");
		b = in.nextFloat();
		
		EntradaSaida objeto1 = new EntradaSaida ();
		objeto1.start();
		EntradaSaida objeto2 = new EntradaSaida ();
		objeto2.start();
		EntradaSaida objeto3 = new EntradaSaida ();
		objeto3.start();
		EntradaSaida objeto4 = new EntradaSaida ();
		objeto4.start();
		EntradaSaida objeto5 = new EntradaSaida ();
		objeto5.start();
		

	}

	private void start() {

		Object EntradaSaida = null;
		if (EntradaSaida == null) {
			EntradaSaida = new Thread(this, "EntradaSaida");
	         ((EntradaSaida) EntradaSaida).start();
	      }
		
	}

}
