package gui;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *  This class is the entry point to the program
 *  this class just creates a custom window for the program to run in window 
 * @author Moises
 */
public class Window {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame window = new JFrame();
                       window.setLayout(null);
                       window.setSize(new Dimension(1000,800));
                       window.add(new CentralPanel(window));
                       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                       window.setVisible(true);
            }
        });
    }
}
