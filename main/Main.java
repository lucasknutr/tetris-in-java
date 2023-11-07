package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // game logic
        JFrame window = new JFrame("Tetris");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
