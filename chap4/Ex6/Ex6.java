package chap4.Ex6;

import java.util.Scanner;

public class Ex6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // --- Step 1: Input tickets sold and prices ---
    System.out.print("Enter number of A seats sold: ");
    int numA = sc.nextInt();
    System.out.print("Enter price per A seat: ");
    double priceA = sc.nextDouble();

    System.out.print("Enter number of B seats sold: ");
    int numB = sc.nextInt();
    System.out.print("Enter price per B seat: ");
    double priceB = sc.nextDouble();

    System.out.print("Enter number of C seats sold: ");
    int numC = sc.nextInt();
    System.out.print("Enter price per C seat: ");
    double priceC = sc.nextDouble();

    // --- Step 2: Compute total sales ---
    double totalSales = numA * priceA + numB * priceB + numC * priceC;

    // --- Step 3: Display result ---
    System.out.printf("Total ticket sales: $%.2f%n", totalSales);

    sc.close();
  }
}
