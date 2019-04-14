package cs1302.ce29;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.chart.LineChart;
import javafx.scene.Scene;
import java.util.function.Function;

/**
 * A JavaFX application containing a {@code LineChart} with series for each of the following
 * complexity classes: <br>
 *  - Constant Time <br>
 *  - Logarithmic Time <br>
 *  - Linear Time <br>
 *  - Linearithmic Time (nlogn) <br>
 *  - Quadratic Time <br>
 *  - Cubic Time <br>
 *  - Exponential Time <br>
 *  - Factorial Time <br>
 */
public class ComplexityClasses extends Application {

    /** Problem size (size of the array) */
    private static final int N = 100;

    /** Bound for the Y-axis in the LineChart */
    private static final int Y_BOUND = 10000;

    /** Line chart for plots. */
    private LineChart<Number, Number> lc;

    /**
     * The entry point for the JavaFX application
     */
    public void start(Stage stage) {

        // Initialize the values for the x-axis (Problem Size)
	Integer[] x  = new Integer[N];
        for(int i = 0; i < x.length; i++) {
            x[i] = i;
        } // for

        // Constant Time Example
	Double[] y = genData(N, val -> 10.0);

        // Create initial line chart and add the constant time data series
        lc = ChartUtility.createChart(x, y, "Size", "Operations", Y_BOUND, "Constant");
        lc.setTitle("Complexity Classes");

        // Add the linear time data series to the line chart
        ChartUtility.addSeries(lc, x, genData(N, val->val.doubleValue()), "Linear");

        // linearithmic

        // exponential

        // logarithmic

        // quadratic

        // cubic

        Scene scene = new Scene(lc);
        scene.getStylesheets().add("chartStyle.css"); // use CSS to remove line symbols
        stage.setTitle("Complexity Classes");         // set app title
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    } // start

    /**
     * A method to create and populate an array of {@code Double} objects of a particular size.
     * Each value in the array is its index value mapped to a double value by the specified
     * {@code Function} object.
     * For example, a call to
     * <pre>
     *    genData(2, val -&#62; val.doubleValue() + 10.0);
     * </pre>
     * Would return [10.0, 11.0]. Each value in the array of size 2 is its index value + 10.0 as
     * defined by {@code f}.
     *
     * @return the double array containing the mapped index values
     * @param size the size of the array to create
     * @param f the function to map index values to doubles
     */
    public Double[] genData(int size, Function<Integer, Double> f) {
        // TODO: Implement Me!
	throw new UnsupportedOperationException("not yet implemented");
    } // genData

} // ComplexityClasses
