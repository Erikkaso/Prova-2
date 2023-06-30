package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import negocio.Andador;
import negocio.Jogador;
import negocio.Plano;
import negocio.Robo;

public class JanelaJogo extends JFrame implements ActionListener {
	public Jogador jogador;
	public JComboBox opcoesBox;
	public PainelJogo painelJogo;

	public JanelaJogo() {
		painelJogo = new PainelJogo();
		this.setSize(800, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("ILHA JAVA");
		this.setResizable(false);

		JPanel painel2 = new JPanel(new BorderLayout());

		//// combobox
		opcoesBox = new JComboBox();
		opcoesBox.setModel(criarImagens());
		opcoesBox.setPreferredSize(new Dimension(100, 100));
		opcoesBox.addActionListener(this);
		////

		painel2.add(opcoesBox);

		this.add(painelJogo, BorderLayout.CENTER);
		this.add(new PainelOpcoes(this), BorderLayout.EAST);
		this.add(painel2, BorderLayout.SOUTH);
	}

	private DefaultComboBoxModel<Icon> criarImagens() {

		DefaultComboBoxModel<Icon> img = new DefaultComboBoxModel<Icon>();
		for (Robo robo : painelJogo.plano.listaRobo) {
			img.addElement(robo.icone);
		}
		return img;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == opcoesBox) {
			
			for (Robo robo : painelJogo.plano.listaRobo) {
				if (opcoesBox.getSelectedItem() == robo.icone)
					painelJogo.plano.celulaRecebeRobo(robo);
			}
		}

	}
}
