/**
 * 
 */
package Motion;

import java.awt.Image;

import model.Element;
import model.ICollect;
import model.IKill;

/**
 * @author L1dien
 *
 */
public class Diamond extends Element implements IKill, ICollect {

	private static int HARDNESS = 1;
	public Diamond() {
		// TODO Auto-generated constructor stub
	}
	
	public Image spriteElement(){
		return null;
		
	}

	@Override
	public void kill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collect() {
		// TODO Auto-generated method stub
		
	}

}
