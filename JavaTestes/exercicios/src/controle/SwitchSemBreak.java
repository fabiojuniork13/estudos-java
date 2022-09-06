package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o catar preta");
		case "marrom":
			System.out.println("Sei o catar marrom");
		case "roxa":
			System.out.println("Sei o catar roxa");
		case "verde":
			System.out.println("Sei o catar verde");
		case "vemelha":
			System.out.println("Sei o catar vemelha");
		default:
			System.out.println("Não sei de nada.");
		}
		
	}
	
}
