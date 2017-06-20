package view;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class screenGame extends JPanel implements ActionListener{

	private Map m;
	private Timer timer;
	
	
	public void screen() {
		m = new Map();
		
		timer = new Timer(25, this);
		timer.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		for (int y = 0; y<20; y++) {
			for (int x = 0; x<40; x++) {
				if(m.getMap(x, y).equals("X")) {
					g.drawImage(m.getSand(), x*16, y*16, 16, 16, this);
				}
				if(m.getMap(x, y).equals("H")) {
					g.drawImage(m.getWall(), x*16, y*16, 16, 16, this);
				}
				if(m.getMap(x, y).equals(" ")) {
					g.drawImage(m.getEmpty(), x*16, y*16, 16, 16, this);
				}
				if(m.getMap(x, y).equals("V")) {
					g.drawImage(m.getDiamond(), x*16, y*16, 16, 16, this);
				}
				if(m.getMap(x, y).equals("O")) {
					g.drawImage(m.getRock(), x*16, y*16, 16, 16, this);
				}
			}
		}
	}
}
