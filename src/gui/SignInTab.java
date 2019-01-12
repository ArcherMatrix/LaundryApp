package gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * This class will hold all the components 
 * @author Moises
 */
public class SignInTab extends JPanel {
    
    @Override
    public void paintComponents(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(0,0,1000,800);
    }
}
