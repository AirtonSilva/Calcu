import java.util.Scanner;

public class Sincronizar  implements Runnable{
	
	Scanner in = new Scanner(System.in);
	private int a, b;
	private String sinal;

	public void run(){
		
		this.read();
	}
	
	private synchronized void read(){
			
		this.a = in.nextInt();
		this.sinal = in.next();
		this.b = in.nextInt();	
	}
	
	public synchronized int calculate(){
		
		Calculadora c = new Calculadora();
		
		return c.calcular(a, sinal, b);
		
	}
}