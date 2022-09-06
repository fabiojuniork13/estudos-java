package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {

		System.out.print("Bom");
		System.out.print(" dia!\n");
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d, %d, %d, %d, %d", 1, 2, 3, 4, 5);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome :");
		String nome  = entrada.nextLine();
	
		entrada.close();
		
	}

}
