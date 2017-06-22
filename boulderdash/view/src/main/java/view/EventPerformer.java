/**
 * @author Thibault Rémy Aurélien Pierre
 * Transitions between an event and a key
 * @see IEventPerformer
 * @see IOrderPerformer
 */

package view;

import java.awt.event.KeyEvent;

public class EventPerformer implements gameFrame.IEventPerformer , IOrderPerformer {
/*il faut les types des parametres et verifier interface qui ?tait jpu2016.dogfightcontroller*/

	private IOrderPerformer orderPerformer;
    public EventPerformer(IOrderPerformer orderPerformer){
    
}

    
    public void eventPerform(KeyEvent keycode){
    }


	@Override
	public void eventPerform(KeyEvent keycode) {
		// TODO Auto-generated method stub
		
	}
    
}