package observer;

public class Namorada implements ChegadaAniversarianteObserver {

	@Override
	public void chegou(ChegadaAniversarianteEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Apagar as luzes");
		System.out.println("Fazer silencio");
		System.out.println("Supresa");
	}
	
}
