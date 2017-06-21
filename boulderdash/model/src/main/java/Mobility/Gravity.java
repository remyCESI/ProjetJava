/**
 * 
 */
package Mobility;

import model.Element;

/**
 * @author remy
 * <H1> The Gravity class </H1>
 * @see BehaviorMove
 */
public class Gravity extends BehaviorMove{

	/**
	 * The gravity method allows to down the specialized elements.
	 * As long as there are no elements under the rock or under the diamond, they are going to come down until the meeting of an obstacle. 
	 */
	public Gravity(Element element) {
		// TODO Auto-generated constructor stub
		while( ){
			
		element.setY(element.getY()+1);
		
		}
		
	}

	/**
	 * The move method allows grace has to Override, determine how to move.
	 * In this class, the elements will be gravity. for example the rock, they fall down until meeting an obstacle.
	 * @param element 
	 */
	
	@Override
	public void move(Element element) {
		// TODO Auto-generated method stub
		
	}

}
