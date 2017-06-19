/**
 * 
 */
package model;

import java.util.ArrayList;

/**
 * @author L1dien
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
