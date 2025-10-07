package chap3;

import java.util.Scanner;

public class Ex26 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // --- Step 1: Ask for loan details ---
    System.out.print("Enter loan amount: ");
    double loanAmount = sc.nextDouble();

    System.out.print("Enter annual interest rate (as %): ");
    double annualRatePercent = sc.nextDouble();

    System.out.print("Is this (1) Stated Annual Rate or (2) Effective Annual Rate? Enter 1 or 2: ");
    int choice = sc.nextInt();

    System.out.print("Enter loan period in years: ");
    int years = sc.nextInt();

    // --- Step 2: Convert annual rate to decimal form ---
    double annualRate = annualRatePercent / 100.0; // e.g. 9% → 0.09

    // --- Step 3: Compute monthly rate depending on choice ---
    double monthlyRate;
    if (choice == 1) {
      // If user entered Stated Annual Rate (AR)
      monthlyRate = annualRate / 12.0;
    } else {
      // If user entered Effective Annual Rate (EAR)
      monthlyRate = Math.pow(1 + annualRate, 1.0 / 12.0) - 1;
    }

    // --- Step 4: Compute number of months ---
    int months = years * 12;

    // --- Step 5: Use amortization formula to compute monthly payment ---
    // Formula: P = (L * r) / (1 - (1 + r)^(-n))
    // L = loan amount, r = monthly interest rate, n = number of months
    double monthlyPayment;
    if (monthlyRate == 0) {
      // Special case: zero interest loan
      monthlyPayment = loanAmount / months;
    } else {
      monthlyPayment = (loanAmount * monthlyRate) /
          (1 - Math.pow(1 + monthlyRate, -months));
    }

    // --- Step 6: Compute total payment ---
    double totalPayment = monthlyPayment * months;

    // --- Step 7: Display results ---
    System.out.printf("Monthly Interest Rate: %.6f%n", monthlyRate);
    System.out.printf("Monthly Payment: %.2f%n", monthlyPayment);
    System.out.printf("Total Payment: %.2f%n", totalPayment);

    sc.close();
  }
}
