/**
 * 
 */
package model;

import java.awt.Image;

import Mobility.BehaviorMove;

/**
 * @author L1dien
 *
 */
public interface IElement {
	
	public int getX(); 
	public void setX(int x) ;
	public int getY(); 
	public void setY(int y) ;
	public String getType() ;
	
	public void setType(String type) ;
	public Image getImage(Image image);
	public Image getSpriteElement(Image image);
	public void getBehaviorMove(BehaviorMove behaviorMove);

}
