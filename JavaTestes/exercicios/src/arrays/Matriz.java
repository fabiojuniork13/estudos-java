package arrays;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantos alunos: ");
		int quantidadeDeAlunos = entrada.nextInt();
		
		System.out.println("Quantos notas por alunos: ");
		int quantidadeDeNotas = entrada.nextInt();

		double[][] notasPorAlunos = new double[quantidadeDeAlunos][quantidadeDeNotas];
		
		System.out.println();
		
		for(int i = 0; i < notasPorAlunos.length; i++) {
			for(int j = 0; j < notasPorAlunos[i].length; j++) {
				System.out.printf("Insira a %dª nota do %dº aluno: ", j+1, i+1);
				notasPorAlunos[i][j] = entrada.nextDouble();
				System.out.println();
			}
		}
		
		for(int i = 0; i < quantidadeDeAlunos; i++) {
			double total = 0;
			for(int j = 0; j < quantidadeDeNotas; j++) {
				total += notasPorAlunos[i][j];
			}
			double media = total / quantidadeDeNotas;
			System.out.printf("A media do %dº aluno é: %.2f", i+1, media);
			System.out.println();
		}
		
		entrada.close();
		
	}
	
}
