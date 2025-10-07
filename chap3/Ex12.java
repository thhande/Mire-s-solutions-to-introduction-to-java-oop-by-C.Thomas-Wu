package chap3;

import java.util.Scanner;

public class Ex12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter weight in kilograms: ");
    double weight = sc.nextDouble();

    System.out.print("Enter height in centimeters: ");
    double heightCm = sc.nextDouble();

    double heightMeters = heightCm / 100.0;
    double bmi = weight / (heightMeters * heightMeters);

    System.out.println("Your BMI is: " + bmi);

    sc.close();
  }
}
