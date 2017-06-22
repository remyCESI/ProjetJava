/**
 * 
 */
package Mobility;

import model.Element;

/**
 * @author Remy
 * <H1> the BehaviorMove class</H1>
 * she is the mother class of auto class, ctrlmove class, fixe move. 
 *
 */
public abstract class BehaviorMove {

	private Element element;
	public BehaviorMove() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * she is the mother method that will inherit the girls classes. 
	 * @param element
	 */
	public abstract void move(Element element);

}
