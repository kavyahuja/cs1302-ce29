# cs1302-ce29 Complexity Classes

![Approved for: Fall 2019](https://img.shields.io/badge/Approved%20for-Fall%202019-brightgreen)

In this class exercise, you will gain a deeper understanding of the notable complexity classes by plotting 
the functions using a JavaFX `LineChart`. By the end of the exercise, your application should show all of
the notable complexity classes in the `LineChart`. The final product should look similar to the image below.

![`Final Product`](https://github.com/cs1302uga/cs1302-ce29/raw/master/Final.png)

## Course-Specific Learning Outcomes
* **LO3.d:** Apply pair-programming principles in a software-based project.
* **LO5.a:** Utilize a version control tool such as Git or Subversion to store 
and update source code in a multi-programmer software solution.
* **LO6.c:** (Partial) Implement, analyze, and assess combinations of searching/sorting 
algorithms such as linear search, binary search, quadratic sorts, and linearithmic sorts.

## References and Prerequisites

* [`CSCI 1302 Big-O Tutorial`](http://cobweb.cs.uga.edu/~mec/cs1302-bigo/)
* Java Generics
* Lambda Expressions
* A basic understanding of JavaFX and the `LineChart` class.

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. **Let's do some pair programming!** Team up with one other person and make sure you only have one 
   laptop out. We recommend that use Comte de Rochambeau's technique to determine who gets to
   be the driver.

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce29`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-ce29.git
   ```

1. Change into the `cs1302-ce29` directory that was just created and look around. There should be
   multiple Java files contained within the directory structure. To see a listing of all of the 
   files under the `src` subdirectory, use the `find` command as follows:
   
   ```
   $ find src
   ```
   
1. You should also notice the provided `pom.xml` and `Makefile`. The `Makefile` may be used to compile 
   and run your code. However, the code will not run correctly at this time.
   
## Exercise Steps

1. While looking in the `src` directory, you likely saw a file called `ChartUtility.java`. 
   This file contains a utility class with some helpful methods for creating JavaFX line charts.
   Using the provided methods will allow you to focus on plotting the complexity class functions
   instead of the details of how to build a line chart.
   
   Take a few minutes to familiarize yourselves with the documentation for these methods 
   using the documentation found here: 
   [Chart Utility](http://cobweb.cs.uga.edu/~mec/cs1302-ce29-doc/)

1. Take a few more minutes to read through `ComplexityClasses.java`. This file contains a `start` method
   which does the following:
   * Creates a JavaFX `LineChart` and adds a data series representing a constant (`O(1)`) function using 
     the `createChart` method of `ChartUtility`.
   * Adds a series representing a linear (`O(n)`) function using the `addSeries` method of `ChartUtility`. 
   * Sets up the scene, and adds the scene to the stage. 
   
1. Pair Program:

   * **Current Pair Programming Driver (person typing)**: Open the `ComplexityClasses.java` file
     and implement the `genData` method. Read the associated Javadoc (including the example) along 
     with the example usage of `genData` in the `start` method of `ComplexityClasses` to guide 
     your implementation.
   
   * **Current Pair Programming Rider**: Stay actively engaged with your group member while
     they are working. Offer suggestions and point out typos or logical errors as they work. 
   
1. Once you complete `genData`, execute the `make` command to compile and run your code. If you 
   notice that the plots are close to the bottom of the graph, you may need to decrease the 
   `Y_FINAL` variable in `ComplexityClasses.java`. Try a few different values to get the plot
   to clearly show the plot lines.

1. After you've confirmed that the code compiles, runs, and shows a nice looking plot, add and 
   commit your changes to the local repository.

**CHECKPOINT**

1. **Swap drivers.** Call the `addSeries` method of `ChartUtility` to plot the following 
   linear functions for `0 <= n <= 100`.

   * `1.0 * n + 2.0`
   * `1.2 * n + 1.0`
   * `1.4 * n - 1.0`
   * `1.6 * n`
   
   Use `make` to compile and run the code. After you've confirmed that it compiles and runs (and shows
   a nice looking plot), add and commit your changes to the local repository.
   
   **Write the answers to the following questions in your notes:** 
      1. If you increase `X_FINAL` to `500` and `Y_FINAL` to `10000`, what do you observe?
      1. If you increase `Y_FINAL` to `20000`, what do you observe?

1. Change `X_FINAL` and `Y_FINAL` back to `100`.

1. **Swap drivers.** Call the `addSeries` method of `ChartUtility` to plot the following 
   quadratic functions for `0 <= n <= 100` in addition to any previous functions plotted.

   * `Math.pow(n, 2.0) + 2.0 * n - 1.0`
   * `2.0 * Math.pow(n, 2.0) + 1.5 * n + 2.0`
   * `1.5 * Math.pow(n, 2.0) + 2.0 * n - 3.0`
   * `Math.pow(n, 2.0) + 42.0`
   
   Use `make` to compile and run the code. After you've confirmed that it compiles and runs (and shows
   a nice looking plot), add and commit your changes to the local repository.
   
   **QUESTION (answer in your notes):** As you increase `Y_FINAL`, do these functions group together or 
   separate more when compared to:
   
   * each other?
   * the linear functions?
   
**CHECKPOINT**
 
1. **Swap drivers.** Call the `addSeries` method of `ChartUtility` to plot the following 
   cubic functions for `0 <= n <= 100` in addition to any previous functions plotted.

   * `1.1 * Math.pow(n, 3.0) + 1.3 * n - 4.0`
   * `2.2 * Math.pow(n, 3.0) + 1.5 * n + 2.0`
   * `1.5 * Math.pow(n, 3.0) + n - 3.5`
   * `Math.pow(n, 3.0) - 42.0`
   
   Use `make` to compile and run the code. After you've confirmed that it compiles and runs (and shows
   a nice looking plot), add and commit your changes to the local repository.
   
   **QUESTION (answer in your notes):** As you increase `Y_FINAL`, do these functions group 
   together or separate more when compared to:
   
   * each other?
   * the quadratic functions?
   * the linear functions?
   
1. **Swap drivers.** Call the `addSeries` method of `ChartUtility` to plot the following 
   exponential functions for `0 <= n <= 100` in addition to any previous functions plotted.

   * `Math.pow(2.0, n) + Math.pow(n, 2.0)`
   * `Math.pow(1.5, n) + 32.0`
   * `Math.pow(1.3, n) + n`
   * `2.0 * Math.pow(1.2, n) - 0.5 * Math.pow(n, 3.0)`
   
   Use `make` to compile and run the code. After you've confirmed that it compiles and runs (and shows
   a nice looking plot), add and commit your changes to the local repository.
   
   **QUESTION (answer in your notes):** As you increase `Y_FINAL`, do these functions group together 
   or separate more when compared to:
   
   * each other?
   * the cubic functions?
   * the quadratic functions?
   * the linear functions?
   
1. **QUESTION (answer in your notes):** What do you think the instructors are tying to get you to see 
   with all these plots?
   
**CHECKPOINT**

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
