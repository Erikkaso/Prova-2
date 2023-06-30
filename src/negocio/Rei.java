package negocio;

import java.util.Random;

import javax.swing.ImageIcon;

public class Rei extends Robo {
	Random gerador = new Random();
	int aleatorio = 0;

	public Rei(int id, String nome, int posicaox, int posicaoy, Plano plano, ImageIcon icone) {
		super(id, nome, posicaox, posicaoy, plano, 0, icone);
	}
}