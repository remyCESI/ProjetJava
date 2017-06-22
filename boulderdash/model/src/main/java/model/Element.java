/**
 * 
 */
package model;

import java.awt.Image;

import Mobility.BehaviorMove;

/**
 * @author Remy
 *<H1> Element class </H1>
 *
 */
public abstract class Element implements IElement{

	private int X;
	private int Y;
	private String Type;
	private BehaviorMove behaviorMove;


	public Element(int X, int Y , String Type) {
		// TODO Auto-generated constructor stub

	}

	/*
	 *	It takes X
	 * @see model.IElement#getX()
	 * @return X
	 */
	public int getX() {
		return X;
	}
	/**
	 * initializes X 
	 * @param x
	 */
	public void setX(int x) {
		X = x;
	}
	/*
	 *	It takes Y
	 * @see model.IElement#getX()
	 * @return Y
	 */
	public int getY() {
		return Y;
	}
	/**
	 * initializes Y 
	 * @param y
	 */
	public void setY(int y) {
		Y = y;
	}
	/**
	 * she allows to collect the element type 
	 * @return Type
	 */
	public String getType() {
		return Type;
	}
	/**
	 * she initializes the element type. 
	 * @param type.
	 */
	public void setType(String type) {
		Type = type;
	}
	/**
	 * she allows to recover the images.
	 * @param image
	 * @return image 
	 */
	public Image getImage(Image image){
		return image;	
	}
	/**
	 * she recovered the sprite element
	 * @param image
	 * @return image
	 */
	public Image getSpriteElement(Image image){
		return image;
	}
	
	/**
	 * 
	 */
	public void getBehaviorMove(BehaviorMove behaviorMove)
	{
		return;
	}
}
