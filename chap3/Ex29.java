package chap3;

import java.util.Scanner;

public class Ex29 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // --- Step 1: Input number of bags ordered ---
    System.out.print("Enter number of bags ordered: ");
    int bags = sc.nextInt();

    // --- Step 2: Compute bag cost ---
    double bagCost = bags * 143.00;

    // --- Step 3: Compute boxes needed ---
    int large = bags / 20;
    bags %= 20;

    int medium = bags / 10;
    bags %= 10;

    int small = bags / 5;
    bags %= 5;

    // If leftover bags remain, they still need a small box
    if (bags > 0) {
      small++;
    }

    // --- Step 4: Compute box cost ---
    double boxCost = large * 1.20 + medium * 1.00 + small * 0.60;

    // --- Step 5: Compute total cost ---
    double totalCost = bagCost + boxCost;

    // --- Step 6: Display results ---
    System.out.printf("Number of Bags Ordered: %d = $ %.2f%n", (large * 20 + medium * 10 + small * 5), bagCost);
    System.out.println("Boxes Used:");
    System.out.println(large + " Large   - $1.20 each");
    System.out.println(medium + " Medium  - $1.00 each");
    System.out.println(small + " Small   - $0.60 each");

    System.out.printf("%nYour total cost is: $ %.2f%n", totalCost);

    sc.close();
  }
}
