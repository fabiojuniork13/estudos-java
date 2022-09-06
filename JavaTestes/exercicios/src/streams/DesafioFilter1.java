package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter1 {

	public static void main(String[] args) {
		
		Carros c1 = new Carros("i30", "Hyundai", 2.0);
		Carros c2 = new Carros("i30", "Hyundai", 1.8);
		Carros c3 = new Carros("Marea", "Fiat", 2.0);
		Carros c4 = new Carros("Onix", "Chevrolet", 1.0);
		Carros c5 = new Carros("Fusion", "Ford", 2.5);
		
		List<Carros> carro = Arrays.asList(c1, c2, c3, c4, c5);
		
		carro.stream()
		.filter(c -> c.motor >= 1.5)
		.filter(c -> c.marca == "Hyundai")
		.map(c -> "Carro: " + c.nome + " Motor: " + c.motor + " Marca: " + c.marca)
		.forEach(System.out::println);
		
	}

}
