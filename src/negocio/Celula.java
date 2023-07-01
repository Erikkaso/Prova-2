package negocio;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Celula implements ActionListener {
	public int posicaoX;
	public int posicaoY;
	public int id;
	public JButton botaoCelula;
	public Plano plano;
	public Robo robo;
	public Robo auxiliar;
	public boolean target;
//	public Aluno aluno;
//	public Bug bug;

	public Celula(int id, int x, int y, JButton b, Robo robo, Plano p) {
		posicaoX = x;
		posicaoY = y;
		this.id = id;
		this.botaoCelula = b;
		this.robo = robo;
		this.plano = p;

		target = false;
		botaoCelula.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.botaoCelula) {
			try {
				if(this.target == true) {
					this.robo = auxiliar;
					this.botaoCelula.setIcon(robo.icone);
					this.target = false;
				}
			} catch (Exception NullPointerException) {
				System.out.println("robo vazio");
			}
		}
	}

	public void marcarArea(Robo aux) {
		if(aux == plano.listaRobo.get(1) && aux == this.robo) {
			for (Celula celula : plano.listaCelulas) {
				if (((celula.posicaoY == (this.posicaoY - 1) || celula.posicaoY == (this.posicaoY - 2))
						|| (celula.posicaoY == (this.posicaoY + 1) || celula.posicaoY == (this.posicaoY + 2)))
						&& celula.posicaoX == this.posicaoX) {
					celula.target = true;
					celula.botaoCelula.setBackground(Color.red);
				}
			}
		}
		if (aux == plano.listaRobo.get(0) && aux == this.robo) {
			for (Celula celula : plano.listaCelulas) {
				if (celula.posicaoX == this.posicaoX && celula.posicaoY != this.posicaoY) {
					celula.target = true;
					celula.botaoCelula.setBackground(Color.red);
				}
			}
		}
		this.auxiliar = aux;
	}
}
