package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 21;
		d1.mes = 07;
		d1.ano = 1995;
		
		System.out.println(d1.obterDataFormadata());
		
		Data d2 = new Data();
		
		System.out.println(d2.obterDataFormadata());
	
		
	}
}
