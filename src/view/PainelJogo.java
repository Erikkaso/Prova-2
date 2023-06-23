package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import negocio.Celula;
import negocio.Plano;

public class PainelJogo extends JPanel {
	
	Plano plano;
	public PainelJogo() {
		plano = new Plano();
		criarGrade();
		this.setBackground(Color.LIGHT_GRAY);
	}

	private void criarGrade() {	
		this.setLayout(new GridLayout(8, 8));// ajustar tamanho do painel
		
		for(int i=0; i<plano.listaCelulas.size();i++) {
			this.add(plano.listaCelulas.get(i).botaoCelula);
		}
	}
}
