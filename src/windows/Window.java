package windows;

import javax.swing.*;


public class Window extends JFrame {

    public static final int WIDTH = 1000, HEIGHT = 800;

    public Window(){
        setTitle("Space Blattle Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}
