package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Ana"); //retorna false
		fila.offer("Bia"); //retorna exceção
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek());  //retorna null
		System.out.println(fila.element()); //retorna exceção
		
		System.out.println(fila.poll()); //retorno null
		System.out.println(fila.remove()); //retorno exceção
		
	}
	
}
