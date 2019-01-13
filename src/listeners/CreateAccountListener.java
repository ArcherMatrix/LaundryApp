package listeners;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import database.DatabaseManager;
import laundrytimesheet.Person;

/**
 * This class is responsible for actions on the SignUpTab
 * @author LaundryApp
 */
public class CreateAccountListener implements ActionListener {
    CardLayout cardLayout;
    JPanel centerPanel;
    JTextField name;
    JTextField email;
    JTextField phone;
    JPasswordField password;
    JPasswordField confirmpassword;
    DatabaseManager database;

    
    public CreateAccountListener(JPanel centerPanel, CardLayout cardLayout,JTextField name, JTextField email,JTextField phone,JPasswordField password,JPasswordField confirmpassword) {
        database = new DatabaseManager();
        this.centerPanel = centerPanel;
        this.cardLayout = cardLayout;
        this.name = name;
        this.email = email;
        this.phone = phone; 
        this.password = password;
        this.confirmpassword = confirmpassword;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    	if(password.equals(confirmpassword)) {
    		Person person = new Person();
    		person.setName(name.getText());
    		person.setEmailAddress(email.getText());
                if(phone.getText().equals("")){
                    person.setMobileNumber(0); 
                }
                else {
                    person.setMobileNumber(Integer.valueOf(phone.getText()));
                }
    		person.setPassword(password.getPassword());
    		try {
                    database.add(person);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
    	}
    	else {
    		System.out.println("Error: Passwords are not the same!");
    	}
    	cardLayout.show(centerPanel,"homepage");
        
    }
}
