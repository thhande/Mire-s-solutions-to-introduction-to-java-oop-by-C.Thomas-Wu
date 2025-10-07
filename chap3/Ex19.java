package chap3;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ex19 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Ask user for start date
    System.out.println("Enter the start date of the semester:");
    System.out.print("Year: ");
    int startYear = input.nextInt();
    System.out.print("Month (1-12): ");
    int startMonth = input.nextInt() - 1; // Months in Calendar start from 0
    System.out.print("Day: ");
    int startDay = input.nextInt();

    // Ask user for end date
    System.out.println("\nEnter the end date of the semester:");
    System.out.print("Year: ");
    int endYear = input.nextInt();
    System.out.print("Month (1-12): ");
    int endMonth = input.nextInt() - 1;
    System.out.print("Day: ");
    int endDay = input.nextInt();

    // Create GregorianCalendar objects
    GregorianCalendar startDate = new GregorianCalendar(startYear, startMonth, startDay);
    GregorianCalendar endDate = new GregorianCalendar(endYear, endMonth, endDay);

    // Calculate the number of days between the two dates
    long diffMillis = endDate.getTimeInMillis() - startDate.getTimeInMillis();
    long diffDays = diffMillis / (1000 * 60 * 60 * 24);// transfer mils to days milis/1000 ->
                                                       // s/60->min/60->hours/24->days

    // Display result
    System.out.println("\nNumber of days in the semester: " + diffDays);

    input.close();
  }
}
