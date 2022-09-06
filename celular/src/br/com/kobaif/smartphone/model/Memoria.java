package br.com.kobaif.smartphone.model;

import java.util.ArrayList;
import java.util.List;

import br.com.kobaif.smartphone.view.Display;

public class Memoria {
	
	private enum TipoComando {
		APAGAR, NUMERO;
	};
	
	private static final Memoria instancia = new Memoria();
	
	private String texto = "";
	
	private Memoria() {
		
	}
	
	private final List<MemoriaObservador> observadores = new ArrayList<>();

	public static Memoria getInstancia() {
		return instancia;
	}

	public String getTexto() {
		return texto;
	}

	public void processarComando(String text) {
		
		TipoComando tipoComando = detectarTipoComando(text);
		
		if(tipoComando == TipoComando.NUMERO) {
			this.texto += text;
		} else if(tipoComando == TipoComando.APAGAR) {
			this.texto = this.texto.replaceFirst(".$", "");
		}
		
		observadores.forEach(o -> o.valorAlterado(getTexto()));
	}

	private TipoComando detectarTipoComando(String text) {
		
		if("<-".equals(text)) {
			return TipoComando.APAGAR;
		} else {
			return TipoComando.NUMERO;
		}
	}

	public void adicionarObservador(Display display) {
		observadores.add(display);
	}

}
