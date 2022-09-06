package oo.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("caneta", 2.5);
		Produto p2 = new Produto("barco", 1);
		Produto p3 = new Produto("maca", 2.1);
		Produto p4 = new Produto("bucha", 3);
		
		System.out.println(p1.toString());
		
		Item t1 = new Item(p1, 2);
		Item t2 = new Item(p2, 2);
		Item t3 = new Item(p3, 2);
		Item t4 = new Item(p4, 2);
	
		System.out.println(t1.toString());
		
		Compra c1 = new Compra();
		c1.adicionarItem(t1);
		c1.adicionarItem(t4);
		c1.adicionarItem(t2);
		
		
		Cliente cli1 = new Cliente("Fabio");
		cli1.adicionarCompra(c1);
		
		System.out.println(cli1.getValorTotalCompras());
		
	}
	
}
