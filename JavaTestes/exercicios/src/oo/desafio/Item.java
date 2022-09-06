package oo.desafio;

public class Item {

	int quantidade;
	Produto produto;
	
	Item (Produto prod, int quantidade) {
		this.produto = prod;
		this.quantidade = quantidade;
	}
	
	public double calculaValorTotal() {
		return this.produto.preco * this.quantidade;
	}
	
	public String toString() {
		return this.produto.toString();
	}

}
