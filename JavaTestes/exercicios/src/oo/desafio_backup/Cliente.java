package oo.desafio_backup;

import java.util.ArrayList;

public class Cliente {
	
	String nome;
	ArrayList<Compra> compras = new ArrayList<Compra>();
	
	int i = 0;
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compraAtual : compras) {
			total += compraAtual.obterValorTotal();
		}
		
		return total;
	}
	
}
