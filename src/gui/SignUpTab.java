package gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * This class will hold al the components for the user to create a new account
 * @author Moises
 */
public class SignUpTab extends JPanel {
    
    
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, 1000, 800);
    }
}
