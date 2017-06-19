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
	public Rock() {
		// TODO Auto-generated constructor stub
	}
	
	private Image spriteElement(){
		return null;
		
	}
	public void collect(){
		
	}

	@Override
	public void kill() {
		// TODO Auto-generated method stub
		
	}

}
