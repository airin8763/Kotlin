Project Overview

This Kotlin project utilizes the Smile machine learning library to perform regression analysis on the Diabetes dataset. The model employs Gradient Tree Boosting along with cross-validation to evaluate its performance.

Requirements

Kotlin

Smile Library

Apache Commons CSV

Installation

Install Kotlin and required dependencies.

Add the Smile library to your project.

Ensure Apache Commons CSV is included.

Usage

Update the filePath variable in main() to point to your dataset (diabetes_dataset.csv).

Run the program to train and evaluate the regression model.

The output will display the results of the cross-validation.



 fit time: 2130.579 ms ± 193.021,
  score time: 19.237 ms ± 7.002,
  validation data size:: 1590 ± 2,
  RSS: 1.4335 ± 0.4716,
  MSE: 0.0009 ± 0.0003,
  RMSE: 0.0296 ± 0.0058,
  MAD: 0.0028 ± 0.0008,
  R2: 99.60% ± 0.13



o

