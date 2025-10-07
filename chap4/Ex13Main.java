package chap4;

import java.util.Scanner;

import chap4.Ex13.Seat;

public class Ex13Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // --- Step 1: Input tickets sold and prices ---
    System.out.print("Enter number of A seats sold: ");
    int numA = sc.nextInt();
    System.out.print("Enter price per A seat: ");
    float priceA = sc.nextFloat();
    Seat seatA = new Seat(priceA, numA, "A");

    System.out.print("Enter number of B seats sold: ");
    int numB = sc.nextInt();
    System.out.print("Enter price per B seat: ");
    float priceB = sc.nextFloat();
    Seat seatB = new Seat(priceB, numB, "B");
    System.out.print("Enter number of C seats sold: ");
    int numC = sc.nextInt();
    System.out.print("Enter price per C seat: ");
    float priceC = sc.nextFloat();
    Seat seatC = new Seat(priceC, numC, "C");

    // --- Step 2: Compute total sales ---
    double totalSales = seatA.tolSales() + seatB.tolSales() + seatC.tolSales();

    // --- Step 3: Display result ---
    System.out.printf("Total ticket sales: $%.2f%n", totalSales);

    sc.close();
  }
}
