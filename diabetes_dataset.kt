import smile.data.formula.Formula
import smile.io.Read
import smile.validation.CrossValidation
import smile.regression.GradientTreeBoost
import org.apache.commons.csv.CSVFormat

fun main() {
    // Load the dataset
    val filePath = "C:\\Users\\AIRIN AKTER\\kotlin-for-data-science\\frameworks\\frameworks\\src\\main\\resources\\diabetes_dataset.csv"
    val dataset = Read.csv(filePath, CSVFormat.DEFAULT.withFirstRecordAsHeader())

    // Define the formula for regression (assuming 'Outcome' is the target variable)
    val formula = Formula.lhs("Outcome")

    // Perform cross-validation
    val res = CrossValidation.regression(
        6, formula, dataset
    ) { f, data -> GradientTreeBoost.fit(f, data) }

    // Print results
    println(res)
}
