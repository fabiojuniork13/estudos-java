package lambdas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Function<Produto, Double> calculoComDesconto = 
				prod -> (prod.preco * (1 - prod.desconto));
				
		UnaryOperator<Double> imposto = calculo -> calculo >= 2500 ? calculo * 1.085 : calculo;
		
		UnaryOperator<Double> frete = prod -> prod >= 3000 ? prod + 100 : prod + 50;
		
		Function<Double, String> formatar = preco -> {
			DecimalFormat f = new DecimalFormat("#.##");
			return f.format(preco);
		};
		
		Function<String, String> precoEmDinheiro = preco -> ("R$" + preco).replace(".", ",");
			
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		String precoFinal = (calculoComDesconto
				.andThen(imposto)
				.andThen(frete)
				.andThen(formatar)
				.andThen(precoEmDinheiro)
				.apply(p));
		
		System.out.println(precoFinal);
	}
}
