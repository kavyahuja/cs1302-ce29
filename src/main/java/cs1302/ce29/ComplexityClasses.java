package cs1302.ce29;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.chart.LineChart;
import javafx.scene.Scene;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.Arrays;

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

    /* Bound for the X-axis in the line chart. */
    private static final int X_START = 0;   // inclusive
    private static final int X_FINAL = 100; // exclusive

    /* Bound for the Y-axis in the line chart. */
    private static final int Y_FINAL = 100; // inclusive

    /* Last Problem Size */
    private static final int N = X_FINAL - X_START;

    /* Line chart for plots. */
    private LineChart<Number, Number> lc;

    /**
     * The entry point for the JavaFX application
     */
    public void start(Stage stage) {

        // Initialize the values for the x-axis (Problem Size)
	Integer[] x = IntStream.range(X_START, X_FINAL)
	    .mapToObj(i -> i)
	    .toArray(Integer[]::new);

        // Create initial line chart and add the constant time data series
        lc = ChartUtility.createChart(x, genData(x, n -> 10.0), "Size", "Operations", Y_FINAL, "Constant");
        lc.setTitle("Complexity Classes");

        // Add the linear time data series to the line chart
        ChartUtility.addSeries(lc, x, genData(x, n -> 1.0 * n), "Linear");

        Scene scene = new Scene(lc);
        scene.getStylesheets().add("chartStyle.css"); // use CSS to remove line symbols
        stage.setTitle("Complexity Classes");         // set app title
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
    } // start

    /**
     * Creates and populate an array of {@code Double} objects using an array of 
     * {@code Integer} objects as input. Each value in the created array is 
     * an element of the {@code Integer} array mapped to a {@code Double} via the 
     * specified {@code Function} object. The elements should be mapped in order.
     * For example, a call to
     * {@code<pre>
     *    genData(x, n -&#62; n + 10.0);
     * </pre>}
     * where {@code x = [0, 1]} would return {@code [10.0, 11.0]}. Each value in 
     * the new array is each {@code x} element plus {@code 10.0}, as defined by 
     * {@code f}. The new array should be the same length as {@code x}.
     *
     * @return the double array containing the mapped values
     * @param x the x-axis values to use when generating the data
     * @param f the function to map index values to doubles
     */
    public Double[] genData(Integer[] x, Function<Integer, Double> f) {
        // TODO: Implement Me!
        throw new UnsupportedOperationException("genData method not yet implemented");
    } // genData

} // ComplexityClasses
