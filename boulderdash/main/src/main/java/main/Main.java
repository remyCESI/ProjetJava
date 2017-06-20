package main;



import controller.ControllerFacade;
import model.BoulderDashModel;

import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *


 * @author Groupe remy thibault pierre aurelien 
coucou
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        final ControllerFacade controller = new BoulderDashController(new BoulderDashView(), new BoulderDashModel());

        try {
            controller.start();
        } catch (final Exception exception) {
            exception.printStackTrace();
        }
    }

}
