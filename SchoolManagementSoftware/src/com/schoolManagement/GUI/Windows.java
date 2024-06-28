package com.schoolManagement.GUI;

import javax.swing.JFrame;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Windows implements ActionListener {

    Font myFont = new Font("Serif",Font.BOLD,25);
    public static void main(String[] args) {
        new Windows();
    }

    public Windows() {
        JFrame frameWindows = new JFrame("Something");
        // Close windows:
        frameWindows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Size:
        frameWindows.setSize(350, 350);
		frameWindows.setLayout(null);

        // Set Position:
        frameWindows.pack();
        
        // Active Windows:
        frameWindows.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
