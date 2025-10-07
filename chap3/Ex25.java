package chap3;

import java.util.Scanner;

public class Ex25 {
  public static void main(String[] args) {
    // Create a Scanner object for reading user input
    Scanner scanner = new Scanner(System.in);

    System.out.println("--- Population Prediction Application (y = c * e^(k*x)) ---");

    // 1. Get Input Values

    // Year A and Population A (Used to find c)
    System.out.print("Enter Year A (Reference Year): ");
    int yearA = scanner.nextInt();

    System.out.print("Enter Population in Year A: ");
    long populationA = scanner.nextLong(); // Use long for large population figures

    // Year B and Population B (Used to find k)
    System.out.print("Enter Year B (Calibration Year, Year B > Year A): ");
    int yearB = scanner.nextInt();

    System.out.print("Enter Population in Year B: ");
    long populationB = scanner.nextLong();

    // Year C (Year for prediction)
    System.out.print("Enter Year C (Prediction Year): ");
    int yearC = scanner.nextInt();

    // Close the scanner after reading all inputs
    scanner.close();

    // Ensure Year B is after Year A
    if (yearB <= yearA) {
      System.err.println("\nError: Year B must be later than Year A to calculate growth rate (k).");
      return; // Exit the program on error
    }

    // --- Core Calculations ---

    // Step 1: Determine the constant 'c'
    // 'c' is the population when x = 0 (i.e., at the reference year, Year A).
    // Since x is the number of years after Year A, for Year A, x = 0.
    // y = c * e^(k * 0) => y = c * 1 => c = y.
    double c = populationA;
    System.out.println("\n1. Constant 'c' (Population in Year A): " + (long) c);

    // Step 2: Determine the growth constant 'k'

    // Calculate the time difference between Year A and Year B (delta_x)
    int deltaX_B = yearB - yearA;

    // Using the formula for Year B: Population_B = c * e^(k * deltaX_B)
    // Population_B / c = e^(k * deltaX_B)
    // ln(Population_B / c) = k * deltaX_B
    // k = (1 / deltaX_B) * ln(Population_B / c)

    double ratio = (double) populationB / c;
    // Check for non-positive or zero population ratio
    if (ratio <= 0) {
      System.err.println("\nError: Population ratio (Pop B / Pop A) must be positive and non-zero.");
      return;
    }

    double k = (1.0 / deltaX_B) * Math.log(ratio);
    System.out.printf("2. Growth Constant 'k': %.6f\n", k);

    // Step 3: Predict the population for Year C

    // Calculate the time difference between Year A and Year C (x_C)
    int x_C = yearC - yearA;

    // Use the final formula: y_C = c * e^(k * x_C)
    // Note: Math.exp(a) calculates e^a
    double predictedPopulation = c * Math.exp(k * x_C);

    // --- Output Result ---

    System.out.println("\n3. Predicted Population for Year C (" + yearC + ")");
    System.out.printf("   The predicted population is: %.0f\n", predictedPopulation);
    // Displaying as a long for a clean integer-like output
    System.out.println("   (Rounded to nearest integer: " + Math.round(predictedPopulation) + ")");

  }
}
