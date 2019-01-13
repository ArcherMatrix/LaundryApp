package gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import listeners.SignUpListener;

/**
 * This class will hold all the components for the user to create a new account
 * @author Moises
 */

public class SignUpTab extends JPanel {
    CardLayout cardLayout;
    JPanel centerPanel;
    int x=300;
    
    SignUpTab(JPanel centerPanel, CardLayout cardLayout) {
        this.centerPanel = centerPanel;
        this.cardLayout = cardLayout;
        setLayout(null);
        createComponents();
    }
    private void createComponents() {
        requestFocus();
        JLabel nameLabel = new JLabel("name:");
               nameLabel.setBounds(x,141,270,50);
               nameLabel.setFont(new Font("Lucida Console",Font.PLAIN,20));
        JTextField nameField = new JTextField();
                   nameField.setBounds(513,141,270,50);
        JLabel emailLabel = new JLabel("email:");
               emailLabel.setBounds(x,230,270,50);
               emailLabel.setFont(new Font("Lucida Console",Font.PLAIN,20));
        JTextField emailField = new JTextField();
                   emailField.setBounds(513,239,270,50);
        JLabel phoneLabel = new JLabel("phone:");
               phoneLabel.setBounds(x,335,270,50);
               phoneLabel.setFont(new Font("Lucida Console",Font.PLAIN,20));
        JTextField phoneField = new JTextField();
                   phoneField.setBounds(513,338,270,50);
        JLabel passwordLabel = new JLabel("password:");
               passwordLabel.setBounds(x,430,270,50);
               passwordLabel.setFont(new Font("Lucida Console",Font.PLAIN,20));
        JPasswordField passwordField = new JPasswordField();
                       passwordField.setBounds(513,431,270,50);
        JLabel confirmpasswordLabel = new JLabel("confirm password:"); 
               confirmpasswordLabel.setBounds(x,520,270,50);
               confirmpasswordLabel.setFont(new Font("Lucida Console",Font.PLAIN,20));
        JPasswordField confirmpasswordField = new JPasswordField();
                       confirmpasswordField.setBounds(513,518,270,50);
        JButton buttonCreateAccount = new JButton("Create Account:");
                buttonCreateAccount.setBounds(627,636,149,50);
                buttonCreateAccount.addActionListener(new SignUpListener(centerPanel, cardLayout));
        
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(phoneLabel);
        add(phoneField);
        add(passwordLabel);
        add(passwordField);
        add(confirmpasswordLabel);
        add(confirmpasswordField);
        add(buttonCreateAccount);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(new Color(80,208,255));
        g.fillRect(0, 0, 1000, 800);
    }
}
