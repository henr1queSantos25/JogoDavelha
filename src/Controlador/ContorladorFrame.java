package Controlador;

import Visual.Frame;
import Visual.PanelTabela;

public class ContorladorFrame {

    Frame frame;

    public ContorladorFrame() {
        frame = new Frame();
        PanelTabela panelTabela = new PanelTabela();
        frame.setContentPane(panelTabela);
        ControladorTabela controladorTabela = new ControladorTabela(panelTabela);
    }

    public static void main(String[] args) {
        new ContorladorFrame();

    }

}
