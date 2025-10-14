package chap3;

import java.util.Scanner;

public class Ex23 {
  public static void main(String[] args) {
    final double K = 2.52E2; // Ms. Latte's constant
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number of comment lines (C): ");
    double C = input.nextDouble();

    System.out.print("Enter time spent (minutes, T): ");
    double T = input.nextDouble();

    System.out.print("Enter number of unclear-variable lines (V): ");
    double V = input.nextDouble();

    // Compute readability R
    double R = K * C * Math.pow(T, 2) / Math.pow(V, 3);

    System.out.printf("Program readability (R) = %.2f mocha\n", R);
    input.close();
  }
}
