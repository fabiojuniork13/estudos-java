package mult;

public class TesteCod {

	public static String fizzBuzz(int i) {
		
		String concat = "";
		
		if (i % 3 == 0) {
			concat += "Fizz";
		}
		
		if (i % 5 == 0) {
			concat += "Buzz";
		}
		
		if(concat.isEmpty()) {
			concat = String.valueOf(i);
		}
		
		return concat;
	}
	
	public static void main(String[] args) {

		for(int i = 0; i < 30; i++) {
			System.out.println(fizzBuzz(i));
		}
	}
}
