package gui;

import com.sun.glass.events.KeyEvent;
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
                    tabbedPane.add("Sign In",new SignInTab(this,cardLayout));
                    tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
                    tabbedPane.add("Sign Up",new SignUpTab(this,cardLayout));
                    tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
        Homepage homepage = new Homepage();
        // attaching cards 
        add(tabbedPane,"tabbedPane");
        add(homepage,"homepage");
    }
    public void paintComponent(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 1000, 800);
    }
}
