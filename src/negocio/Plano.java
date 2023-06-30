package negocio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Plano {
	public ArrayList<Celula> listaCelulas;
	public ArrayList<Robo> listaRobo;

	public Plano() {
		listaRobo = new ArrayList<Robo>();
		listaCelulas = new ArrayList<Celula>();
		listaRobo.add(new Andador(1, "Andador", 1, 1, this, new ImageIcon("imagens/andador.png")));
		listaRobo.add(new Peao(2, "Peao", 1, 2, this, new ImageIcon("imagens/peao.png")));
		listaRobo.add(new Torre(3, "Torre", 1, 2, this, new ImageIcon("imagens/torre.png")));
		listaRobo.add(new Bispo(4, "Bispo", 1, 2, this, new ImageIcon("imagens/bispo.png")));
		listaRobo.add(new Cavalo(5, "Cavalo", 1, 2, this, new ImageIcon("imagens/cavalo.png")));
		listaRobo.add(new Rei(6, "Rei", 1, 2, this, new ImageIcon("imagens/rei.png")));
		listaRobo.add(new Rainha(7, "Rainha", 1, 2, this, new ImageIcon("imagens/rainha.png")));

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
				Celula celula = new Celula(contador, j, i, b, null, this);
				listaCelulas.add(celula);
				contador++;
			}
		}
		posicionarRobo();
	}

	public void posicionarRobo() {// coloca a posição inicial do robo
		Random gerador = new Random();
		int indice;
		for (Robo robo : listaRobo) {
			indice = gerador.nextInt(listaCelulas.size());

			while (listaCelulas.get(indice).robo != null) {
				indice = gerador.nextInt(listaRobo.size());
				System.out.println(indice);
			}
			
			listaCelulas.get(indice).robo = robo;
			listaCelulas.get(indice).botaoCelula.setIcon( resizeImage(robo));
		}
	}

	public void celulaRecebeRobo(Robo aux) {
		aux.icone = resizeImage(aux);
		for (int i = 0; i < listaCelulas.size(); i++) {
			listaCelulas.get(i).robo = aux;
			// System.out.println(aux +" " + i);
		}
	}

	public ImageIcon resizeImage(Robo aux) {
		ImageIcon icon = new ImageIcon(aux.icone.getDescription());

		Image image = icon.getImage();
		Image imageScale = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon iconScaled = new ImageIcon(imageScale);

		return iconScaled;
	}
}
