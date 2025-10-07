package chap3;

import java.util.Scanner;

public class Ex21 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter N: ");
    int N = input.nextInt();

    // Calculate Fibonacci using Binet's formula
    double sqrt5 = Math.sqrt(5);
    double phi = (1 + sqrt5) / 2; // Golden ratio
    double psi = (1 - sqrt5) / 2; // Conjugate

    double fibN = (Math.pow(phi, N) - Math.pow(psi, N)) / sqrt5;

    // Round to the nearest integer before displaying
    int result = (int) Math.round(fibN);

    System.out.println("The " + N + "th Fibonacci number is " + result);
  }
}
