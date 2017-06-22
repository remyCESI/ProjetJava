/**
 * 
 */
package Mobility;

import model.Element;

/**
 * @author Remy
 * 
 * <H1> Fixe class </h1>
 * @see BehaviorMove
 *
 */
public class Fixe extends BehaviorMove{

	public Fixe(Element element) {
		
		element.setX(element.getX());
		element.setY(element.getY());
		
	}

	/**
	 * The move method allows grace has to Override, determine how to move.
	 * In this class, the elements will be fixed. for example the wall.
	 * @param element 
	 */
	@Override
	public void move(Element element) {
		// TODO Auto-generated method stub
		
	}

}
