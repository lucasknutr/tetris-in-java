package main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public static final int WIDTH = 1920;
    public static final int HEIGHT = 1080;

    public GamePanel() {

        // * Panel Settings

        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.black);
        this.setLayout(null);
    }
}
