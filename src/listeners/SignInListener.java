package listeners;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 * This class is responsible for actions on the SignUpTab
 * @author LaundryApp
 */
public class SignUpListener implements ActionListener {
    CardLayout cardLayout;
    JPanel centerPanel;
    
    public SignUpListener(JPanel centerPanel, CardLayout cardLayout) {
        this.centerPanel = centerPanel;
        this.cardLayout = cardLayout;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        cardLayout.show(centerPanel,"homepage");    
    }
}
