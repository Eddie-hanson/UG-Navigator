// package app;

import javax.swing.*;
import java.awt.*;

public class UserInteface extends JFrame {
    UserInteface() {
        this.setTitle("LEGON DIRECTOR");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 400);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);// using no layout managers
        this.getContentPane().setBackground(new Color(255, 255, 255));
    }
}
