package view;

import javax.swing.*;

public class Menu {
	  private int level = 1;
	  private String skin = "Classic";
	
	/**
	 * Constructor Menu() will create a new menu to let the user pick a skin and a level for the game.
	 * It will also set 'level' to a number corresponding to the map; and set 'skin' to the selected skin.
	 */
	public Menu() {
		  level = 1;
		  String dos = "Menu";
		  String Newligne=System.getProperty("line.separator");
		  ImageIcon perso_menu = new ImageIcon("C:/Users/KLEIN Aurélien/Desktop/Projet/6- Projet Java/BoulderDash-BaseProject/BoulderDash/ressourcepack/Menu/perso_menu9.png");
		  ImageIcon diams_menu = new ImageIcon("C:/Users/KLEIN Aurélien/Desktop/Projet/6- Projet Java/BoulderDash-BaseProject/BoulderDash/ressourcepack/Menu/diams_menu.png");
		  ImageIcon monster_menu = new ImageIcon("C:/Users/KLEIN Aurélien/Desktop/Projet/6- Projet Java/BoulderDash-BaseProject/BoulderDash/ressourcepack/Menu/monster_menu3.png");
		  
		  String[] lvl = {"Level 1", "Level 2", "Level 3", "Level 4", "Level 5"};
		  String[] skn = {"Classic", "Minecraft"};
		  
		  String skin = (String)JOptionPane.showInputDialog(null, "Select the skin :", "BoulderDash Menu", JOptionPane.QUESTION_MESSAGE, perso_menu, skn, skn[0]);
		  JOptionPane.showMessageDialog(null, skin + " skin selected !", "BoulderDash Menu", JOptionPane.INFORMATION_MESSAGE, perso_menu);		  
		  
		  
		  int level = JOptionPane.showOptionDialog(null, "Select a level :", "BoulderDash Menu", JOptionPane.DEFAULT_OPTION,
				  JOptionPane.QUESTION_MESSAGE, perso_menu, lvl, lvl[0]);
		  level++;
		  if (level != 5) {
			  JOptionPane.showMessageDialog(null, "Level " + level + " selected !" + Newligne + "Goal : Find all diamonds", "BoulderDash Menu", JOptionPane.INFORMATION_MESSAGE, diams_menu);
		  }
		  else {
			  JOptionPane.showMessageDialog(null, "Level " + level + " selected !" + Newligne + "Goal : Kill the monster", "BoulderDash Menu", JOptionPane.INFORMATION_MESSAGE, monster_menu);
		  }
	  }
	
	
	/**
	 * getLevel will return the number of the selected map (By default, the first map is selected).
	 * getSkin will return the selected skin (By default, Classic skin is selected).
	 */
	public int getLevel() {
		return level;
	}

	public String getSkin() {
		return skin;
	}
}
