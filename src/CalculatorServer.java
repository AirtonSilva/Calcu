import java.rmi.Naming;

public class CalculatorServer {
	public CalculatorServer() {
		try {
			Airton_Calculator c = new CalculatorImpl();
			Naming.rebind("Airton_Calculator", c);
		} catch (Exception e) {
			System.out.println("Trouble: " + e);
		}
	}

	public static void main(String args[]) {
		new CalculatorServer();
	}
}