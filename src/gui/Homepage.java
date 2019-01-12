package gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * this is the main class displayed after the user has signed in
 * @author Moises
 */
public class Homepage extends JPanel {
    
    Homepage() {
        setLayout(null);
        JButton button = new JButton("HOME");
                button.setBounds(0, 0, 100, 50);
        add(button);
    }
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, 1000, 800);
    }
}
