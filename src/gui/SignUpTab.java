package gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JPanel;
import listeners.SignUpListener;

/**
 * This class will hold all the components for the user to create a new account
 * @author Moises
 */
public class SignUpTab extends JPanel {
    CardLayout cardLayout;
    JPanel centerPanel;
    
    SignUpTab(JPanel centerPanel, CardLayout cardLayout) {
        this.centerPanel = centerPanel;
        this.cardLayout = cardLayout;
        setLayout(null);
        JButton button = new JButton("HOME");
                button.setBounds(300, 300, 100, 50);
                button.addActionListener(new SignUpListener(centerPanel,cardLayout));
        add(button);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(0, 0, 1000, 800);
    }
}
