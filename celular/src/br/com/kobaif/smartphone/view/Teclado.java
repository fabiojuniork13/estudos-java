package br.com.kobaif.smartphone.view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.kobaif.smartphone.model.Memoria;

public class Teclado extends JPanel implements ActionListener {

	static boolean ativarBotao = false;
	
	public Teclado() {
		
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		setLayout(layout);
		
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		
		//Linha 1
		c.gridwidth = 1;
		adicionarBotao("7", Color.WHITE, c, 0, 0);
		adicionarBotao("8", Color.WHITE, c, 1, 0);
		adicionarBotao("9", Color.WHITE, c, 2, 0);
		
		//Linha 2
		adicionarBotao("4", Color.WHITE, c, 0, 1);
		adicionarBotao("5", Color.WHITE, c, 1, 1);
		adicionarBotao("6", Color.WHITE, c, 2, 1);
		
		//Linha 3
		adicionarBotao("1", Color.WHITE, c, 0, 2);
		adicionarBotao("2", Color.WHITE, c, 1, 2);
		adicionarBotao("3", Color.WHITE, c, 2, 2);
		
		//Linha 4
		adicionarBotao("*", Color.WHITE, c, 0, 3);
		adicionarBotao("0", Color.WHITE, c, 1, 3);
		adicionarBotao("#", Color.WHITE, c, 2, 3);
		
		//Linha 5
		c.gridwidth = 2;
		adicionarBotao("CALL", Color.GREEN, c, 0, 4);
		c.gridwidth = 1;
		adicionarBotao("<-", Color.WHITE, c, 2, 4);
		
	}

	private void adicionarBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		
		c.gridx = x;
		c.gridy = y;
		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao, c);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton botao = (JButton) e.getSource();
		Memoria.getInstancia().processarComando(botao.getText());
	}

}
