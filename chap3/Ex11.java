package chap3;

import java.util.Scanner;
import java.time.Year;

public class Ex11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your birth year: ");
    int birthYear = sc.nextInt();

    int currentYear = Year.now().getValue();
    int age = currentYear - birthYear;

    System.out.println("You were born in " + birthYear + " and will be (are) " + age + " this year.");

    sc.close();
  }
}
