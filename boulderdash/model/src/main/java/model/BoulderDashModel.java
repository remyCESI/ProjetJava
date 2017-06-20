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
	 * 
	 */
	public ArrayList<Element> getElement(){

		return null;

	}
	public void buildMap( Map map){

	}

	public void getLevel(Menu level){

	}
	public void SetScore(Score score){

	}
	public void GetScore(Score score){
		

	}

}






