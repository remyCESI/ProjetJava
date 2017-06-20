package controller;

import java.awt.event.*;

public class UserOrder extends KeyAdapter implements IUserOrder{

	private Order order;
	
	public UserOrder(Order order) {
		
	}
	
	public Order getOrder() {
		return order;
	}
	
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		
		if(keycode == KeyEvent.VK_Z) {
			p.move(0, -48, 0, -1);
		}
		if(keycode == KeyEvent.VK_S) {
			p.move(0, 48, 0, 1);
		}
		if(keycode == KeyEvent.VK_Q) {
			p.move(-48, 0, -1, 0);
		}
		if(keycode == KeyEvent.VK_D) {
			p.move(48, 0, 48, 0);
		}
	}
}

