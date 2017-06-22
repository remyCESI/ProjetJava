package view;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Monster {

	private int x, y, t=0;
	private Random r;
	private IMap m;
	
	
	Timer tmr = new Timer();
	TimerTask task = new TimerTask() {
		public void run() {
			t++;
			moveM();
			System.out.println(t);
		}
	};
	
	public void start() {
		tmr.scheduleAtFixedRate(task, 500, 500);
	}
	
	public Monster() {
		x = 20;
		y = 10;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void moveM() {
		r = new Random();
		int f = r.nextInt(4-0);
		System.out.println(f);
		
		switch (f) {
		case 0 : moveUp(); break;
		case 1 : moveDown(); break;
		case 2 : moveLeft(); break;
		case 3 : moveRight(); break;
		default : break;
		}
		
	}
	
	public void moveUp() {
		if(m.getMap(getX(), getY()-1).equals("_")) {
			y = getY()-1;
			setY(y);
			m.setMap(x, y, "Y");
			m.setMap(x, y+1, "_");
		} else {
			moveM();
		}
	}
	public void moveDown() {
		if(m.getMap(getX(), getY()+1).equals("_")) {
			y = getY()+1;
			setY(y);
			m.setMap(x, y, "Y");
			m.setMap(x, y-1, "_");
		} else {
			moveM();
		}
	}
	public void moveLeft() {
		if(m.getMap(getX()-1, getY()).equals("_")) {
			x = getX()-1;
			setX(x);
			m.setMap(x, y, "Y");
			m.setMap(x+1, y, "_");
		} else {
			moveM();
		}
	}
	public void moveRight() {
		if(m.getMap(getX()+1, getY()).equals("_")) {
			x = getX()+1;
			setX(x);
			m.setMap(x, y, "Y");
			m.setMap(x-1, y, "_");
		} else {
			moveM();
		}
	}
	
}
