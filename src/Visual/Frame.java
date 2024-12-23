package Visual;

import javax.swing.JFrame;

public class Frame extends JFrame {

    JFrame Frame = new JFrame();

    public Frame() {
        super();
        this.setVisible(true);
        this.setSize(800, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

}
