/**
 * 
 */
package Motion;

import java.awt.Image;

import model.Element;
import model.IDeath;
import model.IKill;

/**
 * @author Remy
 *
 */
public class Enemy extends Element implements IDeath, IKill{

	public static int HARDNESS =3;

	/**
	 * 
	 */
	public Enemy() {
		// TODO Auto-generated constructor stub
	}
	private Image spriteElement(){

		return null;

	}

	public void drop(){

	}
	@Override
	public void dead() {
		// TODO Auto-generated method stub

	}
	@Override
	public void kill() {
		// TODO Auto-generated method stub
		
	}


}
