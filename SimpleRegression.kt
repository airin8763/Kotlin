import org.apache.commons.math3.stat.regression.SimpleRegression

fun main() {
    // Create an instance of SimpleRegression
    val regression = SimpleRegression()

    // Sample data points (x, y)
    val data = arrayOf(
        doubleArrayOf(1.0, 2.0),
        doubleArrayOf(2.0, 3.0),
        doubleArrayOf(3.0, 5.0),
        doubleArrayOf(4.0, 7.0),
        doubleArrayOf(5.0, 11.0)
    )

    // Add data points to the regression model
    for (point in data) {
        regression.addData(point[0], point[1])
    }

    // Get the slope and intercept of the regression line
    val slope = regression.slope
    val intercept = regression.intercept

    // Print the results
    println("Slope: $slope")
    println("Intercept: $intercept")

    // Predict a value
    val xToPredict = 6.0
    val predictedY = regression.predict(xToPredict)
    println("Predicted value at x = $xToPredict: $predictedY")
}