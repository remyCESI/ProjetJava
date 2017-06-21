package main;

import controller.ControllerFacade;
import model.BoulderDashModel;

import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *The main method.
 *@author Tibo poly
 * @param args 
 * @version 1.0
 */
public abstract class Main {
    public static void main(final String[] args) {
        final ControllerFacade controller = new BoulderDashController(new BoulderDashView(), new BoulderDashModel());

        try {
            controller.start();
        } catch (final Exception exception) {
            exception.printStackTrace();
        }
    }

}
