package testes;

import java.util.UUID;

public class testeRomdom {

	public static void main(String[] args) {
		
		String uuidTransacao = String.valueOf((Math.abs(UUID.randomUUID().getLeastSignificantBits())));
		
		System.out.println(uuidTransacao);
		
		int i = 0;
		while(i < 1) {
			System.out.println(Math.abs(UUID.randomUUID().getLeastSignificantBits()));
			i++;
		}
		
	}
	
}
