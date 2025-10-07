package chap3;

import java.util.Scanner;

public class Ex28 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // --- Step 1: Input purchase price and amount tendered ---
    System.out.print("Enter purchase price (in cents): ");
    int purchasePrice = sc.nextInt();

    System.out.print("Enter amount tendered (in cents): ");
    int amountTendered = sc.nextInt();

    // --- Step 2: Compute change ---
    int change = amountTendered - purchasePrice;

    // --- Step 3: Break down into denominations ---
    int dollars = change / 100;
    change %= 100;

    int quarters = change / 25;
    change %= 25;

    int dimes = change / 10;
    change %= 10;

    int nickels = change / 5;
    change %= 5;

    int pennies = change;

    // --- Step 4: Display results ---
    System.out.printf("Purchase Price:   $ %.2f%n", purchasePrice / 100.0);
    System.out.printf("Amount Tendered:  $ %.2f%n", amountTendered / 100.0);

    System.out.println("\nChange is:");
    System.out.println(dollars + " Dollar bill(s)");
    System.out.println(quarters + " Quarter(s)");
    System.out.println(dimes + " Dime(s)");
    System.out.println(nickels + " Nickel(s)");
    System.out.println(pennies + " Penny(s)");

    System.out.println("\nThank you for your business. Come back soon.");

    sc.close();
  }
}
