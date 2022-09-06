package fundamentos.operadores;

public class DesafioPotencia {

	public static void main(String[] args) {

		int primeiraExpressao = 6 * (3 + 2);
		double exponencial = Math.pow(primeiraExpressao, 2);
		double divisaoPrimeiraExpressao = 3 * 2;
		double resultadoPrimeiraExpressao = exponencial / divisaoPrimeiraExpressao; 
		
		System.out.println(resultadoPrimeiraExpressao);
		
		int segundaExpressao = (1 - 5) * (2 - 7);
		double divisaoSegundaExpressao = segundaExpressao / 2;
		double resultadoSegundaExpressao = Math.pow(divisaoSegundaExpressao, 2);
		
		System.out.println(resultadoSegundaExpressao);
		
		double resultadoParcial = Math.pow((resultadoPrimeiraExpressao - resultadoSegundaExpressao), 3);
		double resultadoTotal = resultadoParcial / Math.pow(10, 3);
		
		System.out.println(resultadoTotal);
		
		
	}

}
