import java.rmi.Naming;

public class CalculatorCliente {
	public static void main(String[] args) {
		try {
			Airton_Calculator c = (Airton_Calculator) Naming
					.lookup("AirtonCalculator");
			System.out.println(c.sub(4, 3));
			System.out.println(c.add(4, 5));
			System.out.println(c.mul(3, 6));
			System.out.println(c.div(9, 3));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}