package listeners;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import laundrytimesheet.Person;
import laundrytimesheet.Status;
/**
 * This class is responsible for actions on SignInTab
 * @author LaundryApp
 */
public class SignInListener implements ActionListener {
    CardLayout cardLayout;
    JPanel centralPanel;
    
    public SignInListener(JPanel centralPanel, CardLayout cardLayout){
        this.centralPanel = centralPanel;
        this.cardLayout = cardLayout;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(centralPanel == null);
        cardLayout.show(centralPanel, "homepage");
    }
}
