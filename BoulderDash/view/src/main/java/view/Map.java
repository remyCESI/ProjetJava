package view;

import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Map {
	
	private Scanner m;
	private String Map[] = new String[40];
	private Image sand, wall, empty, rock, diamond;
	
	
	public Map(){
		
		ImageIcon img = new ImageIcon("img/wall.png");
		wall = img.getImage();
		img = new ImageIcon("img/empty2.png");
		empty = img.getImage();
		img = new ImageIcon("img/rock.png");
		rock = img.getImage();
		img = new ImageIcon("img/diamond3.png");
		diamond = img.getImage();
		img = new ImageIcon("img/sand.png");
		sand = img.getImage();
		
		openFile();
		readFile();
		closeFile();
	}
	
	public Image getWall() {
		return wall;
	}
	public Image getEmpty() {
		return empty;
	}
	public Image getRock() {
		return rock;
	}
	public Image getDiamond() {
		return diamond;
	}
	public Image getSand() {
		return sand;
	}
	
	
	public String getMap(int x, int y) {
		String index = Map[y].substring(x, x+1);
		return index;
	}
	
	public void openFile() {
		try {
			m = new Scanner(new File("C:/Users/KLEIN Aurélien/Desktop/Projet/6- Projet Java/map_1.txt"));
		} catch (Exception e) {
			System.out.println("error loading map");
		}
	}
	
	public void readFile() {
		while(m.hasNext()) {
			for(int i = 0; i < 40; i++) {
				Map[i] = m.next();
			}
		}
	}
	
	public void closeFile() {
		m.close();
	}
	
}
