package negocio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Celula implements ActionListener {
	public int posicaoX;
	public int posicaoY;
	public int id;
	public JButton botaoCelula;
	public Robo robo;
//	public Robo robo;	
//	public Aluno aluno;
//	public Bug bug;
	
	public Celula(int id, int x, int y, JButton b, Robo robo) {
		posicaoX = x;
		posicaoY = y;
		this.id = id;
		this.botaoCelula = b;
		this.robo = robo;
		botaoCelula.addActionListener(this);
	}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == this.botaoCelula)
		botaoCelula.setIcon(robo.icone);
		//System.out.println("id:"+id +" X:"+posicaoX+" Y:"+posicaoY);
	
}
}
