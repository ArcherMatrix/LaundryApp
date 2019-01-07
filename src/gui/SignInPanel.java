package gui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class SignInPanel extends JPanel {
	
	
	
	@Override
	public void paintComponent(Graphics g) {
			g.drawImage(createImage("/resources/Sign_In_Image.jpg"),0,0,null);
	}
	private Image createImage(String fileName) {
		Image image = new ImageIcon(getClass().getResource(fileName)).getImage();
		return new ImageIcon(image.getScaledInstance(1000, 800, Image.SCALE_DEFAULT)).getImage();
	}
}
