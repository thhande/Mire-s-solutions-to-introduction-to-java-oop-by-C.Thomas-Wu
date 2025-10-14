package chap3;

import java.util.Scanner;

public class Ex24 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Sinput the number and calculate like the given char
    System.out.print(("enter the unit weight "));
    double unitWeight = scanner.nextDouble();
    System.out.print(("enter the number of unit "));
    double numberOfUnits = scanner.nextDouble();
    double totalPrice = unitWeight * numberOfUnits * 5.99;
    double totalPriceWithTax = totalPrice + totalPrice * 0.0725;
    System.out.println(("total price with tax is : " + totalPriceWithTax));// print the result
    scanner.close();
  }
}
