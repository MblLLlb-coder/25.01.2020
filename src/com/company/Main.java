package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame frame = new JFrame();
        frame.setSize(600,400);
        frame.setVisible(true);
        JButton button = new JButton("Button");
        button.setVisible(true);
        button.setBackground(Color.RED);
        frame.getContentPane().add(button);
        //button.getColorModel();
    }
}
