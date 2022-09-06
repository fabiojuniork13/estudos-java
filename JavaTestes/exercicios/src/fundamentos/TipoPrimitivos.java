package fundamentos;

public class TipoPrimitivos {

	public static void main(String[] args) {
		//Informações de funcionario
		
		//Tipos númericos inteiros
		byte  anosDeEmpresa = 23;
		short numeroDeVoos = 32767;
		int id = 1234;
		long pontosAcumulados = 4_432_567_123L;
		
		//Tipos numéricos reais
		float salario = 11_331.44F;
		double vendasAcumuladas = 2_997_789_103.01;
		
		//Tipos booleano;
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'A';
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numeros de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.err.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}

}
