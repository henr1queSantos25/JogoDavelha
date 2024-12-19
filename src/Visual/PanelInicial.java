package Visual;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;

public class PanelInicial extends JPanel{
	JLabel titulo;
	
	JLabel nomeJogador1;
	JTextField textJogador1;
	
	JLabel nomeJogador2;
	JTextField textJogador2;
	
	JButton botaoIniciar;
	
	public PanelInicial() {
		setLayout(null);
		
		this.add(getTitulo());
		this.add(getBotaoIniciar());
		this.add(getNomeJogador1());
		this.add(getNomeJogador2());
		this.add(getTextJogador1());
		this.add(getTextJogador2());
		
	}
	
	                //################### JLABEL ###################
	public JLabel getTitulo() {
		if(titulo == null) {
			titulo = new JLabel();
			titulo.setFont(new Font("Comic Sans MS", Font.BOLD, 60));
			titulo.setBounds(143, 189, 531, 64);
		    titulo.setText("JOGO DA VELHA");
		}
		return titulo;
	}
	
	
	public JLabel getNomeJogador1() {
		if(nomeJogador1 == null) {
			nomeJogador1 = new JLabel();
			nomeJogador1.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
			nomeJogador1.setBounds(200, 310, 404, 47);
		    nomeJogador1.setText("Digite o nome do jogador(X):");
		}
		return nomeJogador1;
	}
	
	public JLabel getNomeJogador2() {
		if(nomeJogador2 == null) {
			nomeJogador2 = new JLabel();
			nomeJogador2.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
			nomeJogador2.setBounds(200, 489, 414, 47);
		    nomeJogador2.setText("Digite o nome do jogador(O):");
		}
		return nomeJogador2;
	}
	
                     //################### JTEXTFIELD ###################
	
	public JTextField getTextJogador1() {
		if(textJogador1 == null) {
			textJogador1 = new JTextField();
			textJogador1.setBounds(242, 384, 297, 36);
			
		}
		return textJogador1;
	}
	
	public JTextField getTextJogador2() {
		if(textJogador2 == null) {
			textJogador2 = new JTextField();
			textJogador2.setBounds(241, 546, 297, 36);
			
		}
		return textJogador2;
	}

                    //################### JBUTTON ###################
	
	public JButton getBotaoIniciar() {
		if(botaoIniciar == null) {
			botaoIniciar = new JButton();
			botaoIniciar.setFont(new Font("Tahoma", Font.PLAIN, 25));
			botaoIniciar.setText("JOGAR");
			botaoIniciar.setBounds(291, 693, 223, 50);
		}
		return botaoIniciar;
	}

	
	
	

}
