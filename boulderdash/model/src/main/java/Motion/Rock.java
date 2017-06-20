/**
 * 
 */
package Motion;

import java.awt.Image;

import model.Element;
import model.IKill;

/**
 * @author Remy
 *
 */
public class Rock extends Element implements IKill {
	
	public static int HARDNESS = 4;
	

	/**
	 * 
	 */
	
	
	private Image spriteElement(){
		return null;
		
	}
	public Rock(int X, int Y, String Type) {
		super(X, Y, Type);
		// TODO Auto-generated constructor stub
	}
	public void collect(){
		
	}

	@Override
	public void kill() {
		// TODO Auto-generated method stub
		
	}

}
