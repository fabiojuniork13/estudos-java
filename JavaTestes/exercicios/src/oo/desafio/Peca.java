package oo.desafio;

public class Peca implements Cloneable {
	
	String nome;
	String v;

	Peca(){
		
	}
	
	Peca(Peca p) {
		this.nome = p.nome;
		this.v = p.v;
	}
	
	public String getV() {
		return v;
	}

	public void setV(String v) {
		this.v = v;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public Peca clone() throws CloneNotSupportedException {
		return (Peca) super.clone();
	}
	
}
