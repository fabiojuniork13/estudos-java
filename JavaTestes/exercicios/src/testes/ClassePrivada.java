package testes;

public class ClassePrivada {
	
	private boolean condicao = false;

	public boolean isCondicao() {
		return condicao;
	}

	public void setCondicao(boolean condicao) {
		this.condicao = condicao;
	}
	
	void modificador() {
		this.condicao = true;
	}
	
	public boolean coletaCondicao() {
		return condicao;
	}

}
