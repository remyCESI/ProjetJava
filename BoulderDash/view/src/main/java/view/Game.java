package view;

import java.awt.Color;
import javax.swing.*;

public class Game extends JFrame{
	
	public Game() {
		this.setTitle("BoulderDash");
		this.setSize(640, 320);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
	    this.add(new screenGame());
	}
}
