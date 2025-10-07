package chap3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex27 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // --- Step 1: Ask user for birthday in MM/DD/YYYY format ---
    System.out.print("Enter your birthday (MM/DD/YYYY): ");
    String input = sc.nextLine();

    // --- Step 2: Define the date format we expect ---
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    // --- Step 3: Parse the input string into a LocalDate object ---
    LocalDate birthday = LocalDate.parse(input, formatter);

    // --- Step 4: Get today's date ---
    LocalDate today = LocalDate.now();

    // --- Step 5: Calculate the difference in days ---
    long daysOld = ChronoUnit.DAYS.between(birthday, today);

    // --- Step 6: Output the result ---
    System.out.println("You are " + daysOld + " days old.");

    sc.close();
  }
}
