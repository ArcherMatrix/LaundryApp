package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Window extends JPanel {
	//entry point of the app
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				createWindow();
			}
		});
	}
	// creating window
	private static void createWindow() {
		//set up the window
		JFrame frame = new JFrame();
		frame.setIconImage(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//add content to the window
		frame.add(new Window(),BorderLayout.CENTER);
		//display the window
		frame.pack();
		frame.setVisible(true);
	}
	Window() {
		super(new GridLayout(1,1));
		//Create the 2 Panes (Sign In, Sign UP)
		JPanel signInPanel = makeSignInPanel();
		signInPanel.setPreferredSize(new Dimension(782,512));
		JPanel signUpPanel = makeSignUpPanel();
		signUpPanel.setPreferredSize(new Dimension(782,512));
		//attach panes to the JTabPane
		JTabbedPane tabbedPane = new JTabbedPane();
		Icon signInIcon = createIcon("/resources/Sign_In_Image.png");
		tabbedPane.addTab("Sign In", signInIcon,signInPanel);
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
		Icon signUpIcon = createIcon("/resources/Sign_Up_Image.png");
		tabbedPane.addTab("Sign Up", signUpIcon, signUpPanel);
		tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
		//attaching JTabPane to this WindowPane
		add(tabbedPane);
		//enables scrolling tabs
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	}
	// 782 x 512
	private JPanel makeSignInPanel() {
//		JPanel panel = new JPanel() {
//			@Override
//			public void paintComponent(Graphics g) {
//				Graphics2D g2 = (Graphics2D)g;
//				g2.drawImage(createImage("/resources/Log_In.jpg"),0,0,null);
//			}
//			public Image createImage(String fileName) {
//				return new ImageIcon(getClass().getResource(fileName)).getImage();
//			}
//		};
		return new SignInPanel();
	}
	private JPanel makeSignUpPanel() {
//		JPanel panel = new JPanel() {
//			@Override
//			public void paintComponent(Graphics g) {
//				Graphics2D g2 = (Graphics2D)g;
//				g2.drawImage(createImage("/resources/Log_In.jpg"),0,0,null);
//			}
//			public Image createImage(String fileName) {
//				return new ImageIcon(getClass().getResource(fileName)).getImage();
//			}
//		};
		return SignUpPanel();
	}
	private Icon createIcon(String fileName) {
		Image image = new ImageIcon(getClass().getResource(fileName)).getImage();
		return new ImageIcon(image.getScaledInstance(50, 50, Image.SCALE_DEFAULT));
	}
}    