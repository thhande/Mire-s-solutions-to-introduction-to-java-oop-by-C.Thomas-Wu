package chap3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex30 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // --- Step 1: Input number of bags ---
    System.out.print("Enter number of bags ordered: ");
    int bags = sc.nextInt();
    sc.nextLine(); // consume newline

    // --- Step 2: Input order date ---
    System.out.print("Enter order date (MM/dd/yyyy): ");
    String dateInput = sc.nextLine();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    LocalDate orderDate = LocalDate.parse(dateInput, formatter);

    // --- Step 3: Compute bag cost ---
    double bagCost = bags * 143.00;

    // --- Step 4: Compute boxes (assume Large=20, Medium=10, Small=5) ---
    int large = bags / 20;
    bags %= 20;

    int medium = bags / 10;
    bags %= 10;

    int small = bags / 5;
    bags %= 5;

    if (bags > 0) {
      small++;
    }

    // --- Step 5: Compute box cost ---
    double boxCost = large * 1.20 + medium * 1.00 + small * 0.60;
    double totalCost = bagCost + boxCost;

    // --- Step 6: Compute expected arrival date (14 days later) ---
    LocalDate arrivalDate = orderDate.plusDays(14);

    // --- Step 7: Display results ---
    System.out.printf("Number of Bags Ordered: %d - $%.2f%n", (large * 20 + medium * 10 + small * 5), bagCost);
    System.out.println("Boxes Used:");
    System.out.printf("  %d Large = $%.2f%n", large, large * 1.20);
    System.out.printf("  %d Medium = $%.2f%n", medium, medium * 1.00);
    System.out.printf("  %d Small = $%.2f%n", small, small * 0.60);

    System.out.printf("Your total cost is $%.2f%n", totalCost);

    // Format dates nicely (e.g., November 1, 2008)
    DateTimeFormatter pretty = DateTimeFormatter.ofPattern("MMMM d, yyyy");
    System.out.println("Order Date: " + orderDate.format(pretty));
    System.out.println("Expected Date of Arrival: " + arrivalDate.format(pretty));

    sc.close();
  }
}
