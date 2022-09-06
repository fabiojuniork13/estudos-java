package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class TesteCarro {

	public static void main(String[] args) {
		
		Civic civic = new Civic();
		System.out.println(civic.velocidadeAtual);
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.frear();
		System.out.println(civic.velocidadeAtual);
		
		Ferrari ferrari = new Ferrari();
		System.out.println(ferrari.velocidadeAtual);
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari.velocidadeAtual);
		
	}

}
