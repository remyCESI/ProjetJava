/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.Observable;


/**
 * @author remy
 * <H1>BoulderDashModel Class</H1>
 * 
 *
 */
public class BoulderDashModel extends Observable implements IBoulderDashModel{

	private Map map; 
	private Menu level;
	private Score score;

	/**
	 * 
	 */
	public BoulderDashModel() {
		// TODO Auto-generated constructor stub
	}
/**
 * She allows to retrieve the map choice. 
 * @return map choice.
 */
	public Map getMap() {
		return map;
	}
	/**
	 * She allows to choice the map. 
	 * 
	 */
	public void setMap(Map map) {
		this.map = map;
	}

	/**
	 * she allows to collect a element list
	 * 
	 */
	public ArrayList<Element> getElement(){

		return null;

	}
	/**
	 * she is used for create an environment based on a map. 
	 * @param map   
	 */
	public void buildMap( Map map){

	}
	/**
	 * she allows to take the level choice
	 * @param level
	 */

	public void getLevel(Menu level){

	}
	
	/**
	 * she go to update the score. 
	 * @param score
	 */
	public void SetScore(Score score){

	}
	
	/**
	 * she allows to take the score
	 * @param score.
	 */
	public void GetScore(Score score){
		

	}

}






