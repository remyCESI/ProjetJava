/**
 * 
 */
package Motion;

import java.awt.Image;

import model.Element;
import model.IDeath;
import model.IPushRock;

/**
 * @author Remy
 *
 */
public class Player extends Element implements IPushRock, IDeath{
	
	public static int HARDNESS = 2 ;

	
	
	public Player(int X, int Y, String Type) {
		super(X, Y, Type);
		// TODO Auto-generated constructor stub
	}

	private Image spriteElement(){
		
		return null;
		
	}

	@Override
	public void dead() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void push() {
		// TODO Auto-generated method stub
		
	}
	
	

}
