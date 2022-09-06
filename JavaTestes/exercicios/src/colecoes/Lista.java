package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Calors"));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
	}
	
}
