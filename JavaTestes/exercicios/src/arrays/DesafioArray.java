package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de notas que deseja calcular: ");
		int quantidadeDeNotas = entrada.nextInt();
		
		System.out.println();
		
		double[] notas = new double[quantidadeDeNotas];
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Informe o valor da %dª nota: ", i+1);
			notas[i] = entrada.nextDouble();
			System.out.println();
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		System.out.println("O total calculado é: " + total);
		System.out.println("A media do aluno é: " + total / notas.length);
		
		entrada.close();
		
	}

}
