/**
 * 
 */
package MotionLess;

import java.awt.Image;

import model.Element;
import model.ICollect;

/**
 * @author Remy
 *
 */
public class Sand extends Element implements ICollect {

	public static int HARDNESS = 1;
	
	
	public Sand(int X, int Y, String Type) {
		super(X, Y, Type);
		// TODO Auto-generated constructor stub
	}

	private Image spriteElement(){
		return null;
	}

	@Override
	public void collect() {
		// TODO Auto-generated method stub
		
	}
		
}
