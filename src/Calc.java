import java.util.Scanner;
import java.lang.Math.*;

public class Calc {

	public static void main(String[] args){
		
		Scanner key = new Scanner (System.in);
		
		float a, b;
		String op;
		
		System.out.println("Calculadora comum\n\nInforme um valor: ");
		a = key.nextFloat();
		
		System.out.println("Escolha a operação (+,-,*,/): ");
		op = key.next();
		
		System.out.println("Informe um valor: ");
		b = key.nextFloat();
		
		switch (op){
		
			case "+": System.out.println(a+b);
					break;
		
			case "-": System.out.println(a-b);
					break;
		
			case "*": System.out.println(a*b);
					break;
		
			case "/": System.out.println(a/b);
					break;
					
			default: System.out.println("Inválido! Favor inserir operador e dados corretamente!");
		
		}

	}

}