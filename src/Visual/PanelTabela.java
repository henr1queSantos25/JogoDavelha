package Visual;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import Modelos.Jogo;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PanelTabela extends JPanel {

    JButton botao0x0;
    JButton botao0x1;
    JButton botao0x2;
    JButton botao1x0;
    JButton botao1x1;
    JButton botao1x2;
    JButton botao2x0;
    JButton botao2x1;
    JButton botao2x2;

    JButton jogarDeNovo;
    JButton trocarJogadores;

    JLabel resultado;
    JLabel vezJogador;
    Jogo jogador;

    
    public PanelTabela(Jogo jogador) {
    	this.jogador = jogador;
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(154)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(getVezJogador(), GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        				.addComponent(getResultado(), GroupLayout.PREFERRED_SIZE, 483, GroupLayout.PREFERRED_SIZE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(getBotao0x0(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        					.addGap(32)
        					.addComponent(getBotao0x1(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        					.addGap(31)
        					.addComponent(getBotao0x2(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(getBotao1x0(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        					.addGap(32)
        					.addComponent(getBotao1x1(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        					.addGap(31)
        					.addComponent(getBotao1x2(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(getBotao2x0(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        					.addGap(32)
        					.addComponent(getBotao2x1(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        					.addGap(31)
        					.addComponent(getBotao2x2(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
        					.addComponent(getJogarDeNovo(), GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)
        					.addGap(55)
        					.addComponent(getTrocarJogadores(), GroupLayout.PREFERRED_SIZE, 214, GroupLayout.PREFERRED_SIZE)))
        			.addGap(163))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(33)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(getVezJogador(), GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(26)
        					.addComponent(getResultado(), GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)))
        			.addGap(45)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(getBotao0x0(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        				.addComponent(getBotao0x1(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        				.addComponent(getBotao0x2(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(getBotao1x0(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        				.addComponent(getBotao1x1(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        				.addComponent(getBotao1x2(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        			.addGap(23)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(getBotao2x0(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        				.addComponent(getBotao2x1(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        				.addComponent(getBotao2x2(), GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
        			.addGap(53)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(getJogarDeNovo(), GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        				.addComponent(getTrocarJogadores(), GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
        			.addGap(64))
        );
        setLayout(groupLayout);

    }

    public JLabel getVezJogador() {
        if (vezJogador == null) {
            vezJogador = new JLabel();
            vezJogador.setForeground(Color.BLACK);
            vezJogador.setHorizontalAlignment(SwingConstants.CENTER);
            vezJogador.setFont(new Font("Comic Sans MS", Font.PLAIN, 45));
            vezJogador.setText("Vez de " + jogador.getNomeJogador1());
        }
        return vezJogador;
    }

    public JLabel getResultado() {
        if (resultado == null) {
            resultado = new JLabel();
            resultado.setForeground(Color.BLACK);
            resultado.setHorizontalAlignment(SwingConstants.CENTER);
            resultado.setFont(new Font("Comic Sans MS", Font.PLAIN, 45));
            resultado.setText("");
        }
        return resultado;
    }


    public JButton getJogarDeNovo() {

        if (jogarDeNovo == null) {
            jogarDeNovo = new JButton();
            jogarDeNovo.setText("Jogar novamente");
            jogarDeNovo.setFont(new Font("Tahoma", Font.PLAIN, 20));
            jogarDeNovo.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            });
            jogarDeNovo.setVisible(false);
            jogarDeNovo.setForeground(new Color(9, 6, 6));
            jogarDeNovo.setEnabled(false);
        }
        return jogarDeNovo;

    }
    
    public JButton getTrocarJogadores() {

        if (trocarJogadores == null) {
        	trocarJogadores = new JButton();
        	trocarJogadores.setText("Trocar jogadores");
        	trocarJogadores.setFont(new Font("Tahoma", Font.PLAIN, 20));
        	trocarJogadores.setVisible(false);
        	trocarJogadores.setForeground(new Color(9, 6, 6));
        	trocarJogadores.setEnabled(false);
        }
        return trocarJogadores;

    }


    public JButton getBotao0x0() {

        if (botao0x0 == null) {
            botao0x0 = new JButton();
            botao0x0.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
            botao0x0.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            });
            botao0x0.setForeground(Color.BLACK);
        }
        return botao0x0;

    }

    public JButton getBotao0x1() {

        if (botao0x1 == null) {
            botao0x1 = new JButton();
            botao0x1.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            	}
            });
            botao0x1.setForeground(Color.BLACK);
            botao0x1.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
        }
        return botao0x1;

    }

    public JButton getBotao0x2() {

        if (botao0x2 == null) {
            botao0x2 = new JButton();
            botao0x2.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
        }
        return botao0x2;

    }

    public JButton getBotao1x0() {

        if (botao1x0 == null) {
            botao1x0 = new JButton();
            botao1x0.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
        }
        return botao1x0;

    }

    public JButton getBotao1x1() {

        if (botao1x1 == null) {
            botao1x1 = new JButton();
            botao1x1.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
        }
        return botao1x1;

    }

    public JButton getBotao1x2() {

        if (botao1x2 == null) {
            botao1x2 = new JButton();
            botao1x2.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
        }
        return botao1x2;

    }

    public JButton getBotao2x0() {

        if (botao2x0 == null) {
            botao2x0 = new JButton();
            botao2x0.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
        }
        return botao2x0;

    }

    public JButton getBotao2x1() {

        if (botao2x1 == null) {
            botao2x1 = new JButton();
            botao2x1.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
        }
        return botao2x1;

    }

    public JButton getBotao2x2() {

        if (botao2x2 == null) {
            botao2x2 = new JButton();
            botao2x2.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
        }
        return botao2x2;
    }
}
