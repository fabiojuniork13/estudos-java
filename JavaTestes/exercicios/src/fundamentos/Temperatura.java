package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		//(F� - 32) x 5/9 = �C
		
		double entradaTeclado;
		final double ajuste = 32;
		final double fator = 5/9.0;
		double fahreheit = 86;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o valor de F�: ");
		entradaTeclado = teclado.nextDouble();
		
		System.out.println("A temperatura em �C �: " + (entradaTeclado - ajuste) * fator);
		
	}
	
}
