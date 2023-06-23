package negocio;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Plano {
	Andador a = new Andador(1, "Andador", 1, 8, this,new ImageIcon("imagens/andador.png"));
	public ArrayList<Celula> listaCelulas;

	public Plano() {
		listaCelulas = new ArrayList<Celula>();

		int contador = 1;
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				JButton b = new JButton();
				b.setPreferredSize(new Dimension(70, 70));

				if (i % 2 != 0) {
					if (j % 2 == 0)
						b.setBackground(Color.BLUE);
				} else {
					if (j % 2 != 0)
						b.setBackground(Color.BLUE);
				}
				Celula celula = new Celula(contador, j, i, b, a);
				listaCelulas.add(celula);
				contador++;
			}
		}
		//listaCelulas.get(1).robo = a;
	}
}
