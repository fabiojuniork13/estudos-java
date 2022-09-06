package br.com.kobaif.smartphone.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Celular extends JFrame {

	public Celular() {
		
		organizarLayout();
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(232, 322);
		setLocationRelativeTo(null);
	}
	
	private void organizarLayout() {
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60));
		add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new Celular();
	}
	
}
