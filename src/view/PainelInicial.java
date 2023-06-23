package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelInicial extends JPanel {

	JanelaPrincipal janela;
	JLabel nome;
	JTextField caixaNome;
	public PainelInicial(JanelaPrincipal janela) {
		this.janela = janela;
		cadastrarNome();
		this.setBackground(Color.gray);
	}

	private void cadastrarNome() {
		nome = new JLabel("Nome");
		caixaNome = new JTextField("Nome", 6);
		Botao b = new Botao("JOGAR", Color.CYAN);

		b.addActionListener(new MostrarJogo(janela));
		this.setLayout(new GridLayout(3,2));
		this.add(new JLabel("Informe o nome do Jogador:"));
		this.add(new JLabel());
		this.add(nome);
		this.add(caixaNome);
		this.add(new JLabel());
		this.add(b);

	}
}
