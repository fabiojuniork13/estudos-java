package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia, x"; 
		s = s.replace("x", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
	}
	
}
