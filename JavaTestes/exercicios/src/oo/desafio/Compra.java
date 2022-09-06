package oo.desafio;

import java.util.ArrayList;

public class Compra {

	final ArrayList<Item> itens = new ArrayList<Item>();
	
	double getValorTotal() {
		double valorTotal = 0;
		for(Item item : itens) {
			valorTotal += item.calculaValorTotal();
		}
		return valorTotal;
	}
	
	void adicionarItem(Item item) {
		this.itens.add(item);
	}
	
}
