package classe;

public class ValorNulo {

	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		String s2 = "";
		System.out.println(s1.concat("???"));
		
		if(s2 == null) {
			
			s2 = "ok";
			
		}
		
	}
}
