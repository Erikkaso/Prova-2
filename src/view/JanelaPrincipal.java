package view;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import negocio.Jogador;


public class JanelaPrincipal  extends JFrame{

	public PainelInicial painelInicial;
	public JanelaJogo j;
	
	public JanelaPrincipal() {
		
		j = new JanelaJogo();
		j.setVisible(false);
		painelInicial = new PainelInicial(this);
		this.setSize(800, 800);
		this.setLocationRelativeTo(null);
		this.setTitle("BEM VINDO");
	
		painelInicial.setVisible(true);
		
		JPanel painelGenerico = new JPanel();
		painelGenerico.add(painelInicial);
		painelGenerico.setBounds(getHeight()/2, getWidth()/2, 100, 100);
		this.add(painelGenerico);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}
