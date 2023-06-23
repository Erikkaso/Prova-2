package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import negocio.Jogador;

public class MostrarJogo implements ActionListener{

	private JanelaPrincipal frame;
	public MostrarJogo(JanelaPrincipal frame) {
		
		this.frame = frame;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String nome = frame.painelInicial.caixaNome.getText();
		frame.j.jogador = new Jogador(nome);
		frame.j.setVisible(true);
		frame.setVisible(false);
	}

}

