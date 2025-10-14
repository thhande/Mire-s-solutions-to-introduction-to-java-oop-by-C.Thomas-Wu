package chap4.Ex7;

import java.util.Scanner;

public class Ex7Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Temperature temp = new Temperature();

    // --- Step 1: Input Fahrenheit ---
    System.out.print("Enter temperature in Fahrenheit: ");
    double f = sc.nextDouble();

    // --- Step 2: Store and convert ---
    temp.setFahrenheit(f);

    // --- Step 3: Output Celsius ---
    System.out.printf("Equivalent in Celsius: %.2f%n", temp.toCelsius());

    sc.close();
  }
}
