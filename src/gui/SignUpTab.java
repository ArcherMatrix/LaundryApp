package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUpTab extends JPanel {
	SignUpTab() {
		setLayout(new BorderLayout());
		JPanel newAccountPanel = createAccountPanel();
		add(newAccountPanel);
		//add(new JButton("create"));
	}
	private JPanel createAccountPanel() {
		// --- > creating labels
		JLabel nameLabel = new JLabel(" Name:");
		JLabel emailLabel = new JLabel(" Your current email address:");
		JLabel phoneLabel = new JLabel(" Mobile phone:");
		JLabel passwordLabel = new JLabel(" Create a password:");
		JLabel confirmPasswordLabel = new JLabel(" Confirm your password:");
		{	
			nameLabel.setFont(new Font(nameLabel.getFont().getFamily(),nameLabel.getFont().getStyle(),20));
			emailLabel.setFont(new Font(emailLabel.getFont().getFamily(),emailLabel.getFont().getStyle(),20));
			phoneLabel.setFont(new Font(phoneLabel.getFont().getFamily(),phoneLabel.getFont().getStyle(),20));
			passwordLabel.setFont(new Font(passwordLabel.getFont().getFamily(),passwordLabel.getFont().getStyle(),20));
			confirmPasswordLabel.setFont(new Font(confirmPasswordLabel.getFont().getFamily(),confirmPasswordLabel.getFont().getStyle(),20));
		}
		
		// --- > creating fields
		JTextField nameField = new JTextField();
		JTextField emailField = new JTextField();
		JTextField phoneField = new JTextField();
		JPasswordField passwordField = new JPasswordField();
		JPasswordField confirmPasswordField = new JPasswordField();
		{
			nameField.setFont(new Font("Lucida Console",Font.PLAIN,20));
			emailField.setFont(new Font("Lucida Console",Font.PLAIN,20));
			phoneField.setFont(new Font("Lucida Console",Font.PLAIN,20));
			passwordField.setFont(new Font("Lucida Console",Font.PLAIN,20));
			confirmPasswordField.setFont(new Font("Lucida Console",Font.PLAIN,20));
		}
		// --- > creating pane for the buttons
		JButton createButton = new JButton("Create Account");
		
		
		// --- > creating pane holding everything
		JPanel accountPanel = new JPanel();
		{	//attaching labels
			accountPanel.setOpaque(false);
			accountPanel.setLayout(new GridLayout(0,1,0,5));
			accountPanel.add(nameLabel);
			accountPanel.add(nameField);
			accountPanel.add(emailLabel);
			accountPanel.add(emailField);
			accountPanel.add(phoneLabel);
			accountPanel.add(phoneField);
			accountPanel.add(passwordLabel);
			accountPanel.add(passwordField);
			accountPanel.add(confirmPasswordLabel);
			accountPanel.add(confirmPasswordField);
			accountPanel.add(createButton);
		}
		return accountPanel;
	}
	@Override
	public Insets getInsets() {
		return new Insets(120,310,160,300);
	}
	@Override
	public void paintComponent(Graphics g) {
			g.drawImage(createImage("/resources/Sign_Up_Image.png"),0,0,null);
	}
	private Image createImage(String fileName) {
		Image image = new ImageIcon(getClass().getResource(fileName)).getImage();
		return new ImageIcon(image.getScaledInstance(1000, 800, Image.SCALE_DEFAULT)).getImage();
	}
}
