package classe;

import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		
//		Produto p1 = new Produto("Notebook", 4354.56, 025);
		
		Produto p1 = new Produto();
		p1.nome = "Caneta Preta";
		p1.preco = 12.56;

//		System.out.println(p1.nome);
		System.out.println(p1.nome);
		
		double precoFinal = p1.precoComDesconto();
		System.out.println(precoFinal);
		
		Produto.desconto = 0.50;
		
		double precoFinal2 = p1.precoComDesconto();
		System.out.println(precoFinal2);
		
		
	}
	
}
