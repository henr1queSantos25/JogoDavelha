package Controlador;

import Visual.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Modelos.Jogo;
import Visual.PanelInicial;
import Visual.PanelTabela;

public class ControladorPanelInicial implements ActionListener{
	Frame frame;
	PanelInicial panelInicial;
	Jogo jogador = new Jogo();
	
	
	public ControladorPanelInicial(PanelInicial panelInicial, Frame frame) {
		this.panelInicial = panelInicial;
		this.frame = frame;
		addEventos();
	}
	
	public void addEventos() {
		panelInicial.getBotaoIniciar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelInicial.getBotaoIniciar()) {
			if(panelInicial.getTextJogador1().getText().isEmpty() || 
			   panelInicial.getTextJogador2().getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Preencha os campos", "Erro", JOptionPane.ERROR_MESSAGE);
			}else {
				jogador.setNomeJogador1(panelInicial.getTextJogador1().getText());
				jogador.setNomeJogador2(panelInicial.getTextJogador2().getText());
				
				PanelTabela panelTabela = new PanelTabela(jogador);
				ControladorTabela controladorTabela = new ControladorTabela(panelTabela, jogador, frame);
				frame.setContentPane(panelTabela);
				frame.repaint();
				frame.validate();
			}
		}
		
		
		
		
	}

}
