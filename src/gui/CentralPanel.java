package gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * This class is the central class that manages all other components to be shown on screen
 * @author LaundryApp
 */
public class CentralPanel extends JPanel {
    JFrame window;
    CardLayout cardLayout;
    CentralPanel(JFrame window) {
        this.window = window;
        customiseCentralPanel();
        createComponents();
    }

    private void customiseCentralPanel() {
        cardLayout = new CardLayout();
        setLayout(cardLayout);
        setBounds(0,0,1000,800);
    }

    private void createComponents() {
        // creating cards
        JTabbedPane tabbedPane = new JTabbedPane();
                    //tabbedPane.add(new SignInTab(cardLayout))
                    //tabbedPane.add(new SignUpTab(cardLayout))
        //HomepagePane home = new HomepagePane(window);
        
        // attaching cards 
        
        
    }
    public void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1000, 800);
    }
}
