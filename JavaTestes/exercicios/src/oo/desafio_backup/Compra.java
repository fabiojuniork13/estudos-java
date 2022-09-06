package oo.desafio_backup;

import java.util.ArrayList;

public class Compra {

	ArrayList<Item> itens = new ArrayList<Item>();
	
	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}
	
}
