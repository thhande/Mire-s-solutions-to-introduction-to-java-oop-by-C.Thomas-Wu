package chap3;

import java.util.Scanner;

public class Ex10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter temperature in Fahrenheit: ");
    double fahrenheit = sc.nextDouble();

    double celsius = (5.0 / 9.0) * (fahrenheit - 32);
    System.out.println("Celsius: " + celsius);

    sc.close();
  }
}
