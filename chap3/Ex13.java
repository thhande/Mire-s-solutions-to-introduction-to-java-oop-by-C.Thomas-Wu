package chap3;

import java.util.Scanner;

public class Ex13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter principal (P): ");
    double P = sc.nextDouble();

    System.out.print("Enter rate (R) in percent: ");
    double R = sc.nextDouble();

    System.out.print("Enter number of years (N): ");
    int N = sc.nextInt();

    double amount = P * Math.pow(1 + R / 100, N);

    System.out.println("Amount after " + N + " years: " + amount);

    sc.close();
  }
}
