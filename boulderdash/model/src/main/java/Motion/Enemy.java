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
	
	private Image spriteElement(){

		return null;

	}

	public Enemy(int X, int Y, String Type) {
		super(X, Y, Type);
		// TODO Auto-generated constructor stub
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
