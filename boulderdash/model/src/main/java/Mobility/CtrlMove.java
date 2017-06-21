/**
 * 
 */
package Mobility;

import java.awt.Image;

import model.Element;

/**
 * @author remy
 *<H1> CtlrMove class </h1>
 *
 *we use this class for player because there are defined controls 
 *@see BehaviorMove
 */
public class CtrlMove extends BehaviorMove {

	/**
	 * 
	 */
	public CtrlMove() {
		// TODO Auto-generated constructor stub

	}
	/**
	 *@param element 
	 */

	@Override
	public void move(Element element) {
		// TODO Auto-generated method stub


	}
	/**
	 * she allows the left move by changing the geometric coordinates
	 * x= x-1
	 */

	public void moveLeft(Element element){
		if(element.getX() != 0){

			element.setX(element.getX()-1);
		}
		else {

			element.setX(element.getX());
		}
		

	}
	/**
	 * she allows the right move by changing the geometric coordinates
	 * x= x+1
	 * 
	 */
	public void moveRight(Element element){

		if(element.getX() != 0){

			element.setX(element.getX()+1);
		}
		else {

			element.setX(element.getX());
		}


	}
	/**
	 * she allows the right move by changing the geometric coordinates
	 * y=y-1
	 */
	public void moveUp(Element element){

		if(element.getY() != 0){

			element.setY(element.getY()-1);
		}
		else {

			element.setY(element.getY());
		}


	}
	/**
	 * she allows the right move by changing the geometric coordinates
	 * y=y+1
	 */

	public void moveDown(Element element){

		if(element.getY()!= 500){

			element.setY(element.getY()+1);
		}
		else {

			element.setY(element.getY());
		}

	}


}
