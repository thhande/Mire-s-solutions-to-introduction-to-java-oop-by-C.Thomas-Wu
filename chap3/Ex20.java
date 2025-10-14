package chap3;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Ex20 {
  public static void main(String[] args) {
    GregorianCalendar cal;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the date of information, please be sure the format is MM/dd/yyyy");
    String input = scanner.nextLine();
    int month = Integer.parseInt(input.substring(0, 1));// because the format isMM/dd/yyyy so the month will be //
                                                        // inputsubstring from 0 to 1

    int day = Integer.parseInt(input.substring(3, 4));// likely the same with dayand year but with different index

    int year = Integer.parseInt(input.substring(6, 9));
    cal = new GregorianCalendar(year, month, day);
    SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
    System.out.println("Day of Week: " + sdf.format(cal.getTime()));
    scanner.close();
  }
}

// import java.util.*;
// import java.text.*;

// class Ch3FindDayOfWeek {
// public static void main(String[] args) {
// int year, month, day;
// GregorianCalendar cal;
// SimpleDateFormat sdf;

// Notice that we are allowing the user to enter the month as an integer between
// 1 and 12, so we need to subtract 1 from the entered data in creating a new
// GregorianCalendar object.
// 124 Chapter 3 Numerical Data
// Scanner scanner = new Scanner(System.in);
// scanner.useDelimiter(System.getProperty("line.separator"));
// System.out.print("Year (yyyy): ");
// year = scanner.nextInt();
// System.out.print("Month (1-12): ");
// month = scanner.nextInt();
// System.out.print("Day (1-31): ");
// day = scanner.nextInt();
// cal = new GregorianCalendar(year, month-1, day);
// sdf = new SimpleDateFormat("EEEE");
// System.out.println("");
// System.out.println("Day of Week: " + sdf.format(cal.getTime()));
// }
// }
