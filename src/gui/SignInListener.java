package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import laundrytimesheet.Person;
import laundrytimesheet.Status;
/**
 * This class will respond to user 
 * @author LaundryApp
 */
public class SignInListener {
	private JTextField usernameField;
	private JPasswordField passwordField;
	
	SignInListener(JTextField usernameField, JPasswordField passwordField) {
		this.usernameField = usernameField;
		this.passwordField = passwordField;
		assignListener();
	}
	private void assignListener() {
		passwordField.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// --> get info
				Person person = new Person();
				person.setName(usernameField.getText());
				usernameField.setText("");
				person.setPassword(e.getActionCommand());
				passwordField.setText("");
				// --> call Status
				System.out.println(person.getName());
				System.out.println(person.getPassword());
			}
		});
	}
}
