package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno princepe"); //retorna false
		livros.push("Don Quixote"); //retorna exceção
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());

		System.out.println(livros.poll());
		System.out.println(livros.remove());
		
		livros.size();
		livros.clear();
		livros.contains("");
		livros.isEmpty();
		
		for (String livrosRecebido : livros) {
			System.out.println(livrosRecebido);
		}
	}
	
}
