package fundamentos;

import java.util.Scanner;

public class DesafioScanner {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String salario = null;
		
		System.out.println("Insira o primeiro salário: ");
		salario = teclado.next();
		double mes1 = Double.parseDouble(salario.replace(",", "."));
		
		System.out.println("Insira o segundo salário: ");
		salario = teclado.next();
		double mes2 = Double.parseDouble(salario.replace(",", "."));
		
		System.out.println("Insira o terceiro salário: ");
		salario = teclado.next();
		double mes3 = Double.parseDouble(salario.replace(",", "."));
		
		System.out.println((mes1 + mes2 + mes3) / 3);
		
		teclado.close();
		
	}
	
}
