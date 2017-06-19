/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.Observable;


/**
 * @author remy
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

	public Map getMap() {
		return map;
	}
	public void setMap(Map map) {
		this.map = map;
	}

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






