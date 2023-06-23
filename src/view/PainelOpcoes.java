package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PainelOpcoes  extends JPanel{ 
	
	JanelaJogo janelaJogo;
	Botao sairDoJogo;
	
	public PainelOpcoes(JanelaJogo janelaJogo){
		this.janelaJogo = janelaJogo;
		criarBotoes();
		this.setLayout(new GridLayout(3,1));
		this.setBackground(Color.ORANGE);
	}

	private void criarBotoes() {
		Botao verificar = new Botao("Verificar", Color.gray);
	//	verificar.addActionListener(this);
	
		Botao proximaJogada = new Botao("Próxima Jogada", Color.gray);
	//	proximaJogada.addActionListener(this);
		
		sairDoJogo = new Botao("Sair do Jogo", Color.gray);
		sairDoJogo.addActionListener(new FecharJogo(janelaJogo));
		

		this.add(verificar);
		this.add(proximaJogada);
		this.add(sairDoJogo);
		
	}
	
	private class FecharJogo implements ActionListener {
		JanelaJogo janelaJogo;
		
		public FecharJogo(JanelaJogo janelaJogo){
			this.janelaJogo = janelaJogo;
		}
		
		public void actionPerformed(ActionEvent e) {
			this.janelaJogo.setVisible(false);
		}
	}
}
