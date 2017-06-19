package main;

import java.sql.SQLException;
import controller.ControllerFacade;
import model.*;
import view.*;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Groupe remy thibault pierre aurelien 
 * @version 1.0
 */

public abstract class Main {

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
        //new Menu();
        Game game1 = new Game();
    }
}
