package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o numero 1:");
		double numero1 = entrada.nextDouble();

		System.out.println("Digite o numero 2:");
		double numero2 = entrada.nextDouble();
		
		System.out.println("Qual é a operação?");
		String operacao = entrada.next();
		
		System.out.println(operacao.equals("+") ? numero1 + numero2 
				: operacao.equals("-") ? numero1 - numero2
						: operacao.equals("*") ? numero1 * numero2 
								: operacao.equals("/") ? numero1 / numero2
										: operacao.equals("%") ? numero1 % numero2 : false);
		
		entrada.close();
	}
	
}
