package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Board extends JPanel implements ActionListener{

	private Map m;
	private Player p;
	private Timer timer;
	private Image image, dir;
	
	
	public Board() {
		m = new Map();
		p = new Player();
		addKeyListener(new Action());
		setFocusable(true);
		dir = m.getPerso_face();
		
		timer = new Timer(25, this);
		timer.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		for (int x = 0; x<40; x++) {
			for (int y = 0; y<21; y++) {
				/*if(m.getMap(x, y).equals ("X")) {
					g.drawImage(m.getSand(), x*48, y*48, 48, 48, null);
				}
				if(m.getMap(x, y).equals("H")) {
					g.drawImage(m.getWall(), x*48, y*48, 48, 48, null);
				}
				if(m.getMap(x, y).equals("_")) {
					g.drawImage(m.getEmpty(), x*48, y*48, 48, 48, null);
				}
				if(m.getMap(x, y).equals("V")) {
					g.drawImage(m.getDiamond(), x*48, y*48, 48, 48, null);
				}
				if(m.getMap(x, y).equals("O")) {
					g.drawImage(m.getRock(), x*48, y*48, 48, 48, null);
				}
				if(m.getMap(x, y).equals("Y")) {
					g.drawImage(m.getMonster(), x*48, y*48, 48, 48, null);
				}*/
				switch (m.getMap(x, y)) {
				case "X" : image = m.getSand(); break;
				case "H" : image = m.getWall(); break;
				case "V" : image = m.getDiamond(); break;
				case "O" : image = m.getRock(); break;
				case "_" : image = m.getEmpty(); break;
				case "Y" : image = m.getMonster(); break;
				default : image = m.getWall(); break;
				}
				g.drawImage(image, x*48, y*48, 48, 48, null);
			}
		}
		g.drawImage(dir, p.getX(), p.getY(), 48, 48, this);
	}
	
	public class Action extends KeyAdapter {
		
		public void keyPressed(KeyEvent e) {
			int keycode = e.getKeyCode();
			
			if(keycode == KeyEvent.VK_UP) {
				p.move(0, -48, 0, -1);
				dir = m.getPerso_back();
			}
			if(keycode == KeyEvent.VK_DOWN) {
				p.move(0, 48, 0, 1);
				dir = m.getPerso_face();
			}
			if(keycode == KeyEvent.VK_LEFT) {
				p.move(-48, 0, -1, 0);
				dir = m.getPerso_left();
			}
			if(keycode == KeyEvent.VK_RIGHT) {
				p.move(48, 0, 1, 0);
				dir = m.getPerso_right();
			}
		}
	}
}


