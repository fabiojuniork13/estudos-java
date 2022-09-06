package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import com.sun.jdi.Value;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::print;
		Consumer<Object> println = System.out::println;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Function<Integer, String> converteEmBinario = i -> Integer.toBinaryString(i.intValue());
		UnaryOperator<String> reverteString = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> converteEmInteiro = i -> Integer.parseInt(i, 2);
		
		nums.stream()
		.map(converteEmBinario)
		.map(reverteString)
		.map(converteEmInteiro)
		.forEach(println);
		
		nums.stream()
		.map(Integer::toBinaryString)
		.map(reverteString)
		.map(converteEmInteiro)
		.forEach(println);
		
	}

}
