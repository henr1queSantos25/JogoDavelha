package Controlador;

import Visual.Frame;
import Visual.PanelInicial;
import Visual.PanelTabela;

public class ControladorFrame {

    Frame frame;
    PanelInicial panelInicial;
  
    public ControladorFrame() {
        frame = new Frame();
        panelInicial = new PanelInicial();
        frame.setContentPane(panelInicial);
        frame.repaint();
		frame.validate();
        ControladorPanelInicial controladorPanelInicial = new ControladorPanelInicial(panelInicial, frame);
    }

    public static void main(String[] args) {
        new ControladorFrame();

    }

}
