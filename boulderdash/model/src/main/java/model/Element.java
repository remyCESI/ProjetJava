/**
 * 
 */
package model;

import java.awt.Image;

import Mobility.BehaviorMove;

/**
 * @author Remy
 *
 */
public abstract class Element implements IElement{

	private int X;
	private int Y;
	private String Type;
	private BehaviorMove behaviorMove;

	public Element() {
		// TODO Auto-generated constructor stub

	}
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public Image getImage(Image image){
		return image;	
	}
	public Image getSpriteElement(Image image){
		return image;
	}
	public void getBehaviorMove(BehaviorMove behaviorMove)
	{
		return;
	}
}
