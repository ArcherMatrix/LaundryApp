package gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import listeners.CreateAccountListener;


/**
 * This class will hold all the components for the user to create a new account
 * @author Moises
 */

public class SignUpTab extends JPanel {
    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel emailLabel;
    private JTextField emailField;
    private JLabel phoneLabel;
    private JTextField phoneField;
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    private JPasswordField confirmpasswordField;
    private JLabel confirmpasswordLabel;
    private JButton buttonCreateAccount;
    int x=300;
    
    SignUpTab(JPanel centerPanel, CardLayout cardLayout) {
    	setBackground(Color.CYAN);
        setLayout(null);
        requestFocus();
        
        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(x,141,270,50);
        nameLabel.setFont(new Font("Lucida Console",Font.PLAIN,20));
        
        nameField = new JTextField();
        nameField.setBounds(513,141,270,50);
        
        emailLabel = new JLabel("Email Address:");
        emailLabel.setBounds(300,237,270,50);
        emailLabel.setFont(new Font("Lucida Console",Font.PLAIN,20));
        
        emailField = new JTextField();
        emailField.setBounds(513,239,270,50);
        
        phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(x,335,270,50);
        phoneLabel.setFont(new Font("Lucida Console",Font.PLAIN,20));
        
        phoneField = new JTextField();
        phoneField.setBounds(513,338,270,50);
        
        passwordLabel = new JLabel("Create a password:");
        passwordLabel.setBounds(x,430,270,50);
        passwordLabel.setFont(new Font("Lucida Console",Font.PLAIN,20));
        
        passwordField = new JPasswordField();
        passwordField.setBounds(513,431,270,50);
        
        confirmpasswordLabel = new JLabel("Confirm Password:");
        confirmpasswordLabel.setBounds(x,520,270,50);
        confirmpasswordLabel.setFont(new Font("Lucida Console",Font.PLAIN,20));
        
        confirmpasswordField = new JPasswordField();
        confirmpasswordField.setBounds(513,518,270,50);
        
        buttonCreateAccount = new JButton("Create Account");
        buttonCreateAccount.setBounds(627,636,149,50);
        buttonCreateAccount.addActionListener(new CreateAccountListener(centerPanel, cardLayout, nameField, emailField, phoneField,confirmpasswordField, confirmpasswordField));
        
        createComponents();
    }
    private void createComponents() {
        
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
