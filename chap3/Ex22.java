package chap3;

import java.util.Scanner;

public class Ex22 {
  public static void main(String[] args) {
    final double G = 6.67E-8; // gravitational constant in dyn·cm²/g²
    Scanner input = new Scanner(System.in);

    System.out.print("Enter mass of first body (grams): ");
    double m1 = input.nextDouble();

    System.out.print("Enter mass of second body (grams): ");
    double m2 = input.nextDouble();

    System.out.print("Enter distance between the two bodies (cm): ");
    double d = input.nextDouble();

    // Compute force using Newton's law of gravitation
    double F = G * (m1 * m2) / Math.pow(d, 2);

    System.out.printf("The gravitational force is %.3E dynes\n", F);
    input.close();
  }
}
