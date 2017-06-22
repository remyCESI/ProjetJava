package model;

import java.awt.Image;

public interface IMap {

	public void generate();
	
	public Image getWall();
	public Image getEmpty();
	public Image getRock();
	public Image getDiamond();
	public Image getSand();
	public Image getMonster();
	
	
	
	public Image getCoal_ore();
	public Image getIron_ore();
	public Image getGold_ore();
	public Image getDiamond_ore();
	public Image getLapis_ore();
	public Image getEmerald_ore();
	public Image getRedstone_ore();
	
	
	
	public Image getPerso_face();
	public Image getPerso_back();
	public Image getPerso_left();
	public Image getPerso_right();
	
	
	public String getMap(int x, int y);
	public void setMap(int x, int y, String sprite);
}
