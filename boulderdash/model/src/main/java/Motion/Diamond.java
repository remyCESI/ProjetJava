/**
 * 
 */
package Motion;

import java.awt.Image;

import model.Element;
import model.ICollect;
import model.IKill;

/**
 * @author remy
 * <H1> the Diamond class</H1>
 *@see Element.
 */
public class Diamond extends Element implements IKill, ICollect {

	
	private static int HARDNESS = 1;

	
	public Diamond(int X, int Y, String Type) {
		
		super(X, Y, Type);
		// TODO Auto-generated constructor stub
	}

	
	public Image spriteElement(){
		return null;
		
	}

		/**
		 * she allows 
		 */
	@Override
	public void kill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collect() {
		// TODO Auto-generated method stub
		
	}

}
