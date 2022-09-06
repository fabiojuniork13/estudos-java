package br.com.kobaif.smartphone.view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.kobaif.smartphone.model.Memoria;
import br.com.kobaif.smartphone.model.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {

	private final JLabel label = new JLabel();
	
	public Display() {
		Memoria.getInstancia().adicionarObservador(this);
		
		setBackground(new Color(46, 49, 50));
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 25));
		
		add(label);
	}
	
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
	
}
