package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int contadorDeNotas = 0;
		double recebeNota = 0;
		double total = 0;
		double media;
		
		while(recebeNota != -1) {
				
			System.out.printf("Digite a nota: ");
			recebeNota = entrada.nextInt();
			
			if(recebeNota >= 0 && recebeNota <= 10) {
				total += recebeNota;
				contadorDeNotas++;
			} else {
				boolean chaveDeControle = true;

				while(chaveDeControle && recebeNota != -1) {
					System.out.printf("Digite uma nota válida: ");
					recebeNota = entrada.nextInt();
					if(recebeNota >= 0 && recebeNota <= 10) {
						total += recebeNota;
						contadorDeNotas++;
						chaveDeControle = false;
					} 
				}
			}
		}
		
		System.out.printf("Total: %.2f\n", total);
		System.out.printf("Total de notas: %d\n", contadorDeNotas);
		System.out.printf("Media das notas: %.2f\n", total/contadorDeNotas);
		
		entrada.close();
	}

}
