package oo;

public class CompraTestes {

	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		
		c1.cliente = "Pedro";
		c1.itens.add(new Item("Caneta", 20, 7.45));
		c1.itens.add(new Item("Borracha", 12, 3.89));
		c1.itens.add(new Item("Caderno", 3, 18.79));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.obterValorTotal());
		
	}
	
}
