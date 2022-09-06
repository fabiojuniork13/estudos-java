package br.com.kobaif.smartphone.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Botao extends JButton {

	public Botao(String texto, Color cor) {
		setText(texto);
		setOpaque(true);
		setBackground(cor);
		setFont(new Font("courier", Font.PLAIN, 25));
		setForeground(Color.BLACK);
		setBorder(BorderFactory.createLineBorder(Color.WHITE));
	}
	
}
