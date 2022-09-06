package classe.Desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida();
		c1.nomeComida = "Arroz";
		c1.pesoComida = 0.126;
		
		Comida c2 = new Comida();
		c2.nomeComida = "Feijão";
		c2.pesoComida = 0.140;
		
		Comida c3 = new Comida();
		c3.nomeComida = "Carne";
		c3.pesoComida = 0.150;
		
		Comida c4 = new Comida();
		c4.nomeComida = "Legumes";
		c4.pesoComida = 0.200;
		
		Pessoa p1 = new Pessoa();
		p1.nomePessoa = "Fabio";
		p1.pesoPessoa = 74.0;
		
		System.out.printf("%s possui %s quilos.\n", p1.nomePessoa, p1.pesoPessoa);
		
		p1.comer(c1.pesoComida);
		System.out.printf("%s está com %s quilos.\n", p1.nomePessoa, p1.pesoPessoa);
		p1.comer(c2.pesoComida);
		System.out.printf("%s está com %s quilos.\n", p1.nomePessoa, p1.pesoPessoa);
		p1.comer(c3.pesoComida);
		System.out.printf("%s está com %s quilos.\n", p1.nomePessoa, p1.pesoPessoa);
		p1.comer(c4.pesoComida);
		System.out.printf("%s está com %s quilos.\n", p1.nomePessoa, p1.pesoPessoa);
		
		System.out.printf("Ao total, %s está com %s quilos.\n", p1.nomePessoa, p1.pesoPessoa);
		
	}

}
