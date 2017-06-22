/**
 * 
 */
package model;

import java.util.ArrayList;

/**
 * @author remy
 * <H1> The IBoulderDashModel interface  </H1>
 *	She allows the use of the methods anywhere in the code thanks to Contract module.
 * 
 */
public interface IBoulderDashModel {

	
	// TODO Auto-generated constructor stub


	public Map getMap() ;

	public void setMap(Map map);

	public ArrayList<Element> getElement();


	public void buildMap( Map map);

	public void getLevel(Menu level);
	public void SetScore(Score score);
	public void GetScore(Score score);
}
