import java.io.*;
import java.util.Scanner;
import java.lang.Math.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner key = new Scanner (System.in);
		
		float a, b;
		String op;
		
		System.out.println("Calculadora comum\n\nInforme um valor: ");
		a = key.nextFloat();
		
		System.out.println("Escolha a operação (+,-,*,/): ");
		op = key.next();
		
		System.out.println("Informe um valor: ");
		b = key.nextFloat();
		
		try{
			PrintWriter arq = new PrintWriter("calculadora.txt");
			
			switch (op){
			
			case "+": {
				arq.println(a+b);
				arq.close();
				}break;
				
			case "-": {
				arq.println(a-b);
				arq.close();
				}break;
			case "*": {
				arq.println(a*b);
				arq.close();
				}break;
			case "/": {
				arq.println(a/b);
				arq.close();
				}break;
			}
			System.out.println("Arquivo salvo com sucesso!");
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("Arquivo não foi salvo!");
		}
	}
}//class
