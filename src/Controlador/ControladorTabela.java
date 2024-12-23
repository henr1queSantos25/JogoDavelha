package Controlador;

import Visual.Frame;
import Visual.PanelInicial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.util.Random;
import Modelos.Jogo;
import Visual.PanelTabela;

public class ControladorTabela implements ActionListener {
	Frame frame;
    PanelTabela panelTabela;
    Jogo jogador;
    int contadorRodadas = 0;
 
    public ControladorTabela(PanelTabela panelTabela, Jogo jogador, Frame frame) {
    	this.jogador = jogador;
        this.panelTabela = panelTabela;
        this.frame = frame;
        addEventos();
    }

    private void addEventos() {
        panelTabela.getBotao0x0().addActionListener(this);
        panelTabela.getBotao0x1().addActionListener(this);
        panelTabela.getBotao0x2().addActionListener(this);
        panelTabela.getBotao1x0().addActionListener(this);
        panelTabela.getBotao1x1().addActionListener(this);
        panelTabela.getBotao1x2().addActionListener(this);
        panelTabela.getBotao2x0().addActionListener(this);
        panelTabela.getBotao2x1().addActionListener(this);
        panelTabela.getBotao2x2().addActionListener(this);

        panelTabela.getJogarDeNovo().addActionListener(this);
        panelTabela.getTrocarJogadores().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == panelTabela.getJogarDeNovo()) {
        
//             ####### ZERAR MATRIZ #######
            for (int i = 0; i < jogador.posicoes.length; i++) {
                for (int j = 0; j < jogador.posicoes.length; j++) {
                    jogador.posicoes[i][j] = 0;
                }
            }

//             ####### APAGAR MENSAGEM DE RESULTADO #######
            panelTabela.getResultado().setText("");

            contadorRodadas = 0; // zerar a contagem de jogadas

//              ####### REINICIAR BOTÕES #######
            panelTabela.getBotao0x0().setEnabled(true);
            panelTabela.getBotao0x1().setEnabled(true);
            panelTabela.getBotao0x2().setEnabled(true);
            panelTabela.getBotao1x0().setEnabled(true);
            panelTabela.getBotao1x1().setEnabled(true);
            panelTabela.getBotao1x2().setEnabled(true);
            panelTabela.getBotao2x0().setEnabled(true);
            panelTabela.getBotao2x1().setEnabled(true);
            panelTabela.getBotao2x2().setEnabled(true);

//              ####### APAGAR MENSAGENS DOS BOTOES #######
            panelTabela.getBotao0x0().setText("");
            panelTabela.getBotao0x1().setText("");
            panelTabela.getBotao0x2().setText("");
            panelTabela.getBotao1x0().setText("");
            panelTabela.getBotao1x1().setText("");
            panelTabela.getBotao1x2().setText("");
            panelTabela.getBotao2x0().setText("");
            panelTabela.getBotao2x1().setText("");
            panelTabela.getBotao2x2().setText("");

//          ####### COLOCAR X COMO JOGADOR 1 #######
            jogador.setVezJogador(true);

//          ####### APAGAR BOTAO JOGAR DE NOVO #######
            panelTabela.getJogarDeNovo().setEnabled(false);
            panelTabela.getJogarDeNovo().setVisible(false);
            
            panelTabela.getTrocarJogadores().setEnabled(false);
            panelTabela.getTrocarJogadores().setVisible(false);

            panelTabela.getVezJogador().setText("Vez de " + jogador.getNomeJogador1());
            
//          ########## ATIVAR A LABEL VEZ JOGADOR #########
            panelTabela.getVezJogador().setVisible(true);
        	 

        } else if (e.getSource() == panelTabela.getBotao0x0()) {
        	
        	jogador.posicoes[0][0]= descobrirJogador(jogador.posicoes[0][0]);
        	metodoTotal(panelTabela.getBotao0x0());
            
        } else if (e.getSource() == panelTabela.getBotao0x1()) {
        	
        	jogador.posicoes[0][1]= descobrirJogador(jogador.posicoes[0][1]);
        	metodoTotal(panelTabela.getBotao0x1());

        } else if (e.getSource() == panelTabela.getBotao0x2()) {
        	
        	jogador.posicoes[0][2]= descobrirJogador(jogador.posicoes[0][2]);
        	metodoTotal(panelTabela.getBotao0x2());

        } else if (e.getSource() == panelTabela.getBotao1x0()) {
        	
        	jogador.posicoes[1][0]= descobrirJogador(jogador.posicoes[1][0]);
        	metodoTotal(panelTabela.getBotao1x0());

        } else if (e.getSource() == panelTabela.getBotao1x1()) {
        	
        	jogador.posicoes[1][1]= descobrirJogador(jogador.posicoes[1][1]);
        	metodoTotal(panelTabela.getBotao1x1());

        } else if (e.getSource() == panelTabela.getBotao1x2()) {
        	
        	jogador.posicoes[1][2]= descobrirJogador(jogador.posicoes[1][2]);
        	metodoTotal(panelTabela.getBotao1x2());

        } else if (e.getSource() == panelTabela.getBotao2x0()) {
        	
        	jogador.posicoes[2][0]= descobrirJogador(jogador.posicoes[2][0]);
        	metodoTotal(panelTabela.getBotao2x0());
        	
        } else if (e.getSource() == panelTabela.getBotao2x1()) {
        	
        	jogador.posicoes[2][1]= descobrirJogador(jogador.posicoes[2][1]);
        	metodoTotal(panelTabela.getBotao2x1());

        } else if (e.getSource() == panelTabela.getBotao2x2()) {
        	jogador.posicoes[2][2] = descobrirJogador(jogador.posicoes[2][2]);
        	metodoTotal(panelTabela.getBotao2x2());

        } else if(e.getSource() == panelTabela.getTrocarJogadores()) {
        	PanelInicial panelInicial = new PanelInicial();
        	frame.setContentPane(panelInicial);
			frame.repaint();
			frame.validate();
			ControladorPanelInicial controladorPanelInicial = new ControladorPanelInicial(panelInicial, frame);
        }

    }
    
    public void IA(int linha, int coluna) {
    	if(linha == 0 && coluna == 0) {
    		metodoTotal(panelTabela.getBotao0x0());
    	}else if(linha == 0 && coluna == 1) {
    		metodoTotal(panelTabela.getBotao0x1());
    	}else if(linha == 0 && coluna == 2) {
    		metodoTotal(panelTabela.getBotao0x2());
    	}else if(linha == 1 && coluna == 0) {
    		metodoTotal(panelTabela.getBotao1x0());
    	}else if(linha == 1 && coluna == 1) {
    		metodoTotal(panelTabela.getBotao1x1());
    	}else if(linha == 1 && coluna == 2) {
    		metodoTotal(panelTabela.getBotao1x2());
    	}else if(linha == 2 && coluna == 0) {
    		metodoTotal(panelTabela.getBotao2x0());
    	}else if(linha == 2 && coluna == 1) {
    		metodoTotal(panelTabela.getBotao2x1());
    	}else if(linha == 2 && coluna == 2) {
    		metodoTotal(panelTabela.getBotao2x2());
    	}
    	
    }

    public void trocaJogador() {

        if (jogador.getVezJogador() == true) {
            jogador.setVezJogador(false);
        } else {
            jogador.setVezJogador(true);
        }
    }

    public int verificarGanhador() {

        // verificação horizontal e vertical
        for (int i = 0; i < 3; i++) {
            if (jogador.posicoes[i][0] != 0 && jogador.posicoes[i][0] == jogador.posicoes[i][1] && jogador.posicoes[i][1] == jogador.posicoes[i][2]) {
                return jogador.posicoes[i][0];
            }

            if (jogador.posicoes[0][i] != 0 && jogador.posicoes[0][i] == jogador.posicoes[1][i] && jogador.posicoes[1][i] == jogador.posicoes[2][i]) {
                return jogador.posicoes[0][i];
            }

        }
        // verificação diagonal principal
        if (jogador.posicoes[0][0] != 0 && jogador.posicoes[0][0] == jogador.posicoes[1][1] && jogador.posicoes[1][1] == jogador.posicoes[2][2]) {
            return jogador.posicoes[0][0];
        }

        // verificação diagonal secundária
        if (jogador.posicoes[0][2] != 0 && jogador.posicoes[0][2] == jogador.posicoes[1][1] && jogador.posicoes[1][1] == jogador.posicoes[2][0]) {
            return jogador.posicoes[0][2];
        }

        if (contadorRodadas == 9) {
            return 3;
        }

        return 0;
    }

    public void verificarResultado() {
        if (jogador.ganhou == 1) {
            panelTabela.getResultado().setText(jogador.getNomeJogador1() + " Ganhou!");
        } else if (jogador.ganhou == 2) {
            panelTabela.getResultado().setText(jogador.getNomeJogador2() + " Ganhou!");
        } else {
            panelTabela.getResultado().setText("VELHA!");
        }
        
       
        panelTabela.getJogarDeNovo().setEnabled(true);
        panelTabela.getJogarDeNovo().setVisible(true);
        
        panelTabela.getTrocarJogadores().setEnabled(true);
        panelTabela.getTrocarJogadores().setVisible(true);

    }

    public int descobrirJogador(int posicaoClick) {
        if (jogador.getVezJogador() == true) {
            panelTabela.getVezJogador().setText("Vez de " + jogador.getNomeJogador2());
            posicaoClick = 1;
        } else {
            posicaoClick = 2;
            panelTabela.getVezJogador().setText("Vez de " + jogador.getNomeJogador1());

        }
        return posicaoClick;
    }

    public String preencherTabela() {
        String simbolo;
        if (jogador.getVezJogador() == true) {
            simbolo = "X";
        } else {
            simbolo = "O";
        }
        return simbolo;
    }
    
    public void metodoTotal(JButton botao) {
        botao.setText(preencherTabela());

        contadorRodadas++;
        jogador.ganhou = verificarGanhador();

        if (jogador.ganhou != 0) {
        	panelTabela.getVezJogador().setVisible(false);
            verificarResultado();
        }

        trocaJogador();

        botao.setEnabled(false);
    }
}
