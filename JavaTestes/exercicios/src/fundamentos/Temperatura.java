package fundamentos;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		//(Fº - 32) x 5/9 = ºC
		
		double entradaTeclado;
		final double ajuste = 32;
		final double fator = 5/9.0;
		double fahreheit = 86;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira o valor de Fº: ");
		entradaTeclado = teclado.nextDouble();
		
		System.out.println("A temperatura em ºC é: " + (entradaTeclado - ajuste) * fator);
		
	}
	
}
