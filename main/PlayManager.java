package main;

import java.awt.*;

public class PlayManager {
    // Main PLay Area
    final int WIDTH = 360;
    final int HEIGHT = 600;
    public static int left_x;
    public static int right_x;
    public static int top_y;
    public static int bottom_y;

    public PlayManager() {
        left_x = (GamePanel.WIDTH - WIDTH) / 2; // (1280 - 360) / 2 = 460
        right_x = left_x + WIDTH;
        top_y = 50;
        bottom_y = top_y + HEIGHT;
    }
    public void update() {
    }
    public void draw(Graphics2D g2) {

    }
}
