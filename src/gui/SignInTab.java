package gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import listeners.SignInListener;


/**
 * This class will hold all the components 
 * @author Moises
 */
public class SignInTab extends JPanel {
    JPanel centralPanel;
    CardLayout cardLayout;
    
    SignInTab(JPanel centralPanel, CardLayout cardLayout) {
        this.centralPanel = centralPanel;
        this.cardLayout = cardLayout;
        setLayout(null);
        createComponents();
    }

    private void createComponents() {
        JLabel titleLabel = new JLabel("The Knigh Wash");
               titleLabel.setBounds(42,172, 956,108);
               titleLabel.setFont(new Font("Cooper Black",Font.PLAIN,100));
        JLabel usernameLabel = new JLabel("Username:");
               usernameLabel.setBounds(200,415,163,40);
               usernameLabel.setFont(new Font("Bauhaus 93", Font.BOLD,30));
        JLabel passwordLabel = new JLabel("Password:");
               passwordLabel.setBounds(200,530,163,40);
               passwordLabel.setFont(new Font("Bauhaus 93",Font.PLAIN,30));
        JTextField usernameField = new JTextField();
                   usernameField.setBounds(406,412,283,60);
                   usernameField.setFont(new Font("Lucida Console",Font.PLAIN,20));
        JPasswordField passwordField = new JPasswordField();
                       passwordField.setBounds(406,526,283,60);
                       passwordField.setFont(new Font("Lucida Console",Font.PLAIN,40));
        JButton buttonSignIn = new JButton("Sign In");
                buttonSignIn.setFont(new Font(buttonSignIn.getFont().getFamily(),Font.BOLD,20));
                buttonSignIn.setBounds(543,632,144,53);
                buttonSignIn.addActionListener(new SignInListener(centralPanel,cardLayout));
        
        add(titleLabel);
        add(usernameLabel);
        add(passwordLabel);
        add(usernameField);
        add(passwordField);
        add(buttonSignIn);
    }
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.WHITE.darker());
        g.fillRect(0, 0, 1000, 800);
    }
}
