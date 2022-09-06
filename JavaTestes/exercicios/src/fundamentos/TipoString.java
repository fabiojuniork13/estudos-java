package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2));

		String s = "Boa tarde";
		s = s.toUpperCase();
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("boa"));
		System.out.println(s.endsWith("dia"));
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.123;
		
		System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + " idade: " + salario + "\n \n");
		
		String frase = String.format("O senhor tem %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		
	}
	
}
