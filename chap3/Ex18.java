package chap3;

import java.util.Scanner;

public class Ex18 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter coefficients A, B, and C
    System.out.print("Enter coefficient A: ");
    double A = input.nextDouble();

    System.out.print("Enter coefficient B: ");
    double B = input.nextDouble();

    System.out.print("Enter coefficient C: ");
    double C = input.nextDouble();

    // Calculate the discriminant
    double discriminant = Math.pow(B, 2) - 4 * A * C;

    // Calculate two real roots
    double x1 = (-B + Math.sqrt(discriminant)) / (2 * A);
    double x2 = (-B - Math.sqrt(discriminant)) / (2 * A);

    // Display the results
    System.out.printf("\nThe roots of the equation are:\n");
    System.out.printf("x1 = %.2f\n", x1);
    System.out.printf("x2 = %.2f\n", x2);

    input.close();
  }
}
