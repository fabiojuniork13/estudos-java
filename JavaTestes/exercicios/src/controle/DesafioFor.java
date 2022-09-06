package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		String valor = "#";
		boolean repete = true;
		
		for(;;) {
			
			System.out.println(valor);
			valor += "#";
			
			if(valor.equals("######")) break;
			
		}
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
		
	}

}
