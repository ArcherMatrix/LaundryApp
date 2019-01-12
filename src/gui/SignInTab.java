package gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * This class will hold all the components 
 * @author Moises
 */
public class SignInTab extends JPanel {
    SignInTab() {
        setLayout(null);
        JButton button = new JButton("HOME");
                button.setBounds(300, 300, 100, 50);
        add(button);
    }
    
    @Override
    public void paintComponent(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(0,0,1000,800);
    }
}
