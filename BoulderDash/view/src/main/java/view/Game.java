package view;

import java.awt.Color;
import javax.swing.*;

public class Game extends JFrame{
	
	public Game() {
		this.setTitle("BoulderDash");
		this.setSize(1800, 1000);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    this.setContentPane(new screenGame());
	}
}
