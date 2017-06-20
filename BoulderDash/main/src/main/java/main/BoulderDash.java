package main;

import javax.swing.*;
import view.*;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Groupe remy thibault pierre aurelien 
 * @version 1.0
 */

public class BoulderDash {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws Exception 
     */
    public static void main(final String[] args) throws Exception {
        /*final ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
		new imgLoader();*/
        new Game();
        
        /*SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            	GFrame view = new GFrame();
            }
        });*/
    }
}
