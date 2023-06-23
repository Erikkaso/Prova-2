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

public class JanelaJogo extends JFrame implements ActionListener{
	public Jogador jogador;
	public JComboBox opcoesBox;
	
	public JanelaJogo() {
		//Andador a = new Andador(1, "Andador", 1, 8, null);
		this.setSize(800, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("ILHA JAVA");
		this.setResizable(false);
		
	JPanel painel2 = new JPanel(new BorderLayout());
	
	opcoesBox = new JComboBox();
	opcoesBox.setModel(criarImagens());
	opcoesBox.setPreferredSize(new Dimension(100,100));
	opcoesBox.addActionListener(this);
	
	painel2.add(opcoesBox);
	
	this.add(new PainelJogo(), BorderLayout.CENTER);
	this.add(new PainelOpcoes(this), BorderLayout.EAST);
	this.add(painel2, BorderLayout.SOUTH);
	}
	
	private DefaultComboBoxModel<Icon> criarImagens() {
		
		DefaultComboBoxModel<Icon> img = new DefaultComboBoxModel<Icon>();
		img.addElement(new ImageIcon("imagens/andador.png"));
		img.addElement(new ImageIcon("imagens/peao.png"));
		img.addElement(new ImageIcon("imagens/torre.png"));
		img.addElement(new ImageIcon("imagens/bispo.png"));
		img.addElement(new ImageIcon("imagens/cavalo.png"));
		img.addElement(new ImageIcon("imagens/rei.png"));
		img.addElement(new ImageIcon("imagens/rainha.png"));
		
		return img;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == opcoesBox)
			System.out.println(opcoesBox.getSelectedItem());
	}
}
