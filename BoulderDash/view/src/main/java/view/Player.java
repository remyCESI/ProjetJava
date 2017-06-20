package view;

public class Player {
	
	private int x, y, tilex, tiley;
	
	public Player() {
		x = 48;
		y = 48;
		
		tilex = 1;
		tiley = 1;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getTilex() {
		return tilex;
	}
	public int getTiley() {
		return tiley;
	}
	
	public void move(int u, int v, int xx, int yy) {
		x += u;
		y += v;
		
		tilex += xx;
		tiley += yy;
	}
}
