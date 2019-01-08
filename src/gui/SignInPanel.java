package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignInPanel extends JPanel {
	SignInPanel() {
		setLayout(new BorderLayout());
		
		JPanel authentificationPanel = createAuthentificationPanel();
		add(authentificationPanel,BorderLayout.CENTER);
	}
	private JPanel createAuthentificationPanel() {
		// pane holding the labels and buttons
		JPanel authentificationPane = new JPanel(){
			@Override
			public Insets getInsets() {
				return new Insets(40,20,10,20);
			}
		};
		authentificationPane.setOpaque(false);
		authentificationPane.setLayout(new GridLayout(0,1,5,25));
		
		// creating two labels
		JLabel usernameLabel = new JLabel();
		JLabel passwordLabel = new JLabel();
		usernameLabel.setText("Enter username: ");
		passwordLabel.setText("Enter password: ");
		usernameLabel.setFont(new Font("Bauhaus 93", Font.BOLD, 40));
		passwordLabel.setFont(new Font("Bauhaus 93", Font.BOLD, 40));
		
		// creating two TextFields
		JTextField usernameField = new JTextField();
		{
			usernameField.setFont(new Font("Lucida Console",Font.PLAIN,20));
			
		}
		JPasswordField passwordField = new JPasswordField();
		{
			passwordField.setFont(new Font("Lucida Console",Font.PLAIN,40));
		}
		
		//attaching them to authentificationPane
		authentificationPane.add(usernameLabel);
		authentificationPane.add(usernameField);
		authentificationPane.add(passwordLabel);
		authentificationPane.add(passwordField);
		
		return authentificationPane;
		
	}
	@Override
	public Insets getInsets() {
		return new Insets(170,190,220,190);
	}
	@Override
	public void paintComponent(Graphics g) {
			g.drawImage(createImage("/resources/Sign_In_Image.png"),0,0,null);
	}
	private Image createImage(String fileName) {
		Image image = new ImageIcon(getClass().getResource(fileName)).getImage();
		return new ImageIcon(image.getScaledInstance(1000, 800, Image.SCALE_DEFAULT)).getImage();
	}
}
