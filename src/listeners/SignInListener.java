package listeners;

import database.DatabaseManager;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import laundrytimesheet.Person;

/**
 * This class is responsible for actions on the SignUpTab
 * @author LaundryApp
 */
public class SignInListener implements ActionListener {
    CardLayout cardLayout;
    JPanel centerPanel;
    JTextField usernameField;
    JPasswordField passwordField;
    DatabaseManager databaseManager;
    
    public SignInListener(JPanel centerPanel, CardLayout cardLayout, JTextField usernameField, JPasswordField passwordField) {
        databaseManager = new DatabaseManager();
        this.centerPanel = centerPanel;
        this.cardLayout = cardLayout;
        this.usernameField = usernameField;
        this.passwordField = passwordField;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Person person = new Person();
        person.setName(usernameField.getText());
        person.setPassword(passwordField.getPassword());
        
        if(databaseManager.doesUserExist(person)) {
            if(databaseManager.getRegisteredPerson(person).equals(person)) {
                cardLayout.show(centerPanel, "homepage");
            }
        }else{System.err.println("sorry user does not exist");}
    }
}
