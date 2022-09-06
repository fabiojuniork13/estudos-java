package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite o dia da semana: ");
		String diaDaSemana = entrada.nextLine();
		
		if(diaDaSemana.toLowerCase().equalsIgnoreCase("domingo")) System.out.printf("O dia digitado é %s: 1", diaDaSemana);
		if(diaDaSemana.toLowerCase().equalsIgnoreCase("segunda")) System.out.printf("O dia digitado é %s: 2", diaDaSemana);
		if(diaDaSemana.toLowerCase().equalsIgnoreCase("terça")) System.out.printf("O dia digitado é %s: 3", diaDaSemana);
		if(diaDaSemana.toLowerCase().equalsIgnoreCase("quarta")) System.out.printf("O dia digitado é %s: 4", diaDaSemana);
		if(diaDaSemana.toLowerCase().equalsIgnoreCase("quinta")) System.out.printf("O dia digitado é %s: 5", diaDaSemana);
		if(diaDaSemana.toLowerCase().equalsIgnoreCase("sexta")) System.out.printf("O dia digitado é %s: 6", diaDaSemana);
		if(diaDaSemana.toLowerCase().equalsIgnoreCase("sabado")) System.out.printf("O dia digitado é %s: 7", diaDaSemana);
		
		entrada.close();
		
	}
	
}
