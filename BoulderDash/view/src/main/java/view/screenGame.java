package view;

import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class screenGame extends JPanel{

	
	public void screen(Graphics g) {
		try {
		Image img = ImageIO.read(new File("perso_menu9.png"));
	    g.drawImage(img, 0, 0, this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
