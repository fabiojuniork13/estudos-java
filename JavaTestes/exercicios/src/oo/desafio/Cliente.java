package oo.desafio;

import java.util.ArrayList;

public class Cliente {

	String nome;
	ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente (String nome) {
		this.nome = nome;
	}
	
	double getValorTotalCompras() {
		double valorTotal = 0;
		for (Compra compra : compras) {
			valorTotal += compra.getValorTotal();
		}
		return valorTotal;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
}
