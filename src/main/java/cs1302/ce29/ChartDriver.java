package cs1302.ce29;

import javafx.application.Application;

public class ChartDriver {

    public static void main(String[] args) {
        try {
            Application.launch(ComplexityClasses.class, args);
        } catch (UnsupportedOperationException e) {
            System.err.println(e);
            System.err.println("Likely due to X11 timeout. Logout and log back in...");
            System.exit(1);
        } // try
    } // main

} // ChartDriver
