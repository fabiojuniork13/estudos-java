package fundamentos.operadores;

public class DesafioLogico {

	public static void main(String[] args) {
		//trabalho na terça (V ou F)
		//trabalho na quinta (V ou F)

		 var trabalho1 = true;
		 var trabalho2 = true;
		 
		 var tv32 = trabalho1 ^ trabalho2;
		 System.out.println(tv32);
		 
		 var tv50 = trabalho1 && trabalho2;
		 System.out.println(tv50);
		 
		 var tomouSorvete = tv32 || tv50;
		 System.out.println(tomouSorvete);
		 
		 var maisSaude = tomouSorvete;
		 System.out.println(!maisSaude);
		 
	}
	
}
