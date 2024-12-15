package Visual;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

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

    JLabel resultado;
    JLabel vezJogador;

    
    public PanelTabela() {
        setLayout(null);
        this.add(getBotao0x0());
        this.add(getBotao0x1());
        this.add(getBotao0x2());
        this.add(getBotao1x0());
        this.add(getBotao1x1());
        this.add(getBotao1x2());
        this.add(getBotao2x0());
        this.add(getBotao2x1());
        this.add(getBotao2x2());

        this.add(getJogarDeNovo());

        this.add(getResultado());
        this.add(getVezJogador());

    }

    public JLabel getVezJogador() {
        if (vezJogador == null) {
            vezJogador = new JLabel();
            vezJogador.setForeground(Color.BLACK);
            vezJogador.setHorizontalAlignment(SwingConstants.CENTER);
            vezJogador.setFont(new Font("Comic Sans MS", Font.PLAIN, 45));
            vezJogador.setSize(483, 92);
            vezJogador.setLocation(118, 27);
            vezJogador.setText("Vez do Jogador 1(X)");
        }
        return vezJogador;
    }

    public JLabel getResultado() {
        if (resultado == null) {
            resultado = new JLabel();
            resultado.setForeground(Color.BLACK);
            resultado.setHorizontalAlignment(SwingConstants.CENTER);
            resultado.setFont(new Font("Comic Sans MS", Font.PLAIN, 45));
            resultado.setSize(483, 92);
            resultado.setLocation(118, 635);
            resultado.setText("");
        }
        return resultado;
    }


    public JButton getJogarDeNovo() {

        if (jogarDeNovo == null) {
            jogarDeNovo = new JButton();
            jogarDeNovo.setText("Jogar de Novo");
            jogarDeNovo.setFont(new Font("Comic Sans MS", Font.PLAIN, 50));
            jogarDeNovo.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                }
            });
            jogarDeNovo.setVisible(false);
            jogarDeNovo.setForeground(new Color(9, 6, 6));
            jogarDeNovo.setSize(483, 103);
            jogarDeNovo.setLocation(118, 25);
            jogarDeNovo.setEnabled(false);
        }
        return jogarDeNovo;

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
            botao0x0.setSize(140, 140);
            botao0x0.setLocation(118, 139);
        }
        return botao0x0;

    }

    public JButton getBotao0x1() {

        if (botao0x1 == null) {
            botao0x1 = new JButton();
            botao0x1.setForeground(Color.BLACK);
            botao0x1.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
            botao0x1.setSize(140, 140);
            botao0x1.setLocation(286, 139);
        }
        return botao0x1;

    }

    public JButton getBotao0x2() {

        if (botao0x2 == null) {
            botao0x2 = new JButton();
            botao0x2.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
            botao0x2.setSize(140, 140);
            botao0x2.setLocation(461, 139);
        }
        return botao0x2;

    }

    public JButton getBotao1x0() {

        if (botao1x0 == null) {
            botao1x0 = new JButton();
            botao1x0.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
            botao1x0.setSize(140, 140);
            botao1x0.setLocation(118, 301);
        }
        return botao1x0;

    }

    public JButton getBotao1x1() {

        if (botao1x1 == null) {
            botao1x1 = new JButton();
            botao1x1.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
            botao1x1.setSize(140, 140);
            botao1x1.setLocation(286, 301);
        }
        return botao1x1;

    }

    public JButton getBotao1x2() {

        if (botao1x2 == null) {
            botao1x2 = new JButton();
            botao1x2.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
            botao1x2.setSize(140, 140);
            botao1x2.setLocation(461, 301);
        }
        return botao1x2;

    }

    public JButton getBotao2x0() {

        if (botao2x0 == null) {
            botao2x0 = new JButton();
            botao2x0.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
            botao2x0.setSize(140, 140);
            botao2x0.setLocation(118, 466);
        }
        return botao2x0;

    }

    public JButton getBotao2x1() {

        if (botao2x1 == null) {
            botao2x1 = new JButton();
            botao2x1.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
            botao2x1.setSize(140, 140);
            botao2x1.setLocation(286, 466);
        }
        return botao2x1;

    }

    public JButton getBotao2x2() {

        if (botao2x2 == null) {
            botao2x2 = new JButton();
            botao2x2.setFont(new Font("Comic Sans MS", Font.PLAIN, 70));
            botao2x2.setSize(140, 140);
            botao2x2.setLocation(461, 466);
        }
        return botao2x2;
    }
}
