package view;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class Botao  extends JButton {

	public Botao(String nome, Color cor) {
		this.setText(nome);
		this.setBackground(cor);
	}
}
