package oo.desafio_backup;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem(new Produto("Notebook", 1897), 2);

		Compra compra2 = new Compra();
		compra1.adicionarItem(new Produto("Impressora", 990), 1);

		Cliente cliente = new Cliente("Maria");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
	}
	
}
